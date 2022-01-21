/**
 * ChannelRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ChannelRule  extends _int.ippc.ephyto.BaseEntity  implements java.io.Serializable {
    private int id;  // attribute

    private boolean active;  // attribute

    private _int.ippc.ephyto.ChannelRuleType ruleType;  // attribute

    private int certificateType;  // attribute

    private int certificateStatus;  // attribute

    private java.lang.String countryCode;  // attribute

    private _int.ippc.ephyto.ChannelDirection direction;  // attribute

    public ChannelRule() {
    }

    public ChannelRule(
           int id,
           boolean active,
           _int.ippc.ephyto.ChannelRuleType ruleType,
           int certificateType,
           int certificateStatus,
           java.lang.String countryCode,
           _int.ippc.ephyto.ChannelDirection direction) {
        this.id = id;
        this.active = active;
        this.ruleType = ruleType;
        this.certificateType = certificateType;
        this.certificateStatus = certificateStatus;
        this.countryCode = countryCode;
        this.direction = direction;
    }


    /**
     * Gets the id value for this ChannelRule.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ChannelRule.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the active value for this ChannelRule.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ChannelRule.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the ruleType value for this ChannelRule.
     * 
     * @return ruleType
     */
    public _int.ippc.ephyto.ChannelRuleType getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this ChannelRule.
     * 
     * @param ruleType
     */
    public void setRuleType(_int.ippc.ephyto.ChannelRuleType ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * Gets the certificateType value for this ChannelRule.
     * 
     * @return certificateType
     */
    public int getCertificateType() {
        return certificateType;
    }


    /**
     * Sets the certificateType value for this ChannelRule.
     * 
     * @param certificateType
     */
    public void setCertificateType(int certificateType) {
        this.certificateType = certificateType;
    }


    /**
     * Gets the certificateStatus value for this ChannelRule.
     * 
     * @return certificateStatus
     */
    public int getCertificateStatus() {
        return certificateStatus;
    }


    /**
     * Sets the certificateStatus value for this ChannelRule.
     * 
     * @param certificateStatus
     */
    public void setCertificateStatus(int certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the countryCode value for this ChannelRule.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ChannelRule.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the direction value for this ChannelRule.
     * 
     * @return direction
     */
    public _int.ippc.ephyto.ChannelDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this ChannelRule.
     * 
     * @param direction
     */
    public void setDirection(_int.ippc.ephyto.ChannelDirection direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelRule)) return false;
        ChannelRule other = (ChannelRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.id == other.getId() &&
            this.active == other.isActive() &&
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType()))) &&
            this.certificateType == other.getCertificateType() &&
            this.certificateStatus == other.getCertificateStatus() &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getId();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
        }
        _hashCode += getCertificateType();
        _hashCode += getCertificateStatus();
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChannelRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRule"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("active");
        attrField.setXmlName(new javax.xml.namespace.QName("", "active"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ruleType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ruleType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRuleType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificateType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "certificateType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("certificateStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "certificateStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("countryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("direction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelDirection"));
        typeDesc.addFieldDesc(attrField);
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
