/**
 * AcknowledgeEnvelopeReceipt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class AcknowledgeEnvelopeReceipt  implements java.io.Serializable {
    private java.lang.String hubTrackingNumber;

    public AcknowledgeEnvelopeReceipt() {
    }

    public AcknowledgeEnvelopeReceipt(
           java.lang.String hubTrackingNumber) {
           this.hubTrackingNumber = hubTrackingNumber;
    }


    /**
     * Gets the hubTrackingNumber value for this AcknowledgeEnvelopeReceipt.
     * 
     * @return hubTrackingNumber
     */
    public java.lang.String getHubTrackingNumber() {
        return hubTrackingNumber;
    }


    /**
     * Sets the hubTrackingNumber value for this AcknowledgeEnvelopeReceipt.
     * 
     * @param hubTrackingNumber
     */
    public void setHubTrackingNumber(java.lang.String hubTrackingNumber) {
        this.hubTrackingNumber = hubTrackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcknowledgeEnvelopeReceipt)) return false;
        AcknowledgeEnvelopeReceipt other = (AcknowledgeEnvelopeReceipt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hubTrackingNumber==null && other.getHubTrackingNumber()==null) || 
             (this.hubTrackingNumber!=null &&
              this.hubTrackingNumber.equals(other.getHubTrackingNumber())));
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
        if (getHubTrackingNumber() != null) {
            _hashCode += getHubTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcknowledgeEnvelopeReceipt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "AcknowledgeEnvelopeReceipt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "hubTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
