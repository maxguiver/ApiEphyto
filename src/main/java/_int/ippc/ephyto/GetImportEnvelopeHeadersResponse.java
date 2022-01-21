/**
 * GetImportEnvelopeHeadersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class GetImportEnvelopeHeadersResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getImportEnvelopeHeadersResult;

    public GetImportEnvelopeHeadersResponse() {
    }

    public GetImportEnvelopeHeadersResponse(
           _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getImportEnvelopeHeadersResult) {
           this.getImportEnvelopeHeadersResult = getImportEnvelopeHeadersResult;
    }


    /**
     * Gets the getImportEnvelopeHeadersResult value for this GetImportEnvelopeHeadersResponse.
     * 
     * @return getImportEnvelopeHeadersResult
     */
    public _int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getGetImportEnvelopeHeadersResult() {
        return getImportEnvelopeHeadersResult;
    }


    /**
     * Sets the getImportEnvelopeHeadersResult value for this GetImportEnvelopeHeadersResponse.
     * 
     * @param getImportEnvelopeHeadersResult
     */
    public void setGetImportEnvelopeHeadersResult(_int.ippc.ephyto.HUB_Entities.EnvelopeHeader[] getImportEnvelopeHeadersResult) {
        this.getImportEnvelopeHeadersResult = getImportEnvelopeHeadersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetImportEnvelopeHeadersResponse)) return false;
        GetImportEnvelopeHeadersResponse other = (GetImportEnvelopeHeadersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getImportEnvelopeHeadersResult==null && other.getGetImportEnvelopeHeadersResult()==null) || 
             (this.getImportEnvelopeHeadersResult!=null &&
              java.util.Arrays.equals(this.getImportEnvelopeHeadersResult, other.getGetImportEnvelopeHeadersResult())));
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
        if (getGetImportEnvelopeHeadersResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetImportEnvelopeHeadersResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetImportEnvelopeHeadersResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetImportEnvelopeHeadersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeadersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getImportEnvelopeHeadersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetImportEnvelopeHeadersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EnvelopeHeader"));
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
