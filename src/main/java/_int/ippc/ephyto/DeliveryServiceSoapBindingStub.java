/**
 * DeliveryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class DeliveryServiceSoapBindingStub extends org.apache.axis.client.Stub implements _int.ippc.ephyto.IDeliveryService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTreatmentTypes");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "treatmentType"));
        oper.setReturnClass(_int.ippc.ephyto.TreatmentType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "TreatmentType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdditionalDeclarations");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "additionalDeclaration"));
        oper.setReturnClass(_int.ippc.ephyto.AdditionalDeclaration[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdditionalDeclaration"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetActiveNppos");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfNppo"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.Nppo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNpposResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Nppo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcknowledgeFailedEnvelopeReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetImportEnvelopeHeaders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeadersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "EnvelopeHeader"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTrackingInfoUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"), _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PULLSingleImportEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.Envelope.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIntendedUses");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "intendedUse"));
        oper.setReturnClass(_int.ippc.ephyto.IntendedUse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "IntendedUse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPesticides");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "pesticide"));
        oper.setReturnClass(_int.ippc.ephyto.Pesticide[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Pesticide"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateAndDeliverEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "envelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"), _int.ippc.ephyto.HUB_Entities.Envelope.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliverCountryResponseEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "CountryResponseEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "CountryResponseEnvelope"), _int.ippc.ephyto.HUB_Entities.CountryResponseEnvelope.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnvelopeTrackingInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliverPhytoEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ePhytoEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ePhytoEnvelope"), _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProfile");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.Nppo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductDescriptions");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "productDescription"));
        oper.setReturnClass(_int.ippc.ephyto.ProductDescription[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ProductDescription"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliverEnvelope");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "env"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"), _int.ippc.ephyto.HUB_Entities.Envelope.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelopeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUnitMeasures");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasure"));
        oper.setReturnClass(_int.ippc.ephyto.UnitMeasure[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "UnitMeasure"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMeanOfTransports");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "meanOfTransport"));
        oper.setReturnClass(_int.ippc.ephyto.MeanOfTransport[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "MeanOfTransport"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatements");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "statement"));
        oper.setReturnClass(_int.ippc.ephyto.Statement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Statement"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PULLImportEnvelope");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelope"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.Envelope[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelopesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Envelope"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUnderDeliveryEnvelope");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeHeader"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelopeResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "EnvelopeHeader"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConditions");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "condition"));
        oper.setReturnClass(_int.ippc.ephyto.Condition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Condition"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailableChannels");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfChannels"));
        oper.setReturnClass(_int.ippc.ephyto.HUB_Entities.Channel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannelsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Channel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidatePhytoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ePhytoXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationResult"));
        oper.setReturnClass(_int.ippc.ephyto.ValidationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPackageTypes");
        oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "packageType"));
        oper.setReturnClass(_int.ippc.ephyto.PackageType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PackageType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcknowledgeEnvelopeReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AdvancedAcknowledgeEnvelopeReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "warningMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"),
                      "_int.ippc.ephyto.HubWebException",
                      new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"), 
                      true
                     ));
        _operations[26] = oper;

    }

    public DeliveryServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DeliveryServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DeliveryServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfChannelRules");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ChannelRule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRule");
            qName2 = new javax.xml.namespace.QName("", "ChannelRule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfChannels");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Channel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Channel");
            qName2 = new javax.xml.namespace.QName("", "Channel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Envelope[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope");
            qName2 = new javax.xml.namespace.QName("", "Envelope");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeForwarding");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeFrowarding");
            qName2 = new javax.xml.namespace.QName("", "EnvelopeForwarding");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeHeader");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader");
            qName2 = new javax.xml.namespace.QName("", "EnvelopeHeader");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfNppo");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Nppo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo");
            qName2 = new javax.xml.namespace.QName("", "Nppo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Channel");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Channel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "CountryResponseEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.CountryResponseEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Envelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeFrowarding");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ePhytoEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "HUBTrackingInfo");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.HUBTrackingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HUB_Entities.Nppo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeEnvelopeReceipt");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AcknowledgeEnvelopeReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeEnvelopeReceiptResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AcknowledgeEnvelopeReceiptResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeFailedEnvelopeReceipt");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AcknowledgeFailedEnvelopeReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeFailedEnvelopeReceiptResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AcknowledgeFailedEnvelopeReceiptResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "actualDateTime");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ActualDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "additionalDeclaration");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AdditionalDeclaration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdvancedAcknowledgeEnvelopeReceipt");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AdvancedAcknowledgeEnvelopeReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdvancedAcknowledgeEnvelopeReceiptResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AdvancedAcknowledgeEnvelopeReceiptResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "affixedSPSSeal");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AffixedSPSSeal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "allowedDocument");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AllowedDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "applicableSPSClassification");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ApplicableSPSClassification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "applicableSPSProcessCharacteristic");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ApplicableSPSProcessCharacteristic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "baseEntity");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.BaseEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "binaryObjectType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.BinaryObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "certificateStatus");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.CertificateStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "certificateType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.CertificateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelDirection");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ChannelDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRule");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ChannelRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRuleType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ChannelRuleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "completionSPSPeriod");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.CompletionSPSPeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "condition");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Condition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "consigneeSPSParty");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ConsigneeSPSParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "consignorSPSParty");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ConsignorSPSParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverCountryResponseEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverCountryResponseEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverPhytoEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.DeliverPhytoEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "endDateTime");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.EndDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNppos");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetActiveNppos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNpposResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetActiveNpposResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAdditionalDeclarations");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetAdditionalDeclarations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAdditionalDeclarationsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.AdditionalDeclaration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "additionalDeclaration");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdditionalDeclaration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannels");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetAvailableChannels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannelsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetAvailableChannelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetConditions");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetConditions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetConditionsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Condition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "condition");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Condition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfo");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetEnvelopeTrackingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfoResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetEnvelopeTrackingInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeaders");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetImportEnvelopeHeaders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeadersResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetImportEnvelopeHeadersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetIntendedUses");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetIntendedUses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetIntendedUsesResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IntendedUse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "intendedUse");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "IntendedUse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetMeanOfTransports");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetMeanOfTransports.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetMeanOfTransportsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.MeanOfTransport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "meanOfTransport");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "MeanOfTransport");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPackageTypes");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetPackageTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPackageTypesResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PackageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "packageType");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PackageType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPesticides");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetPesticides.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPesticidesResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Pesticide[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "pesticide");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Pesticide");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProductDescriptions");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetProductDescriptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProductDescriptionsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ProductDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "productDescription");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ProductDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfile");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfileResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetStatements");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetStatements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetStatementsResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Statement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "statement");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Statement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetTreatmentTypes");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetTreatmentTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetTreatmentTypesResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.TreatmentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "treatmentType");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "TreatmentType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetUnderDeliveryEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetUnderDeliveryEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnitMeasures");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.GetUnitMeasures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnitMeasuresResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UnitMeasure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasure");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "UnitMeasure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.HubWebException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "idType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "includedSPSNote");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IncludedSPSNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "intendedUse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IntendedUse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "issueDateTime");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IssueDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "issueSPSLocation");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.IssueSPSLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "meanOfTransport");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.MeanOfTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.MeasureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "occurrenceSPSLocation");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.OccurrenceSPSLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "packageType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PackageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "pesticide");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Pesticide.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "productDescription");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ProductDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "providerSPSParty");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ProviderSPSParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PULLImportEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PULLImportEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PULLSingleImportEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.PULLSingleImportEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "referenceSPSReferencedDocument");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ReferenceSPSReferencedDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SetTrackingInfoUpdate");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SetTrackingInfoUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SetTrackingInfoUpdateResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SetTrackingInfoUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "signatorySPSAuthentication");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SignatorySPSAuthentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "signingCertificate");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SigningCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "specifiedSPSAddress");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SpecifiedSPSAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "specifiedSPSPerson");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SpecifiedSPSPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SPSAcknowledgement");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SPSAcknowledgement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SPSCertificate");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SPSCertificate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "spsIssuerSPSParty");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SpsIssuerSPSParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "startDateTime");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.StartDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "statement");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "subordinateSPSCountrySubDivision");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.SubordinateSPSCountrySubDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "transitSPSCountry");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.TransitSPSCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "treatmentType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.TreatmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasure");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UnitMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasureType");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UnitMeasureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unloadingBaseportSPSLocation");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UnloadingBaseportSPSLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "usedSPSTransportMeans");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UsedSPSTransportMeans.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "utilizedSPSTransportEquipment");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.UtilizedSPSTransportEquipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelope");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidateAndDeliverEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelopeResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidateAndDeliverEnvelopeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidatePhytoXML");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidatePhytoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidatePhytoXMLResponse");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidationResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationResult");
            qName2 = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidationResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationArea");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidationArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationLevel");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidationLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationResult");
            cachedSerQNames.add(qName);
            cls = _int.ippc.ephyto.ValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:Standard:QualifiedDataType:21", "dateMandatoryDateTimeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "additionalInformationSPSNote");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "appliedSPSProcess");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "examinationSPSEvent");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExaminationSPSEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "exportSPSCountry");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExportSPSCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "importSPSCountry");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ImportSPSCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "includedSPSClause");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSConsignmentItem");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "includedSPSNoteContent");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSNoteContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSTradeLineItem");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "mainCarriageSPSTransportMovement");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "originSPSCountry");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "physicalSPSPackage");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsAcknowledgementDocument");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsAcknowledgementDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsCargoType");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsCargoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsConsignment");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsConsignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsExchangedDocument");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsExchangedDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType");
            cachedSerQNames.add(qName);
            cls = _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public _int.ippc.ephyto.TreatmentType[] getTreatmentTypes() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetTreatmentTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetTreatmentTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.TreatmentType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.TreatmentType[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.TreatmentType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.AdditionalDeclaration[] getAdditionalDeclarations() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetAdditionalDeclarations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAdditionalDeclarations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.AdditionalDeclaration[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.AdditionalDeclaration[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.AdditionalDeclaration[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.Nppo[] getActiveNppos() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetActiveNppos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNppos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.Nppo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.Nppo[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.Nppo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String acknowledgeFailedEnvelopeReceipt(java.lang.String hubTrackingNumber, java.lang.String message) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/AcknowledgeFailedEnvelopeReceipt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeFailedEnvelopeReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hubTrackingNumber, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getImportEnvelopeHeaders(java.lang.String countryCode) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetImportEnvelopeHeaders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeaders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setTrackingInfoUpdate(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader header) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/SetTrackingInfoUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SetTrackingInfoUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.Envelope PULLSingleImportEnvelope(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/PULLSingleImportEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hubTrackingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.Envelope) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.Envelope) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.Envelope.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.IntendedUse[] getIntendedUses() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetIntendedUses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetIntendedUses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.IntendedUse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.IntendedUse[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.IntendedUse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.Pesticide[] getPesticides() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetPesticides");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPesticides"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.Pesticide[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.Pesticide[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.Pesticide[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader validateAndDeliverEnvelope(_int.ippc.ephyto.HUB_Entities.Envelope envelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/ValidateAndDeliverEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {envelope});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverCountryResponseEnvelope(_int.ippc.ephyto.HUB_Entities.CountryResponseEnvelope countryResponseEnvelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/DeliverCountryResponseEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {countryResponseEnvelope});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getEnvelopeTrackingInfo(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetEnvelopeTrackingInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hubTrackingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverPhytoEnvelope(_int.ippc.ephyto.HUB_Entities.EPhytoEnvelope ePhytoEnvelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/DeliverPhytoEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ePhytoEnvelope});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.Nppo getProfile() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.Nppo) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.Nppo) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.Nppo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.ProductDescription[] getProductDescriptions() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetProductDescriptions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProductDescriptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.ProductDescription[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.ProductDescription[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.ProductDescription[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverEnvelope(_int.ippc.ephyto.HUB_Entities.Envelope env) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/DeliverEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {env});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.UnitMeasure[] getUnitMeasures() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetUnitMeasures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnitMeasures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.UnitMeasure[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.UnitMeasure[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.UnitMeasure[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.MeanOfTransport[] getMeanOfTransports() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetMeanOfTransports");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetMeanOfTransports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.MeanOfTransport[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.MeanOfTransport[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.MeanOfTransport[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.Statement[] getStatements() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetStatements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetStatements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.Statement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.Statement[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.Statement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.Envelope[] PULLImportEnvelope() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/PULLImportEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.Envelope[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.Envelope[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.Envelope[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getUnderDeliveryEnvelope() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetUnderDeliveryEnvelope");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelope"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.Condition[] getConditions() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetConditions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetConditions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.Condition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.Condition[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.Condition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.HUB_Entities.Channel[] getAvailableChannels() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetAvailableChannels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.HUB_Entities.Channel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.HUB_Entities.Channel[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.HUB_Entities.Channel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.ValidationResult[] validatePhytoXML(java.lang.String ePhytoXML) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/ValidatePhytoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidatePhytoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ePhytoXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.ValidationResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.ValidationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.ValidationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public _int.ippc.ephyto.PackageType[] getPackageTypes() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/GetPackageTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPackageTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (_int.ippc.ephyto.PackageType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (_int.ippc.ephyto.PackageType[]) org.apache.axis.utils.JavaUtils.convert(_resp, _int.ippc.ephyto.PackageType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void acknowledgeEnvelopeReceipt(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/AcknowledgeEnvelopeReceipt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeEnvelopeReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hubTrackingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String advancedAcknowledgeEnvelopeReceipt(java.lang.String hubTrackingNumber, java.lang.String warningMessage) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ephyto.ippc.int/IDeliveryService/NegativeAcknowledgeEnvelopeReceipt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdvancedAcknowledgeEnvelopeReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hubTrackingNumber, warningMessage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof _int.ippc.ephyto.HubWebException) {
              throw (_int.ippc.ephyto.HubWebException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
