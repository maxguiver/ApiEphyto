/**
 * EnvelopeFrowarding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto.HUB_Entities;

public class EnvelopeFrowarding  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String hubDeliveryNumber;

    public EnvelopeFrowarding() {
    }

    public EnvelopeFrowarding(
           java.lang.String code,
           java.lang.String hubDeliveryNumber) {
           this.code = code;
           this.hubDeliveryNumber = hubDeliveryNumber;
    }


    /**
     * Gets the code value for this EnvelopeFrowarding.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this EnvelopeFrowarding.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the hubDeliveryNumber value for this EnvelopeFrowarding.
     * 
     * @return hubDeliveryNumber
     */
    public java.lang.String getHubDeliveryNumber() {
        return hubDeliveryNumber;
    }


    /**
     * Sets the hubDeliveryNumber value for this EnvelopeFrowarding.
     * 
     * @param hubDeliveryNumber
     */
    public void setHubDeliveryNumber(java.lang.String hubDeliveryNumber) {
        this.hubDeliveryNumber = hubDeliveryNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeFrowarding)) return false;
        EnvelopeFrowarding other = (EnvelopeFrowarding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.hubDeliveryNumber==null && other.getHubDeliveryNumber()==null) || 
             (this.hubDeliveryNumber!=null &&
              this.hubDeliveryNumber.equals(other.getHubDeliveryNumber())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getHubDeliveryNumber() != null) {
            _hashCode += getHubDeliveryNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeFrowarding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeFrowarding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubDeliveryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "HubDeliveryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
