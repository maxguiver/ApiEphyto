/**
 * DeliveryServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class DeliveryServiceSoapBindingSkeleton implements _int.ippc.ephyto.IDeliveryService, org.apache.axis.wsdl.Skeleton {
    private _int.ippc.ephyto.IDeliveryService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getTreatmentTypes", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "TreatmentType"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "treatmentType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetTreatmentTypes"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetTreatmentTypes");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getTreatmentTypes") == null) {
            _myOperations.put("getTreatmentTypes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getTreatmentTypes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getAdditionalDeclarations", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdditionalDeclaration"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "additionalDeclaration"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAdditionalDeclarations"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetAdditionalDeclarations");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAdditionalDeclarations") == null) {
            _myOperations.put("getAdditionalDeclarations", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAdditionalDeclarations")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getActiveNppos", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNpposResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfNppo"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNppos"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetActiveNppos");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getActiveNppos") == null) {
            _myOperations.put("getActiveNppos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getActiveNppos")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("acknowledgeFailedEnvelopeReceipt", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeFailedEnvelopeReceipt"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/AcknowledgeFailedEnvelopeReceipt");
        _myOperationsList.add(_oper);
        if (_myOperations.get("acknowledgeFailedEnvelopeReceipt") == null) {
            _myOperations.put("acknowledgeFailedEnvelopeReceipt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("acknowledgeFailedEnvelopeReceipt")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getImportEnvelopeHeaders", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeadersResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeaders"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetImportEnvelopeHeaders");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getImportEnvelopeHeaders") == null) {
            _myOperations.put("getImportEnvelopeHeaders", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getImportEnvelopeHeaders")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"), _int.ippc.ephyto.HUB_Entities.EnvelopeHeader.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setTrackingInfoUpdate", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SetTrackingInfoUpdate"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/SetTrackingInfoUpdate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setTrackingInfoUpdate") == null) {
            _myOperations.put("setTrackingInfoUpdate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setTrackingInfoUpdate")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("PULLSingleImportEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLSingleImportEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/PULLSingleImportEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("PULLSingleImportEnvelope") == null) {
            _myOperations.put("PULLSingleImportEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("PULLSingleImportEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getIntendedUses", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "IntendedUse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "intendedUse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetIntendedUses"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetIntendedUses");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getIntendedUses") == null) {
            _myOperations.put("getIntendedUses", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getIntendedUses")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getPesticides", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Pesticide"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "pesticide"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPesticides"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetPesticides");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPesticides") == null) {
            _myOperations.put("getPesticides", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPesticides")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "envelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"), _int.ippc.ephyto.HUB_Entities.Envelope.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validateAndDeliverEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/ValidateAndDeliverEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validateAndDeliverEnvelope") == null) {
            _myOperations.put("validateAndDeliverEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validateAndDeliverEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "CountryResponseEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "CountryResponseEnvelope"), _int.ippc.ephyto.HUB_Entities.CountryResponseEnvelope.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deliverCountryResponseEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/DeliverCountryResponseEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deliverCountryResponseEnvelope") == null) {
            _myOperations.put("deliverCountryResponseEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deliverCountryResponseEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEnvelopeTrackingInfo", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfo"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetEnvelopeTrackingInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEnvelopeTrackingInfo") == null) {
            _myOperations.put("getEnvelopeTrackingInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEnvelopeTrackingInfo")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ePhytoEnvelope"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ePhytoEnvelope"), _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deliverPhytoEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/DeliverPhytoEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deliverPhytoEnvelope") == null) {
            _myOperations.put("deliverPhytoEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deliverPhytoEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getProfile", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfileResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfile"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetProfile");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProfile") == null) {
            _myOperations.put("getProfile", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProfile")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getProductDescriptions", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ProductDescription"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "productDescription"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProductDescriptions"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetProductDescriptions");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getProductDescriptions") == null) {
            _myOperations.put("getProductDescriptions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getProductDescriptions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "env"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"), _int.ippc.ephyto.HUB_Entities.Envelope.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deliverEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/DeliverEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deliverEnvelope") == null) {
            _myOperations.put("deliverEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deliverEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getUnitMeasures", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "UnitMeasure"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasure"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnitMeasures"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetUnitMeasures");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUnitMeasures") == null) {
            _myOperations.put("getUnitMeasures", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUnitMeasures")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getMeanOfTransports", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "MeanOfTransport"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "meanOfTransport"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetMeanOfTransports"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetMeanOfTransports");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMeanOfTransports") == null) {
            _myOperations.put("getMeanOfTransports", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMeanOfTransports")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getStatements", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Statement"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "statement"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetStatements"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetStatements");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStatements") == null) {
            _myOperations.put("getStatements", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStatements")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("PULLImportEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelopesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelope"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PULLImportEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/PULLImportEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("PULLImportEnvelope") == null) {
            _myOperations.put("PULLImportEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("PULLImportEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getUnderDeliveryEnvelope", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelopeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfEnvelopeHeader"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetUnderDeliveryEnvelope"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetUnderDeliveryEnvelope");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUnderDeliveryEnvelope") == null) {
            _myOperations.put("getUnderDeliveryEnvelope", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUnderDeliveryEnvelope")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getConditions", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "Condition"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "condition"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetConditions"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetConditions");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getConditions") == null) {
            _myOperations.put("getConditions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getConditions")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getAvailableChannels", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannelsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ArrayOfChannels"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannels"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetAvailableChannels");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAvailableChannels") == null) {
            _myOperations.put("getAvailableChannels", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAvailableChannels")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ePhytoXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validatePhytoXML", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "validationResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidatePhytoXML"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/ValidatePhytoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validatePhytoXML") == null) {
            _myOperations.put("validatePhytoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validatePhytoXML")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getPackageTypes", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "PackageType"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "packageType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetPackageTypes"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/GetPackageTypes");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPackageTypes") == null) {
            _myOperations.put("getPackageTypes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPackageTypes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("acknowledgeEnvelopeReceipt", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeEnvelopeReceipt"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/AcknowledgeEnvelopeReceipt");
        _myOperationsList.add(_oper);
        if (_myOperations.get("acknowledgeEnvelopeReceipt") == null) {
            _myOperations.put("acknowledgeEnvelopeReceipt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("acknowledgeEnvelopeReceipt")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "warningMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("advancedAcknowledgeEnvelopeReceipt", _params, new javax.xml.namespace.QName("http://ephyto.ippc.int/", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AdvancedAcknowledgeEnvelopeReceipt"));
        _oper.setSoapAction("http://ephyto.ippc.int/IDeliveryService/NegativeAcknowledgeEnvelopeReceipt");
        _myOperationsList.add(_oper);
        if (_myOperations.get("advancedAcknowledgeEnvelopeReceipt") == null) {
            _myOperations.put("advancedAcknowledgeEnvelopeReceipt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("advancedAcknowledgeEnvelopeReceipt")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("HubWebException");
        _fault.setQName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _fault.setClassName("_int.ippc.ephyto.HubWebException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "HubWebException"));
        _oper.addFault(_fault);
    }

    public DeliveryServiceSoapBindingSkeleton() {
        this.impl = new _int.ippc.ephyto.DeliveryServiceSoapBindingImpl();
    }

    public DeliveryServiceSoapBindingSkeleton(_int.ippc.ephyto.IDeliveryService impl) {
        this.impl = impl;
    }
    public _int.ippc.ephyto.TreatmentType[] getTreatmentTypes() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.TreatmentType[] ret = impl.getTreatmentTypes();
        return ret;
    }

    public _int.ippc.ephyto.AdditionalDeclaration[] getAdditionalDeclarations() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.AdditionalDeclaration[] ret = impl.getAdditionalDeclarations();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.Nppo[] getActiveNppos() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.Nppo[] ret = impl.getActiveNppos();
        return ret;
    }

    public java.lang.String acknowledgeFailedEnvelopeReceipt(java.lang.String hubTrackingNumber, java.lang.String message) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        java.lang.String ret = impl.acknowledgeFailedEnvelopeReceipt(hubTrackingNumber, message);
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getImportEnvelopeHeaders(java.lang.String countryCode) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] ret = impl.getImportEnvelopeHeaders(countryCode);
        return ret;
    }

    public void setTrackingInfoUpdate(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader header) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        impl.setTrackingInfoUpdate(header);
    }

    public _int.ippc.ephyto.HUB_Entities.Envelope PULLSingleImportEnvelope(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.Envelope ret = impl.PULLSingleImportEnvelope(hubTrackingNumber);
        return ret;
    }

    public _int.ippc.ephyto.IntendedUse[] getIntendedUses() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.IntendedUse[] ret = impl.getIntendedUses();
        return ret;
    }

    public _int.ippc.ephyto.Pesticide[] getPesticides() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.Pesticide[] ret = impl.getPesticides();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader validateAndDeliverEnvelope(_int.ippc.ephyto.HUB_Entities.Envelope envelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader ret = impl.validateAndDeliverEnvelope(envelope);
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverCountryResponseEnvelope(_int.ippc.ephyto.HUB_Entities.CountryResponseEnvelope countryResponseEnvelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader ret = impl.deliverCountryResponseEnvelope(countryResponseEnvelope);
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getEnvelopeTrackingInfo(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader ret = impl.getEnvelopeTrackingInfo(hubTrackingNumber);
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverPhytoEnvelope(_int.ippc.ephyto.HUB_Entities.EPhytoEnvelope ePhytoEnvelope) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader ret = impl.deliverPhytoEnvelope(ePhytoEnvelope);
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.Nppo getProfile() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.Nppo ret = impl.getProfile();
        return ret;
    }

    public _int.ippc.ephyto.ProductDescription[] getProductDescriptions() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.ProductDescription[] ret = impl.getProductDescriptions();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverEnvelope(_int.ippc.ephyto.HUB_Entities.Envelope env) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader ret = impl.deliverEnvelope(env);
        return ret;
    }

    public _int.ippc.ephyto.UnitMeasure[] getUnitMeasures() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.UnitMeasure[] ret = impl.getUnitMeasures();
        return ret;
    }

    public _int.ippc.ephyto.MeanOfTransport[] getMeanOfTransports() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.MeanOfTransport[] ret = impl.getMeanOfTransports();
        return ret;
    }

    public _int.ippc.ephyto.Statement[] getStatements() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.Statement[] ret = impl.getStatements();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.Envelope[] PULLImportEnvelope() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.Envelope[] ret = impl.PULLImportEnvelope();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getUnderDeliveryEnvelope() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] ret = impl.getUnderDeliveryEnvelope();
        return ret;
    }

    public _int.ippc.ephyto.Condition[] getConditions() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.Condition[] ret = impl.getConditions();
        return ret;
    }

    public _int.ippc.ephyto.HUB_Entities.Channel[] getAvailableChannels() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.HUB_Entities.Channel[] ret = impl.getAvailableChannels();
        return ret;
    }

    public _int.ippc.ephyto.ValidationResult[] validatePhytoXML(java.lang.String ePhytoXML) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.ValidationResult[] ret = impl.validatePhytoXML(ePhytoXML);
        return ret;
    }

    public _int.ippc.ephyto.PackageType[] getPackageTypes() throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        _int.ippc.ephyto.PackageType[] ret = impl.getPackageTypes();
        return ret;
    }

    public void acknowledgeEnvelopeReceipt(java.lang.String hubTrackingNumber) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        impl.acknowledgeEnvelopeReceipt(hubTrackingNumber);
    }

    public java.lang.String advancedAcknowledgeEnvelopeReceipt(java.lang.String hubTrackingNumber, java.lang.String warningMessage) throws java.rmi.RemoteException, _int.ippc.ephyto.HubWebException
    {
        java.lang.String ret = impl.advancedAcknowledgeEnvelopeReceipt(hubTrackingNumber, warningMessage);
        return ret;
    }

}
