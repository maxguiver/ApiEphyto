/**
 * DeliverCountryResponseEnvelopeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class DeliverCountryResponseEnvelopeResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverCountryResponseEnvelopeResult;

    public DeliverCountryResponseEnvelopeResponse() {
    }

    public DeliverCountryResponseEnvelopeResponse(
           _int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverCountryResponseEnvelopeResult) {
           this.deliverCountryResponseEnvelopeResult = deliverCountryResponseEnvelopeResult;
    }


    /**
     * Gets the deliverCountryResponseEnvelopeResult value for this DeliverCountryResponseEnvelopeResponse.
     * 
     * @return deliverCountryResponseEnvelopeResult
     */
    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getDeliverCountryResponseEnvelopeResult() {
        return deliverCountryResponseEnvelopeResult;
    }


    /**
     * Sets the deliverCountryResponseEnvelopeResult value for this DeliverCountryResponseEnvelopeResponse.
     * 
     * @param deliverCountryResponseEnvelopeResult
     */
    public void setDeliverCountryResponseEnvelopeResult(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader deliverCountryResponseEnvelopeResult) {
        this.deliverCountryResponseEnvelopeResult = deliverCountryResponseEnvelopeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliverCountryResponseEnvelopeResponse)) return false;
        DeliverCountryResponseEnvelopeResponse other = (DeliverCountryResponseEnvelopeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliverCountryResponseEnvelopeResult==null && other.getDeliverCountryResponseEnvelopeResult()==null) || 
             (this.deliverCountryResponseEnvelopeResult!=null &&
              this.deliverCountryResponseEnvelopeResult.equals(other.getDeliverCountryResponseEnvelopeResult())));
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
        if (getDeliverCountryResponseEnvelopeResult() != null) {
            _hashCode += getDeliverCountryResponseEnvelopeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliverCountryResponseEnvelopeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelopeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverCountryResponseEnvelopeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverCountryResponseEnvelopeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
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
