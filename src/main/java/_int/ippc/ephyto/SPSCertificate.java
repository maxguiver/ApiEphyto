/**
 * SPSCertificate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class SPSCertificate  implements java.io.Serializable {
    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsExchangedDocument SPSExchangedDocument;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsConsignment SPSConsignment;

    public SPSCertificate() {
    }

    public SPSCertificate(
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsExchangedDocument SPSExchangedDocument,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsConsignment SPSConsignment) {
           this.SPSExchangedDocument = SPSExchangedDocument;
           this.SPSConsignment = SPSConsignment;
    }


    /**
     * Gets the SPSExchangedDocument value for this SPSCertificate.
     * 
     * @return SPSExchangedDocument
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsExchangedDocument getSPSExchangedDocument() {
        return SPSExchangedDocument;
    }


    /**
     * Sets the SPSExchangedDocument value for this SPSCertificate.
     * 
     * @param SPSExchangedDocument
     */
    public void setSPSExchangedDocument(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsExchangedDocument SPSExchangedDocument) {
        this.SPSExchangedDocument = SPSExchangedDocument;
    }


    /**
     * Gets the SPSConsignment value for this SPSCertificate.
     * 
     * @return SPSConsignment
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsConsignment getSPSConsignment() {
        return SPSConsignment;
    }


    /**
     * Sets the SPSConsignment value for this SPSCertificate.
     * 
     * @param SPSConsignment
     */
    public void setSPSConsignment(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsConsignment SPSConsignment) {
        this.SPSConsignment = SPSConsignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPSCertificate)) return false;
        SPSCertificate other = (SPSCertificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SPSExchangedDocument==null && other.getSPSExchangedDocument()==null) || 
             (this.SPSExchangedDocument!=null &&
              this.SPSExchangedDocument.equals(other.getSPSExchangedDocument()))) &&
            ((this.SPSConsignment==null && other.getSPSConsignment()==null) || 
             (this.SPSConsignment!=null &&
              this.SPSConsignment.equals(other.getSPSConsignment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSPSExchangedDocument() != null) {
            _hashCode += getSPSExchangedDocument().hashCode();
        }
        if (getSPSConsignment() != null) {
            _hashCode += getSPSConsignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPSCertificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SPSCertificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPSExchangedDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:SPSCertificate:17", "SPSExchangedDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsExchangedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPSConsignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:SPSCertificate:17", "SPSConsignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsConsignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
