package com.api.xml;

import java.io.File;
import java.io.StringWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.api.conection.SQLDatabaseConnection;

public class CrearXmlDatos {
	public Document inicializarDocumento() throws ParserConfigurationException{
        Document documento;
        // Creamos los objectos de creacion de Documentos XML
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = docFactory.newDocumentBuilder();
        
        documento = constructor.newDocument();
        
        return documento;        
    }
    
    public String convertirString(Document documento) throws TransformerConfigurationException, TransformerException {
        // Creamos el objecto transformador
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        
        // Indicamos que queremos que idente el XML con 2 espacios
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        
        // Creamos el escritor a cadena de texto
        StringWriter writer = new StringWriter();
        // Fuente de datos, en este caso el documento XML
        DOMSource source = new DOMSource(documento);
        // Resultado, el cual se almacenara en el objecto writer
        StreamResult result = new StreamResult(writer);
        // Efectuamos la transformacion a lo que indica el objecto resultado, writer apuntara a el resultado
        transformer.transform(source, result);
        // Convertimos el buffer de writer en cadena de texto
        String output = writer.getBuffer().toString();

        return output;
    }
    
    public void escribirArchivo(Document documento, String fileName) throws TransformerConfigurationException, TransformerException {
        // Creamos el objecto transformador
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        
        // Indicamos que queremos que idente el XML con 2 espacios
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        // Archivo donde almacenaremos el XML
        File archivo = new File(fileName);

        // Fuente de datos, en este caso el documento XML
        DOMSource source = new DOMSource(documento);
        // Resultado, el cual almacena en el archivo indicado
        StreamResult result = new StreamResult(archivo);
        // Transformamos de ña fuente DOM a el resultado, lo que almacena todo en el archivo
        transformer.transform(source, result);
    }
    
    public Document crearDocumento() throws ParserConfigurationException, SQLException {
        Document documento = this.inicializarDocumento();
        // para sacar datos con procedimiento almacena de SQL server
        Connection cn = SQLDatabaseConnection.getConnection();
		int solicitud = 71876;
		String distrital="SCZ";
		CallableStatement cst = cn.prepareCall("{call Ws_Solicitudes_List_ephyto_hub (?,?)}");
        cst.setInt(1, solicitud);
        cst.setString(2, distrital);
        ResultSet result = cst.executeQuery();
        //
        while (result.next()) {
        //creamos el marco xml
        Element Envelope = documento.createElement("soapenv:Envelope");
        // Hacemos el elemento entrada descender directo del nodo XML principal
        documento.appendChild(Envelope);
        // Encabezado  
        Element Header = documento.createElement("soapenv:Header");
        Envelope.appendChild(Header);
        
        // Creamos el elemento body
        Element entrada = documento.createElement("soapenv:Body");
        // Hacemos el elemento entrada descender directo del nodo XML principal
        Envelope.appendChild(entrada);
        // Creamos el elemento principal
        Element DeliverPhytoEnvelope = documento.createElement("eph:DeliverPhytoEnvelope");
        // Hacemos el elemento entrada descender directo del nodo XML principal
        entrada.appendChild(DeliverPhytoEnvelope);

        Element ePhytoEnvelope = documento.createElement("eph:ePhytoEnvelope");
        DeliverPhytoEnvelope.appendChild(ePhytoEnvelope);
        
      //Creamos elementos del encabezado
        Element From = documento.createElement("hub:From");
        From.setTextContent("BO");
        ePhytoEnvelope.appendChild(From);
      
        Element To = documento.createElement("hub:To");
        To.setTextContent("AR");
        ePhytoEnvelope.appendChild(To);
         
        Element CertificateType = documento.createElement("hub:CertificateType");
        CertificateType.setTextContent("851");
        ePhytoEnvelope.appendChild(CertificateType);
        
        Element CertificateStatus = documento.createElement("hub:CertificateStatus");
        CertificateStatus.setTextContent("70");
        ePhytoEnvelope.appendChild(CertificateStatus);
     
        
        Element NPPOCertificateNumber = documento.createElement("hub:NPPOCertificateNumber");
        NPPOCertificateNumber.setTextContent("BO-"+result.getString(2));
        ePhytoEnvelope.appendChild(NPPOCertificateNumber);
        
        //Cuerpo del XML del cerficado.
        Element SPSCertificate = documento.createElement("urn:SPSCertificate");
        ePhytoEnvelope.appendChild(SPSCertificate);
        
        Element SPSExchangedDocument = documento.createElement("urn:SPSExchangedDocument");
        SPSCertificate.appendChild(SPSExchangedDocument);
        
        Element Name1 = documento.createElement("urn1:Name");
        Name1.setTextContent("NULL");
        SPSExchangedDocument.appendChild(Name1);
        
        Element ID1 = documento.createElement("urn1:ID");
        ID1.setTextContent("BO-"+result.getString(2));
        SPSExchangedDocument.appendChild(ID1);
        
        Element TypeCode = documento.createElement("urn1:TypeCode");
        TypeCode.setTextContent("851");
        SPSExchangedDocument.appendChild(TypeCode);
        
        Element StatusCode = documento.createElement("urn1:StatusCode");
        StatusCode.setTextContent("70");
        SPSExchangedDocument.appendChild(StatusCode);
        
        Element IssueDateTime = documento.createElement("urn1:IssueDateTime");
        SPSExchangedDocument.appendChild(IssueDateTime);
        
        Element DateTimeString = documento.createElement("urn2:DateTimeString");
       // SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
       // Calendar calendario = Calendar.getInstance();
       // Date date = new Date(calendario.getTimeInMillis());
        DateTimeString.setTextContent(result.getString(5));
        //DateTimeString.setTextContent(formato.format(date));
        IssueDateTime.appendChild(DateTimeString);
        
        Element IssuerSPSParty = documento.createElement("urn1:IssuerSPSParty");
        SPSExchangedDocument.appendChild(IssuerSPSParty);
        
        Element Name2 = documento.createElement("urn1:Name");
        Name2.setTextContent("Servicio Nacional Agropecuario e Inucuidad Alimentaria");
        IssuerSPSParty.appendChild(Name2);
        
        Element IncludedSPSNote = documento.createElement("urn1:IncludedSPSNote");
        SPSExchangedDocument.appendChild(IncludedSPSNote);
        
        Element Subject = documento.createElement("urn1:Subject");
        Subject.setTextContent("SPSFL");
        IncludedSPSNote.appendChild(Subject);
        
        Element Content = documento.createElement("urn1:Content");
        Content.setTextContent("5");
        IncludedSPSNote.appendChild(Content);
        
        Element SignatorySPSAuthentication = documento.createElement("urn1:SignatorySPSAuthentication");
        SPSExchangedDocument.appendChild(SignatorySPSAuthentication);
        
        Element ActualDateTime = documento.createElement("urn1:ActualDateTime");
        SignatorySPSAuthentication.appendChild(ActualDateTime);
        
        Element DateTimeString1 = documento.createElement("urn2:DateTimeString");
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendario1 = Calendar.getInstance();
        Date date1 = new Date(calendario1.getTimeInMillis());

        DateTimeString1.setTextContent(formato1.format(date1));
        ActualDateTime.appendChild(DateTimeString1);
        
        Element IssueSPSLocation = documento.createElement("urn1:IssueSPSLocation");
        SignatorySPSAuthentication.appendChild(IssueSPSLocation);
        
        Element Name3 = documento.createElement("urn1:Name");
        Name3.setTextContent(result.getString(7));
        IssueSPSLocation.appendChild(Name3);
        
        Element ProviderSPSParty = documento.createElement("urn1:ProviderSPSParty");
        SignatorySPSAuthentication.appendChild(ProviderSPSParty);
        
        Element Name4 = documento.createElement("urn1:Name");
        Name4.setTextContent("NULL");
        ProviderSPSParty.appendChild(Name4);
        
        Element SpecifiedSPSPerson = documento.createElement("urn1:SpecifiedSPSPerson");
        ProviderSPSParty.appendChild(SpecifiedSPSPerson);
        
        Element Name5 = documento.createElement("urn1:Name");
        Name5.setTextContent(result.getString(6));
        SpecifiedSPSPerson.appendChild(Name5);
        
        Element IncludedSPSClause = documento.createElement("urn1:IncludedSPSClause");
        SignatorySPSAuthentication.appendChild(IncludedSPSClause);
        
        Element ID = documento.createElement("urn1:ID");
        ID.setTextContent("1");
        IncludedSPSClause.appendChild(ID);
        
        Element Content1 = documento.createElement("urn1:Content");
        Content1.setTextContent("NULL");
        IncludedSPSClause.appendChild(Content1);
        
        Element SPSConsignment = documento.createElement("urn:SPSConsignment");
        SPSCertificate.appendChild(SPSConsignment);
        
        Element ConsignorSPSParty = documento.createElement("urn1:ConsignorSPSParty");
        SPSConsignment.appendChild(ConsignorSPSParty);
        
        Element Name6 = documento.createElement("urn1:Name");
        Name6.setTextContent(result.getString(11));
        ConsignorSPSParty.appendChild(Name6);
        
        Element SpecifiedSPSAddress = documento.createElement("urn1:SpecifiedSPSAddress");
        ConsignorSPSParty.appendChild(SpecifiedSPSAddress);
        
        Element LineOne = documento.createElement("urn1:LineOne");
        LineOne.setTextContent(result.getString(12));
        SpecifiedSPSAddress.appendChild(LineOne);
        
        Element ConsigneeSPSParty = documento.createElement("urn1:ConsigneeSPSParty");
        SPSConsignment.appendChild(ConsigneeSPSParty);
        
        Element Name7 = documento.createElement("urn1:Name");
        Name7.setTextContent("Comercial Moxos Agropecuario - Trinidad");
        ConsigneeSPSParty.appendChild(Name7);
        
        Element SpecifiedSPSAddress2 = documento.createElement("urn1:SpecifiedSPSAddress");
        ConsigneeSPSParty.appendChild(SpecifiedSPSAddress2);
        
        Element LineOne2 = documento.createElement("urn1:LineOne");
        LineOne2.setTextContent("Avenidad Moxos");
        SpecifiedSPSAddress2.appendChild(LineOne2);
        
        Element ExportSPSCountry = documento.createElement("urn1:ExportSPSCountry");
        SPSConsignment.appendChild(ExportSPSCountry);
        
        Element ID3 = documento.createElement("urn1:ID");
        ID3.setTextContent("BO");
        ExportSPSCountry.appendChild(ID3);
        
        Element Name8 = documento.createElement("urn1:Name");
        Name8.setTextContent("Estado Plurinacional de Bolvia");
        ExportSPSCountry.appendChild(Name8);
        
        Element ImportSPSCountry = documento.createElement("urn1:ImportSPSCountry");
        SPSConsignment.appendChild(ImportSPSCountry);
        
        Element ID4 = documento.createElement("urn1:ID");
        ID4.setTextContent(result.getString(10));
        ImportSPSCountry.appendChild(ID4);
        
        Element Name9 = documento.createElement("urn1:Name");
        Name9.setTextContent("Republica de Argentina");
        ImportSPSCountry.appendChild(Name9);
        
        Element UnloadingBaseportSPSLocation = documento.createElement("urn1:UnloadingBaseportSPSLocation");
        SPSConsignment.appendChild(UnloadingBaseportSPSLocation);
        
        Element Name10 = documento.createElement("urn1:Name");
        Name10.setTextContent(result.getString(14));
        UnloadingBaseportSPSLocation.appendChild(Name10);
        
        Element ExaminationSPSEvent = documento.createElement("urn1:ExaminationSPSEvent");
        SPSConsignment.appendChild(ExaminationSPSEvent);
        
        Element OccurrenceSPSLocation = documento.createElement("urn1:OccurrenceSPSLocation");
        ExaminationSPSEvent.appendChild(OccurrenceSPSLocation);
        
        Element Name11 = documento.createElement("urn1:Name");
        Name11.setTextContent("NULL");
        OccurrenceSPSLocation.appendChild(Name11);
        
        Element MainCarriageSPSTransportMovement = documento.createElement("urn1:MainCarriageSPSTransportMovement");
        SPSConsignment.appendChild(MainCarriageSPSTransportMovement);
        
        Element ModeCode = documento.createElement("urn1:ModeCode");
        ModeCode.setTextContent("3");
        MainCarriageSPSTransportMovement.appendChild(ModeCode);
        
        Element UsedSPSTransportMeans = documento.createElement("urn1:UsedSPSTransportMeans");
        MainCarriageSPSTransportMovement.appendChild(UsedSPSTransportMeans);
        // ver languageID="en" despues de Name
        Element Name12 = documento.createElement("urn1:Name");
        Name12.setTextContent("TRAPORTADORA MOXOS");
        UsedSPSTransportMeans.appendChild(Name12);
        
        Element IncludedSPSConsignmentItem = documento.createElement("urn1:IncludedSPSConsignmentItem");
        SPSConsignment.appendChild(IncludedSPSConsignmentItem);
        
        Element IncludedSPSTradeLineItem = documento.createElement("urn1:IncludedSPSTradeLineItem");
        IncludedSPSConsignmentItem.appendChild(IncludedSPSTradeLineItem);
        
        Element SequenceNumeric = documento.createElement("urn1:SequenceNumeric");
        SequenceNumeric.setTextContent("0");
        IncludedSPSTradeLineItem.appendChild(SequenceNumeric);
      // ver languageID="en" despues de Name
        Element Description = documento.createElement("urn1:Description");
        Description.setTextContent(result.getString(19));
        IncludedSPSTradeLineItem.appendChild(Description);
        
        Element CommonName = documento.createElement("urn1:CommonName");
        CommonName.setTextContent(result.getString(21));
        IncludedSPSTradeLineItem.appendChild(CommonName);
        
        Element ScientificName = documento.createElement("urn1:ScientificName");
        ScientificName.setTextContent(result.getString(21));
        IncludedSPSTradeLineItem.appendChild(ScientificName);
        //unitCode="KGM"        
        Element NetWeightMeasure = documento.createElement("urn1:NetWeightMeasure");
        NetWeightMeasure.setTextContent(result.getString(20));
        IncludedSPSTradeLineItem.appendChild(NetWeightMeasure);
        
        Element AdditionalInformationSPSNote = documento.createElement("urn1:AdditionalInformationSPSNote");
        IncludedSPSTradeLineItem.appendChild(AdditionalInformationSPSNote);
        
        Element Subject2 = documento.createElement("urn1:Subject");
        Subject2.setTextContent("ADTLIL");
        AdditionalInformationSPSNote.appendChild(Subject2);
        // languageID="en"
        Element Content2 = documento.createElement("urn1:Content");
        Content2.setTextContent(result.getString(8));
        AdditionalInformationSPSNote.appendChild(Content2);
        
        Element AdditionalInformationSPSNote1 = documento.createElement("urn1:AdditionalInformationSPSNote");
        IncludedSPSTradeLineItem.appendChild(AdditionalInformationSPSNote1);
        
        Element Subject3 = documento.createElement("urn1:Subject");
        Subject3.setTextContent("ADDITLIL");
        AdditionalInformationSPSNote1.appendChild(Subject3);
        // languageID="en"
        Element Content3 = documento.createElement("urn1:Content");
        Content3.setTextContent("2021-09-03T00:00:00-03:00");
        AdditionalInformationSPSNote1.appendChild(Content3);
        
        Element ApplicableSPSClassification = documento.createElement("urn1:ApplicableSPSClassification");
        IncludedSPSTradeLineItem.appendChild(ApplicableSPSClassification);
        
        Element SystemName = documento.createElement("urn1:SystemName");
        SystemName.setTextContent("IPPCPCVP");
        ApplicableSPSClassification.appendChild(SystemName);
        // languageID="en"
        Element ClassName = documento.createElement("urn1:ClassName");
        ClassName.setTextContent("Seeds");
        ApplicableSPSClassification.appendChild(ClassName);
        
        Element PhysicalSPSPackage = documento.createElement("urn1:PhysicalSPSPackage");
        IncludedSPSTradeLineItem.appendChild(PhysicalSPSPackage);
        
        Element LevelCode = documento.createElement("urn1:LevelCode");
        LevelCode.setTextContent("1");
        PhysicalSPSPackage.appendChild(LevelCode);
      
        Element TypeCode2 = documento.createElement("urn1:TypeCode");
        TypeCode2.setTextContent("BG");
        PhysicalSPSPackage.appendChild(TypeCode2);
       
        Element ItemQuantity = documento.createElement("urn1:ItemQuantity");
        ItemQuantity.setTextContent(result.getString(20));
        PhysicalSPSPackage.appendChild(ItemQuantity);
        
        Element OriginSPSCountry = documento.createElement("urn1:OriginSPSCountry");
        IncludedSPSTradeLineItem.appendChild(OriginSPSCountry);
        
        Element ID2 = documento.createElement("urn1:ID");
        ID2.setTextContent("BO");
        OriginSPSCountry.appendChild(ID2);
       
        Element Name = documento.createElement("urn1:Name");
        Name.setTextContent("Estado Plurinacional de Bolivia");
        OriginSPSCountry.appendChild(Name);
        }
        return documento;
    }
}
