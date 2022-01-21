/**
 * GetAvailableChannelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class GetAvailableChannelsResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.Channel[] getAvailableChannelsResult;

    public GetAvailableChannelsResponse() {
    }

    public GetAvailableChannelsResponse(
           _int.ippc.ephyto.HUB_Entities.Channel[] getAvailableChannelsResult) {
           this.getAvailableChannelsResult = getAvailableChannelsResult;
    }


    /**
     * Gets the getAvailableChannelsResult value for this GetAvailableChannelsResponse.
     * 
     * @return getAvailableChannelsResult
     */
    public _int.ippc.ephyto.HUB_Entities.Channel[] getGetAvailableChannelsResult() {
        return getAvailableChannelsResult;
    }


    /**
     * Sets the getAvailableChannelsResult value for this GetAvailableChannelsResponse.
     * 
     * @param getAvailableChannelsResult
     */
    public void setGetAvailableChannelsResult(_int.ippc.ephyto.HUB_Entities.Channel[] getAvailableChannelsResult) {
        this.getAvailableChannelsResult = getAvailableChannelsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableChannelsResponse)) return false;
        GetAvailableChannelsResponse other = (GetAvailableChannelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAvailableChannelsResult==null && other.getGetAvailableChannelsResult()==null) || 
             (this.getAvailableChannelsResult!=null &&
              java.util.Arrays.equals(this.getAvailableChannelsResult, other.getGetAvailableChannelsResult())));
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
        if (getGetAvailableChannelsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAvailableChannelsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAvailableChannelsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAvailableChannelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAvailableChannelsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetAvailableChannelsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Channel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Channel"));
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
