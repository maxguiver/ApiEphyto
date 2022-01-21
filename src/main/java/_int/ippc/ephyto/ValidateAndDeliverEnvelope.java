/**
 * ValidateAndDeliverEnvelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ValidateAndDeliverEnvelope  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.Envelope envelope;

    public ValidateAndDeliverEnvelope() {
    }

    public ValidateAndDeliverEnvelope(
           _int.ippc.ephyto.HUB_Entities.Envelope envelope) {
           this.envelope = envelope;
    }


    /**
     * Gets the envelope value for this ValidateAndDeliverEnvelope.
     * 
     * @return envelope
     */
    public _int.ippc.ephyto.HUB_Entities.Envelope getEnvelope() {
        return envelope;
    }


    /**
     * Sets the envelope value for this ValidateAndDeliverEnvelope.
     * 
     * @param envelope
     */
    public void setEnvelope(_int.ippc.ephyto.HUB_Entities.Envelope envelope) {
        this.envelope = envelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateAndDeliverEnvelope)) return false;
        ValidateAndDeliverEnvelope other = (ValidateAndDeliverEnvelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelope==null && other.getEnvelope()==null) || 
             (this.envelope!=null &&
              this.envelope.equals(other.getEnvelope())));
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
        if (getEnvelope() != null) {
            _hashCode += getEnvelope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateAndDeliverEnvelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ValidateAndDeliverEnvelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "envelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Envelope"));
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
