/**
 * SPSAcknowledgement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class SPSAcknowledgement  implements java.io.Serializable {
    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsAcknowledgementDocument SPSAcknowledgementDocument;

    public SPSAcknowledgement() {
    }

    public SPSAcknowledgement(
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsAcknowledgementDocument SPSAcknowledgementDocument) {
           this.SPSAcknowledgementDocument = SPSAcknowledgementDocument;
    }


    /**
     * Gets the SPSAcknowledgementDocument value for this SPSAcknowledgement.
     * 
     * @return SPSAcknowledgementDocument
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsAcknowledgementDocument getSPSAcknowledgementDocument() {
        return SPSAcknowledgementDocument;
    }


    /**
     * Sets the SPSAcknowledgementDocument value for this SPSAcknowledgement.
     * 
     * @param SPSAcknowledgementDocument
     */
    public void setSPSAcknowledgementDocument(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsAcknowledgementDocument SPSAcknowledgementDocument) {
        this.SPSAcknowledgementDocument = SPSAcknowledgementDocument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPSAcknowledgement)) return false;
        SPSAcknowledgement other = (SPSAcknowledgement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SPSAcknowledgementDocument==null && other.getSPSAcknowledgementDocument()==null) || 
             (this.SPSAcknowledgementDocument!=null &&
              this.SPSAcknowledgementDocument.equals(other.getSPSAcknowledgementDocument())));
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
        if (getSPSAcknowledgementDocument() != null) {
            _hashCode += getSPSAcknowledgementDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPSAcknowledgement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SPSAcknowledgement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPSAcknowledgementDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:SPSAcknowledgement:17", "SPSAcknowledgementDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsAcknowledgementDocument"));
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
