/**
 * PhysicalSPSPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class PhysicalSPSPackage  implements java.io.Serializable {
    private int levelCode;

    private java.lang.String typeCode;

    private double itemQuantity;

    public PhysicalSPSPackage() {
    }

    public PhysicalSPSPackage(
           int levelCode,
           java.lang.String typeCode,
           double itemQuantity) {
           this.levelCode = levelCode;
           this.typeCode = typeCode;
           this.itemQuantity = itemQuantity;
    }


    /**
     * Gets the levelCode value for this PhysicalSPSPackage.
     * 
     * @return levelCode
     */
    public int getLevelCode() {
        return levelCode;
    }


    /**
     * Sets the levelCode value for this PhysicalSPSPackage.
     * 
     * @param levelCode
     */
    public void setLevelCode(int levelCode) {
        this.levelCode = levelCode;
    }


    /**
     * Gets the typeCode value for this PhysicalSPSPackage.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this PhysicalSPSPackage.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the itemQuantity value for this PhysicalSPSPackage.
     * 
     * @return itemQuantity
     */
    public double getItemQuantity() {
        return itemQuantity;
    }


    /**
     * Sets the itemQuantity value for this PhysicalSPSPackage.
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalSPSPackage)) return false;
        PhysicalSPSPackage other = (PhysicalSPSPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.levelCode == other.getLevelCode() &&
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            this.itemQuantity == other.getItemQuantity();
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
        _hashCode += getLevelCode();
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        _hashCode += new Double(getItemQuantity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalSPSPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "physicalSPSPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LevelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "TypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ItemQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
