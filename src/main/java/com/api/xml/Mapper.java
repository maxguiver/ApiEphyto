package com.api.xml;

import lombok.Data;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType;

import javax.validation.constraints.*;
import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@Data

public class Mapper {

	private Fitosanitario certificado;
    private Config config;
    private String version;
    private String tipo;
    private List<String> errores = new ArrayList<>();
    private int excepciones = 0;
    private Logger logger = Logger.getLogger("ephyto");
    private static final String EL_CAMPO = "El campo '";
    private static final String CON_VALOR = "' con valor '";

    private static final String [] codesWeight = {"GRM", "LBR", "MGM", "ONZ","QT","TNE","STN"};
    private static final String [] codesVolume = {"A93", "CMQ", "FTQ", "GLL","KMQ","LTR"};
    private static final String [] codesPaisDestino = {"US"};

    public Mapper(String tipo){
        this.tipo = tipo;
    }

    private void mapear(Object ob, String prefijo) throws IllegalAccessException, NoSuchFieldException, InstantiationException, ParseException, DatatypeConfigurationException {
        Class clase = ob.getClass();
        // System.out.println(prefijo);
        //Si no es un objeto complejo. Entonces es un String, Integer, etc. No es necesario mapear
        if(!isObject(clase) || clase.isInterface()){
            return;
        }

        //Si no es required
        if(!(ob.getClass().isAnnotationPresent(XmlElement.class)
                && ob.getClass().getAnnotation(XmlElement.class).required())){

            // Si no existe un mappeo entonces no generar el tag
            if(!existeMapping(prefijo)){
                return;
            }
        } else {
            // Si no existe un mappeo entonces no generar el tag
            if(!existeMapping(prefijo)){
                addNullMessage(ob.getClass().getName());
                return;
            }
        }
        // Por cada atributo del 'ob' en cuestión se debe procesar y obtener los valores
        for(Field field: clase.getDeclaredFields()){
            procesarAtributo(field, ob, prefijo);
        }
    }

    private boolean existeMapping(String prefijo){
        //Set<Object> keys = config.getAllKeys();
        Set<Object> keys = (Set<Object>) config.getAllKeys();
        for(Object k:keys){
            String key = (String)k;
            if( key.contains(prefijo + ".") || key.contains(prefijo + "[") || key.equals(prefijo)){
                // Si el certificado es Export no debe incluir los campos requeridos para Re-Export
                if( certificado.getTipoCertificado().equals("851") && config.get(key).startsWith("REEXPORT:")){
                    return false;
                } else if( certificado.getTipoCertificado().equals("657") && config.get(key).startsWith("EXPORT:") ){
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Procesa el atributo. Verifica el tipo de Clase
     * @param field Atributo de 'ob' que se está procesando
     * @param ob Referencia al Objecto cuyo 'field' se esta analizando para realizar operaciones set sobre este
     * @param prefijo Se utiliza para identificar de manera unica a los atributos del certificado. Ej.: spsExchangedDocument.id.value
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ParseException
     * @throws DatatypeConfigurationException
     */
    private void procesarAtributo(Field field, Object ob, String prefijo) throws NoSuchFieldException, IllegalAccessException, InstantiationException, ParseException, DatatypeConfigurationException {
        checkId(field, ob);

        String siguientePrefijo = (prefijo.equals("") ? "" : (prefijo + ".")) + field.getName();
        //Si es un listado
        if(List.class.isAssignableFrom(field.getType())){
            if(!existeMapping(siguientePrefijo)){
                return;
            }
            field.setAccessible(true);
            field.set(ob, procesarLista(field, siguientePrefijo));
            return;
        }

        //Si no es required
        if(!(field.isAnnotationPresent(XmlElement.class)
                && field.getAnnotation(XmlElement.class).required())){

            // Si no existe un mappeo entonces no generar el tag
            if(!existeMapping(siguientePrefijo)){
                return;
            }
        } else {
            // Si no existe un mappeo entonces no generar el tag
            if(!existeMapping(siguientePrefijo)){
                addNullMessage(field.getName());
                return;
            }
        }


        String atributoCertificado = config.get(siguientePrefijo);
        //Si el atributo del xml está mapeado a un atributo del certificado
        //se obtiene el valor y se setea a la instancia
        if(atributoCertificado != null){
            Object fieldValue = getFieldValue(atributoCertificado);
            field.setAccessible(true);
            fieldValue = transform(field, fieldValue);
            if(field.getType().isEnum() && fieldValue != null){
                fieldValue = getEnumValue(field, fieldValue);
            }
            field.set(ob, fieldValue);
            return;
        }

        //Solo se genera el tag correspondiente al acuerdo del Certificado
        generarTag(field, ob, siguientePrefijo);
    }

    private void generarTag(Field field, Object ob, String prefijo) throws DatatypeConfigurationException, NoSuchFieldException, InstantiationException, ParseException, IllegalAccessException {
        if(isObject(field.getType())){
            setField(field, ob, prefijo);
        }
    }


    private void setField(Field field, Object ob, String prefijo) throws IllegalAccessException, InstantiationException, NoSuchFieldException, ParseException, DatatypeConfigurationException {
        field.setAccessible(true);
        field.set(ob, field.getType().newInstance());
        mapear(field.get(ob), prefijo);
    }

    /**
     * Si el elemento tiene el atributo id agrega a la instancia
     * @param field
     * @param ob
     * @throws IllegalAccessException
     */
    private void checkId(Field field, Object ob) throws IllegalAccessException {
        if(field.isAnnotationPresent(XmlAttribute.class) &&
                field.getAnnotation(XmlAttribute.class).name().equals("id")){
            field.setAccessible(true);
            field.set(ob, field.getDeclaringClass().getSimpleName().toUpperCase());
        }
    }

    private List<Object> procesarLista(Field field,String siguientePrefijo) throws NoSuchFieldException, IllegalAccessException, InstantiationException, ParseException, DatatypeConfigurationException {
        Type tipo = field.getGenericType();
        ParameterizedType pType = (ParameterizedType) tipo;
        List<Object> objectList = null;
        int size = 1;
        // Si el listado esta declarado como default:
        if (config.get(siguientePrefijo) != null){
            if (!config.get(siguientePrefijo).equals("default")) {
                // Si se especifica un objeto para la lista
                objectList = (List<Object>) getFieldValue(config.get(siguientePrefijo));
                size = objectList == null ? 0 : objectList.size();
            }
        }else{
            objectList = new ArrayList<>();

            // definido como lista = true --> spsExchangedDocument.referenceSPSReferencedDocument[0].relationshipTypeCode.value=default:NULL
            // definido como lista = false --> spsExchangedDocument.referenceSPSReferencedDocument.relationshipTypeCode.value=default:NULL
            boolean definidoComoLista = false;
            for(int i = 0; existeMapping(siguientePrefijo + "[" + i +"]"); i++){
                definidoComoLista = true;
                Object item = ((Class)pType.getActualTypeArguments()[0]).newInstance();
                mapear(item, siguientePrefijo + "[" + i +"]");
                objectList.add(item);
            }

            // Si el tag en un listado pero no se agrego "[0]"
            if(!definidoComoLista && existeMapping(siguientePrefijo)){
                Object item = ((Class)pType.getActualTypeArguments()[0]).newInstance();
                mapear(item, siguientePrefijo);
                objectList.add(item);
            }

            return objectList;
        }
        if(size == 0){
            checkLists(field);
        }
        List<Object> listado = new ArrayList<>();

        Object objetoXsd;
        //Por cada uno de los items del listado del FitoSanitario
        for(int i = 0; i < size; i++){
            // Se crea una nueva instancia de item para luego ir cargando los atributos definidos en el mapping
            objetoXsd = ((Class)pType.getActualTypeArguments()[0]).newInstance();
            // Por cada uno de los atributos de la Clase en cuestión verificar cuales campos estan definidos en el mapping
            // y luego obtener el valor
            for(Field atributtoXsd: objetoXsd.getClass().getDeclaredFields()){
                // obtiene el mapping del atributo de la Clase
                String atributoCertificado1 = config.get(siguientePrefijo + "." + atributtoXsd.getName());

                if(atributoCertificado1 != null){
                    atributtoXsd.setAccessible(true);
                    //spsExchangedDocument.name.value=default:NULL
                    //siguientePrefijo = spsExchangedDocument.name.value
                    //atributoCertificado1 = default:NULL

                    //spsExchangedDocument.name.value=documentos.nombre
                    //siguientePrefijo = spsExchangedDocument.name.value
                    //atributoCertificado1 = documentos.nombre

                    //Se obtiene el valor del atributo del item del listado
                    if(objectList != null && !objectList.isEmpty()){
                        Object valorAtributo = getFieldValue(atributoCertificado1, objectList.get(i));

                        Field atributoItem = objectList.get(i).getClass().getDeclaredField(atributoCertificado1);
                        atributoItem.setAccessible(true);

                        // Transformar dependiendo del tipo de dato
                        valorAtributo = transform(atributoItem, valorAtributo);

                        //Se setea al atributo del XSD el valor obtenido del item del FitoSanitario
                        atributtoXsd.set(objetoXsd, valorAtributo);
                    } else {
                        String valor =  atributoCertificado1.split(":")[1];
                        atributtoXsd.set(objetoXsd, valor);
                    }
                }
            }
            listado.add(objetoXsd);
        }
        return listado;
    }

    private Object getEnumValue(Field field, Object fieldValue){
        List<Object> listaEnum = Arrays.asList(field.getType().getEnumConstants());
        Object enumSelected = null;
        for(Object ot: listaEnum){
            if(fieldValue.equals((ot.toString()))){
                enumSelected = ot;
            }
        }
        checkEnum(field, fieldValue, enumSelected, listaEnum);
        return enumSelected;
    }

    private void addNullMessage(String campo){
        errores.add(EL_CAMPO + campo + "' no puede ser nulo");
    }

    private void addPatternMessage(String campo, Object valor, String regexp){
        errores.add(EL_CAMPO + campo + CON_VALOR + valor + "' no respeta el patrón '" + regexp + "'");
    }
    private void addSizeMinMessage(String campo, Object valor, String min){
        errores.add(EL_CAMPO + campo + CON_VALOR + valor + "' debe tener un tamaño de al menos " + min + " caracteres");
    }


    private void checkEnum(Field field, Object fieldValue, Object object, List<Object> listaEnum){

        if(object == null && field.isAnnotationPresent(XmlAttribute.class)
                && field.getAnnotation(XmlAttribute.class).required()){
            StringBuilder permitidos = new StringBuilder();
            for(Object ot: listaEnum){
                permitidos.append(ot.toString()).append(", ");
            }
            permitidos = new StringBuilder(permitidos.substring(0, permitidos.length() - 2));
            errores.add(EL_CAMPO + field.getName() +
                    CON_VALOR + (fieldValue != null ? (String)fieldValue: "") +
                    "' no corresponde a ninguno de los permitidos: '" + permitidos + "'");
        }
    }

    private void checkLists(Field field){
        if(field.isAnnotationPresent(XmlAttribute.class)
                && field.getAnnotation(XmlAttribute.class).required()){
            addNullMessage(field.getName() + "Qty");
            addNullMessage(field.getName());
        }
    }

    private Object transform(Field field, Object value) throws ParseException, DatatypeConfigurationException {
        Object object = value;
        if(field.isAnnotationPresent(XmlAttribute.class)
                && field.getAnnotation(XmlAttribute.class).required()
                && object == null){
            addNullMessage(field.getName());
        }
        //Size se aplica a los Strings y List, los List son tratados a parte
        if(field.isAnnotationPresent(Size.class) && object != null){
            object = checkSize(field, value);

        }

        if(field.isAnnotationPresent(Pattern.class) && object != null){
            object = checkPattern(field, object);
        }

        if(field.isAnnotationPresent(Digits.class) && object != null) {
            //TODO: verificar. Ajustar los decimales o mostrar error si no coincide
            BigDecimal decimalValue = (BigDecimal) object;
            int fraction = field.getAnnotation(Digits.class).fraction();
            object = decimalValue.setScale(fraction, RoundingMode.HALF_UP);
        }

        if(field.isAnnotationPresent(DecimalMin.class) && object != null){
            checkDecimalMin(field, object);
        }

        if(field.getType().equals(XMLGregorianCalendar.class) && object != null){
            object = checkFecha(field, object);
        }

        /*@DecimalMax("9999999999999999.9999")
        @DecimalMin("0")*/
        return object;
    }

    private Object checkFecha(Field field, Object object) throws ParseException, DatatypeConfigurationException {
        String fecha = (String) object;
        if(fecha.equals("T")){
            if(field.isAnnotationPresent(XmlAttribute.class)
                    && field.getAnnotation(XmlAttribute.class).required()){
                addNullMessage(field.getName());
            }
            return null;
        }else{
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date date = format.parse((String) object);

            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);

            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
    }

    private Object checkSize(Field field, Object object){
        int max = field.getAnnotation(Size.class).max();
        int min = field.getAnnotation(Size.class).min();
        if(max != 0 && ((String)object).length() > max){
            String stringValue = (String) object;
            stringValue = stringValue.substring(0, max);
            object = stringValue;
        }
        if(min != 0 && ((String)object).length() < min){
            if(!(field.isAnnotationPresent(XmlAttribute.class)
                    && field.getAnnotation(XmlAttribute.class).required())){
                object = null;
            }else{
                addSizeMinMessage(field.getName(), object, String.valueOf(min));
            }
        }
        return object;
    }

    /**
     * Obs: Solo el acuerdo A33 y A60 tienen campos telefónicos obligatorios. Estos acuerdos no se utilizan en nuestra base de datos
     * @param field
     * @param object
     * @return
     */
    private Object checkPattern(Field field, Object object){
        String regexp = field.getAnnotation(Pattern.class).regexp();
        //Si la cadena no es aceptada por el patron entonces se envia nulo si es posible
        if(!((String) object).matches(regexp)){
            if(!(field.isAnnotationPresent(XmlAttribute.class)
                    && field.getAnnotation(XmlAttribute.class).required())){
                object = null;
            }else{
                addPatternMessage(field.getName(), object, regexp);
            }
        }
        return object;
    }

    private void checkDecimalMin(Field field, Object object){
        if(field.getType().equals(BigDecimal.class)){
            BigDecimal decimalValue = (BigDecimal) object;
            String min = field.getAnnotation(DecimalMin.class).value();
            if(new BigDecimal(min).compareTo(decimalValue) > 0){
                addSizeMinMessage(field.getName(), decimalValue, min);
            }
        }else if(field.getType().equals(BigInteger.class)){
            BigInteger decimalValue = (BigInteger) object;
            String min = field.getAnnotation(DecimalMin.class).value();
            if(new BigInteger(min).compareTo(decimalValue) > 0){
                addSizeMinMessage(field.getName(), decimalValue, min);
            }
        }
    }

    private Object getFieldValue(String atributoCertificado) throws NoSuchFieldException, IllegalAccessException {
        return getFieldValue(atributoCertificado, null);
    }

    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    /**
     * Obtiene el valor final de un atributo mapeado
     * @param atributoCertificado
     * @return
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    private Object getFieldValue(String atributoCertificado, Object objetoFinal) throws NoSuchFieldException, IllegalAccessException {
        Field field;
        Object ob = objetoFinal == null ? certificado : objetoFinal;

        if(atributoCertificado.contains("default:")){
            String valor;
            String tipo;
            if(atributoCertificado.contains("EXPORT:")){
                valor = atributoCertificado.split(":")[2];
                tipo = atributoCertificado.split(":")[1];
            } else {
                valor = atributoCertificado.split(":")[1];
                tipo = atributoCertificado.split(":")[0];
            }

            if(valor.equals("sysdate")){
                LocalDateTime localDateTime = LocalDateTime.now();
                return localDateTime.toString();
            } else if(valor.equals("VACIO")) {
                return "";
            } else if (tipo.equals("True")) {
                return true;
            } else if (tipo.equals("False")) {
                return false;
            } else if (tipo.equals("bigdecimaldefault")) {
                return new BigDecimal(valor);
            } else {
                return valor;
            }
        } else if (atributoCertificado.split(":").length > 1){
            atributoCertificado = atributoCertificado.split(":")[atributoCertificado.split(":").length - 1];
        }

        //Para el caso mapping "ehId":"camaras.nrocamara"
        //Se itera por las instancias del Certificado hasta llegar al valor final
        while (atributoCertificado.contains(".")){
            int index = atributoCertificado.indexOf('.');
            String atributo = atributoCertificado.substring(0, index);
            field = ob.getClass().getDeclaredField(atributo);
            field.setAccessible(true);
            ob = field.get(ob);
            atributoCertificado = atributoCertificado.substring(index + 1);
        }

        field = ob.getClass().getDeclaredField(atributoCertificado);
        field.setAccessible(true);
        return field.get(ob);
    }

    private Object getFieldValueList(String atributoCertificado, int indice) throws NoSuchFieldException, IllegalAccessException {
        Field field;
        Object ob = certificado;

        if(atributoCertificado.contains("default:")){
            String valor = atributoCertificado.split(":")[1];
            if(valor.equals("sysdate")){
                LocalDateTime localDateTime = LocalDateTime.now();
                return localDateTime.toString();
            } else {
                return valor;
            }
        }

        //Para el caso mapping "ehId": "camaras.nrocamara"
        //Se itera por las instancias del Certificado hasta llegar al valor final
        while (atributoCertificado.contains(".")){
            int index = atributoCertificado.indexOf('.');
            String atributo = atributoCertificado.substring(0, index);
            field = ob.getClass().getDeclaredField(atributo);
            field.setAccessible(true);
            ob = field.get(ob);
            atributoCertificado = atributoCertificado.substring(index + 1);
        }

        ArrayList listado = (ArrayList) ob;

        ob = listado.get(indice);
        Field field1 = ob.getClass().getDeclaredField(atributoCertificado);
        field1.setAccessible(true);
        return field1.get(ob);
    }

    private Boolean isObject(Class clase){
        return !clase.equals(Boolean.class)
                && !clase.equals(String.class)
                && !clase.equals(BigInteger.class)
                && !clase.equals(BigDecimal.class)
                && !clase.equals(XMLGregorianCalendar.class)
                && !clase.isEnum()
                && !Map.class.isAssignableFrom(clase);
    }

    public void validate(Field field, String atributoCertificado){
        StringBuilder validaciones = new StringBuilder();
        validaciones.append("campo: /").append(field.getName()).append(" - ").append(atributoCertificado);
        if(field.isAnnotationPresent(XmlAttribute.class)
                && field.getAnnotation(XmlAttribute.class).required()){
            validaciones.append("\tNotNull");
        }
        if(field.isAnnotationPresent(Pattern.class)){
            validaciones.append("\tPattern: ").append(field.getAnnotation(Pattern.class).regexp());
        }
        if(field.isAnnotationPresent(Size.class)){
            if(field.getAnnotation(Size.class).max() != 0){
                validaciones.append("\tmax = ").append(field.getAnnotation(Size.class).max());
            }
            if(field.getAnnotation(Size.class).min() != 0){
                validaciones.append("\tmin = ").append(field.getAnnotation(Size.class).min());
            }
        }
        if(field.isAnnotationPresent(Digits.class)){
            int fraction = field.getAnnotation(Digits.class).fraction();
            int integer = field.getAnnotation(Digits.class).integer();
            validaciones.append("\tenteros: ").append(integer).append(", decimales: ").append(fraction);
        }

        logger.log(Level.SEVERE, "Ocurrió un error: {0} ", validaciones);
    }

    private JAXBElement<Object> generar(String version){
        this.version = version;
        try {
            Class<?> clase = getClass(version);

            Object envelopeObject = clase.newInstance();
            mapear(envelopeObject, "");
            
         //   mappeoManual(envelopeObject); // comentado el 20-01-2022
            /* Este es el truco al no ser @XmlRootElement. */
            QName qName = new QName("urn:un:unece:uncefact:data:standard:SPSCertificate:17", "SPSCertificate");

            return new JAXBElement(qName, SPSCertificateType.class, envelopeObject);
        } catch (IllegalAccessException | NoSuchFieldException | InstantiationException | ClassNotFoundException | ParseException | DatatypeConfigurationException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        return null;
    }
    /* para analizar 20-01-2022 */
    /*
    private Object mappeoManual(Object envelopeObject){
        SPSCertificateType spsCertificateType = (SPSCertificateType) envelopeObject;
        try{
            SPSExchangedDocumentType spsExchangedDocumentType = spsCertificateType.getSPSExchangedDocument();
            for(Documento documento: certificado.getDocumentos()){
                //psExchangedDocument.referenceSPSReferencedDocument.attachementBinaryObject.fileName=documentos.id
                //spsExchangedDocument.referenceSPSReferencedDocument.attachementBinaryObject.value=documentos.bytes
                //spsExchangedDocument.referenceSPSReferencedDocument.relationshipTypeCode.value=default:ZZZ
                IDType docummentID = new IDType();
                docummentID.setValue(documento.getId());
                SPSReferencedDocumentType spsReferencedDocument= new SPSReferencedDocumentType();
                spsReferencedDocument.setID(docummentID);
                BinaryObjectType binaryObject= new BinaryObjectType();
                binaryObject.setFilename(documento.getId());
                binaryObject.setValue(documento.getBytes());
                spsReferencedDocument.getAttachmentBinaryObject().add(binaryObject);
                ReferenceCodeType referenceCodeType = new ReferenceCodeType();
                referenceCodeType.setValue(ReferenceTypeCodeContentType.ZZZ);
                spsReferencedDocument.setRelationshipTypeCode(referenceCodeType);
                spsExchangedDocumentType.getReferenceSPSReferencedDocument().add(spsReferencedDocument);
            }

            ProcessTypeCodeType referenceCodeType = new ProcessTypeCodeType();
            referenceCodeType.setValue(ReferenceTypeCodeContentType.ZZZ.value());
            SPSConsignmentType spsConsignmentType = spsCertificateType.getSPSConsignment();

            SPSProcessType appliedSPSProcess = new SPSProcessType();
            SPSPeriodType spsPeriodType = new SPSPeriodType();
            SPSProcessCharacteristicType applicableSPSProcessCharacteristic = new SPSProcessCharacteristicType();
            MeasureType measureTypeKgm = new MeasureType();
            MeasureType measureTypeOther = new MeasureType();
            SPSNoteType additionalInformationSPSNoteCantidad = new SPSNoteType();
            SPSNoteType additionalInformationSPSNoteUnidMedida = new SPSNoteType();

            DateTimeType start = new DateTimeType();
            DateTimeType.DateTimeString start1 = new DateTimeType.DateTimeString();

            start1.setValue(certificado.getFechaTratamiento());
            start.setDateTimeString(start1);
            spsPeriodType.setStartDateTime(start);
            spsPeriodType.setEndDateTime(start);
            String descripcionTto = certificado.getDescripcionTratamiento();


            if(!descripcionTto.equalsIgnoreCase("Sin definir") && !descripcionTto.equalsIgnoreCase("Undefined")){
                TextType prueba = new TextType();
                prueba.setValue("TTFT");
                applicableSPSProcessCharacteristic.getDescription().add(0,prueba);
                TextType prueba2 = new TextType();
                prueba2.setValue(descripcionTto);
                prueba2.setLanguageID("es");
                if(Arrays.asList(codesPaisDestino).contains(certificado.getCodigoPaisDestino())){
                    prueba2.setLanguageID("en");
                }

                applicableSPSProcessCharacteristic.getDescription().add(1, prueba2);
                appliedSPSProcess.getApplicableSPSProcessCharacteristic().add(applicableSPSProcessCharacteristic);
            }
            appliedSPSProcess.setTypeCode(referenceCodeType);
            appliedSPSProcess.setCompletionSPSPeriod(spsPeriodType);

            spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).getAppliedSPSProcess().add(appliedSPSProcess);


            if(certificado.getTipoPeso().equals("K")) { //si o si kilogramo
                measureTypeKgm.setUnitCode(certificado.getFitosanitarioDetalles().getUnidadMedida());
                measureTypeKgm.setValue(certificado.getFitosanitarioDetalles().getKilo());
                spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).setNetWeightMeasure(measureTypeKgm);
            } else if(Arrays.asList(codesWeight).contains(certificado.getFitosanitarioDetalles().getCodigoXml())){ //otras medidas de masa
                measureTypeKgm.setUnitCode(certificado.getFitosanitarioDetalles().getCodigoXml());
                measureTypeKgm.setValue(certificado.getFitosanitarioDetalles().getCantidad());
                spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).setNetWeightMeasure(measureTypeKgm);
            } else if(Arrays.asList(codesVolume).contains(certificado.getFitosanitarioDetalles().getCodigoXml())){ //otras medidas de volumen
                measureTypeOther.setUnitCode(certificado.getFitosanitarioDetalles().getCodigoXml());
                measureTypeOther.setValue(certificado.getFitosanitarioDetalles().getCantidad());
                spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).setNetVolumeMeasure(measureTypeOther);
            } else{ // otras medidaS no especificadas en el IPPC SPECIFIC UNIT OF MEASURE CODES
                TextType subjectCantidad = new TextType();
                subjectCantidad.setValue("OQV");
                TextType contentCantidad = new TextType();
                contentCantidad.setValue(certificado.getFitosanitarioDetalles().getKilo().toString());
                additionalInformationSPSNoteCantidad.setSubject(subjectCantidad);
                additionalInformationSPSNoteCantidad.withContent(contentCantidad);

                TextType subject = new TextType();
                subject.setValue("OQU");
                TextType content = new TextType();
                content.setValue(certificado.getFitosanitarioDetalles().getCodigoXml());
                additionalInformationSPSNoteUnidMedida.setSubject(subject);
                additionalInformationSPSNoteUnidMedida.withContent(content);

                spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).getAdditionalInformationSPSNote().add(additionalInformationSPSNoteCantidad);
                spsConsignmentType.getIncludedSPSConsignmentItem().get(0).getIncludedSPSTradeLineItem().get(0).getAdditionalInformationSPSNote().add(additionalInformationSPSNoteUnidMedida);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return envelopeObject;
    }
    */

    /**
     * Obtiene la clase de acuerdo a la versión del XSD
     * @param version version del XSD
     * @return La clase correspondiente
     * @throws ClassNotFoundException
     */
    private Class getClass(String version) throws ClassNotFoundException {
        String paquete = "py.gov.vue.ephyto.version.v" + version.replace(".", "");
        return Class.forName(paquete + ".SPSCertificateType");
    }

    public Document toDocument(String version, JAXBElement<Object> root) throws JAXBException, ParserConfigurationException, ClassNotFoundException {
        JAXBContext context;
        context = JAXBContext.newInstance(getClass(version));

        // Create the Document
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.newDocument();

        if(root == null){
            root = generar(version);
        }

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "urn:un:unece:uncefact:data:standard:SPSCertificate:17 " +
//                "src/main/resources/xsd/uncefact/data/standard/SPSCertificate_17p0.xsd");
        marshaller.marshal(root, document);

        return document;
    }
    /* para Analizar 20-01-2022 */
    
    /*
    public String toString(String version) throws JAXBException, ClassNotFoundException, SAXException {
        return toString(version, null);
    }
    */
    public Document toDocument(String version) throws JAXBException, ClassNotFoundException, ParserConfigurationException {
        return toDocument(version, null);
    }
  /* para Analizar 20-01-2022 */
    /*
    public String toString(String version, JAXBElement<Object> root) throws JAXBException, ClassNotFoundException, SAXException {
        JAXBContext context;
        context = JAXBContext.newInstance(getClass(version));

        StringWriter sw = new StringWriter();

        if(root == null){
            root = generar(version);
        }
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.setSchema(config.getSchema(version));
        MyValidationEventHandler handler = new MyValidationEventHandler();
        marshaller.setEventHandler(handler);
        try {
            marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new DefaultNamespacePrefixMapper());

        } catch(PropertyException e) {
            // In case another JAXB implementation is used
        }
        marshaller.setAdapter(new XmlAdapter<String,String>() {
            @Override
            public String marshal(String v) throws Exception {
                if(null == v || v.length() == 0) {
                    return null;
                }
                return v;
            }
            @Override
            public String unmarshal(String v) throws Exception {
                return v;
            }
        });
        marshaller.marshal(root, sw);
        setExcepciones(handler.getErrors());
        return sw.toString();
    }*/
	
}
