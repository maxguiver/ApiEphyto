/**
 * GetActiveNpposResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class GetActiveNpposResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.Nppo[] getActiveNpposResult;

    public GetActiveNpposResponse() {
    }

    public GetActiveNpposResponse(
           _int.ippc.ephyto.HUB_Entities.Nppo[] getActiveNpposResult) {
           this.getActiveNpposResult = getActiveNpposResult;
    }


    /**
     * Gets the getActiveNpposResult value for this GetActiveNpposResponse.
     * 
     * @return getActiveNpposResult
     */
    public _int.ippc.ephyto.HUB_Entities.Nppo[] getGetActiveNpposResult() {
        return getActiveNpposResult;
    }


    /**
     * Sets the getActiveNpposResult value for this GetActiveNpposResponse.
     * 
     * @param getActiveNpposResult
     */
    public void setGetActiveNpposResult(_int.ippc.ephyto.HUB_Entities.Nppo[] getActiveNpposResult) {
        this.getActiveNpposResult = getActiveNpposResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetActiveNpposResponse)) return false;
        GetActiveNpposResponse other = (GetActiveNpposResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getActiveNpposResult==null && other.getGetActiveNpposResult()==null) || 
             (this.getActiveNpposResult!=null &&
              java.util.Arrays.equals(this.getActiveNpposResult, other.getGetActiveNpposResult())));
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
        if (getGetActiveNpposResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetActiveNpposResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetActiveNpposResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetActiveNpposResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNpposResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getActiveNpposResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetActiveNpposResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Nppo"));
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
