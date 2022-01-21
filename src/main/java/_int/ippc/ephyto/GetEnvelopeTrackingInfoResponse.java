/**
 * GetEnvelopeTrackingInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class GetEnvelopeTrackingInfoResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getEnvelopeTrackingInfoResult;

    public GetEnvelopeTrackingInfoResponse() {
    }

    public GetEnvelopeTrackingInfoResponse(
           _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getEnvelopeTrackingInfoResult) {
           this.getEnvelopeTrackingInfoResult = getEnvelopeTrackingInfoResult;
    }


    /**
     * Gets the getEnvelopeTrackingInfoResult value for this GetEnvelopeTrackingInfoResponse.
     * 
     * @return getEnvelopeTrackingInfoResult
     */
    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader getGetEnvelopeTrackingInfoResult() {
        return getEnvelopeTrackingInfoResult;
    }


    /**
     * Sets the getEnvelopeTrackingInfoResult value for this GetEnvelopeTrackingInfoResponse.
     * 
     * @param getEnvelopeTrackingInfoResult
     */
    public void setGetEnvelopeTrackingInfoResult(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader getEnvelopeTrackingInfoResult) {
        this.getEnvelopeTrackingInfoResult = getEnvelopeTrackingInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnvelopeTrackingInfoResponse)) return false;
        GetEnvelopeTrackingInfoResponse other = (GetEnvelopeTrackingInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEnvelopeTrackingInfoResult==null && other.getGetEnvelopeTrackingInfoResult()==null) || 
             (this.getEnvelopeTrackingInfoResult!=null &&
              this.getEnvelopeTrackingInfoResult.equals(other.getGetEnvelopeTrackingInfoResult())));
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
        if (getGetEnvelopeTrackingInfoResult() != null) {
            _hashCode += getGetEnvelopeTrackingInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnvelopeTrackingInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEnvelopeTrackingInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetEnvelopeTrackingInfoResult"));
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
