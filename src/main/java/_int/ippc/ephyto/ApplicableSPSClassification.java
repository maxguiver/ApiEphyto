/**
 * ApplicableSPSClassification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ApplicableSPSClassification  implements java.io.Serializable {
    private java.lang.String systemName;

    private java.lang.String classCode;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] className;

    public ApplicableSPSClassification() {
    }

    public ApplicableSPSClassification(
           java.lang.String systemName,
           java.lang.String classCode,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] className) {
           this.systemName = systemName;
           this.classCode = classCode;
           this.className = className;
    }


    /**
     * Gets the systemName value for this ApplicableSPSClassification.
     * 
     * @return systemName
     */
    public java.lang.String getSystemName() {
        return systemName;
    }


    /**
     * Sets the systemName value for this ApplicableSPSClassification.
     * 
     * @param systemName
     */
    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }


    /**
     * Gets the classCode value for this ApplicableSPSClassification.
     * 
     * @return classCode
     */
    public java.lang.String getClassCode() {
        return classCode;
    }


    /**
     * Sets the classCode value for this ApplicableSPSClassification.
     * 
     * @param classCode
     */
    public void setClassCode(java.lang.String classCode) {
        this.classCode = classCode;
    }


    /**
     * Gets the className value for this ApplicableSPSClassification.
     * 
     * @return className
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] getClassName() {
        return className;
    }


    /**
     * Sets the className value for this ApplicableSPSClassification.
     * 
     * @param className
     */
    public void setClassName(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] className) {
        this.className = className;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getClassName(int i) {
        return this.className[i];
    }

    public void setClassName(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType _value) {
        this.className[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplicableSPSClassification)) return false;
        ApplicableSPSClassification other = (ApplicableSPSClassification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.systemName==null && other.getSystemName()==null) || 
             (this.systemName!=null &&
              this.systemName.equals(other.getSystemName()))) &&
            ((this.classCode==null && other.getClassCode()==null) || 
             (this.classCode!=null &&
              this.classCode.equals(other.getClassCode()))) &&
            ((this.className==null && other.getClassName()==null) || 
             (this.className!=null &&
              java.util.Arrays.equals(this.className, other.getClassName())));
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
        if (getSystemName() != null) {
            _hashCode += getSystemName().hashCode();
        }
        if (getClassCode() != null) {
            _hashCode += getClassCode().hashCode();
        }
        if (getClassName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassName(), i);
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
        new org.apache.axis.description.TypeDesc(ApplicableSPSClassification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "applicableSPSClassification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("className");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ClassName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
