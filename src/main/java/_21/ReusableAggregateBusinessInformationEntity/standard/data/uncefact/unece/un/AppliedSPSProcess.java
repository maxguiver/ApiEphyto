/**
 * AppliedSPSProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class AppliedSPSProcess  implements java.io.Serializable {
    private java.lang.String typeCode;

    private _int.ippc.ephyto.CompletionSPSPeriod completionSPSPeriod;

    private _int.ippc.ephyto.ApplicableSPSProcessCharacteristic applicableSPSProcessCharacteristic;

    public AppliedSPSProcess() {
    }

    public AppliedSPSProcess(
           java.lang.String typeCode,
           _int.ippc.ephyto.CompletionSPSPeriod completionSPSPeriod,
           _int.ippc.ephyto.ApplicableSPSProcessCharacteristic applicableSPSProcessCharacteristic) {
           this.typeCode = typeCode;
           this.completionSPSPeriod = completionSPSPeriod;
           this.applicableSPSProcessCharacteristic = applicableSPSProcessCharacteristic;
    }


    /**
     * Gets the typeCode value for this AppliedSPSProcess.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this AppliedSPSProcess.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the completionSPSPeriod value for this AppliedSPSProcess.
     * 
     * @return completionSPSPeriod
     */
    public _int.ippc.ephyto.CompletionSPSPeriod getCompletionSPSPeriod() {
        return completionSPSPeriod;
    }


    /**
     * Sets the completionSPSPeriod value for this AppliedSPSProcess.
     * 
     * @param completionSPSPeriod
     */
    public void setCompletionSPSPeriod(_int.ippc.ephyto.CompletionSPSPeriod completionSPSPeriod) {
        this.completionSPSPeriod = completionSPSPeriod;
    }


    /**
     * Gets the applicableSPSProcessCharacteristic value for this AppliedSPSProcess.
     * 
     * @return applicableSPSProcessCharacteristic
     */
    public _int.ippc.ephyto.ApplicableSPSProcessCharacteristic getApplicableSPSProcessCharacteristic() {
        return applicableSPSProcessCharacteristic;
    }


    /**
     * Sets the applicableSPSProcessCharacteristic value for this AppliedSPSProcess.
     * 
     * @param applicableSPSProcessCharacteristic
     */
    public void setApplicableSPSProcessCharacteristic(_int.ippc.ephyto.ApplicableSPSProcessCharacteristic applicableSPSProcessCharacteristic) {
        this.applicableSPSProcessCharacteristic = applicableSPSProcessCharacteristic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppliedSPSProcess)) return false;
        AppliedSPSProcess other = (AppliedSPSProcess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            ((this.completionSPSPeriod==null && other.getCompletionSPSPeriod()==null) || 
             (this.completionSPSPeriod!=null &&
              this.completionSPSPeriod.equals(other.getCompletionSPSPeriod()))) &&
            ((this.applicableSPSProcessCharacteristic==null && other.getApplicableSPSProcessCharacteristic()==null) || 
             (this.applicableSPSProcessCharacteristic!=null &&
              this.applicableSPSProcessCharacteristic.equals(other.getApplicableSPSProcessCharacteristic())));
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
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        if (getCompletionSPSPeriod() != null) {
            _hashCode += getCompletionSPSPeriod().hashCode();
        }
        if (getApplicableSPSProcessCharacteristic() != null) {
            _hashCode += getApplicableSPSProcessCharacteristic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppliedSPSProcess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "appliedSPSProcess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "TypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completionSPSPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "CompletionSPSPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "completionSPSPeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableSPSProcessCharacteristic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ApplicableSPSProcessCharacteristic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "applicableSPSProcessCharacteristic"));
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
