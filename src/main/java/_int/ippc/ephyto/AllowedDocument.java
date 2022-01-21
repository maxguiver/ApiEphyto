/**
 * AllowedDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class AllowedDocument  extends _int.ippc.ephyto.BaseEntity  implements java.io.Serializable {
    private _int.ippc.ephyto.CertificateType certificateType;

    private _int.ippc.ephyto.CertificateStatus certificateStatus;

    private boolean active;  // attribute

    public AllowedDocument() {
    }

    public AllowedDocument(
           boolean active,
           _int.ippc.ephyto.CertificateType certificateType,
           _int.ippc.ephyto.CertificateStatus certificateStatus) {
        this.active = active;
        this.certificateType = certificateType;
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the certificateType value for this AllowedDocument.
     * 
     * @return certificateType
     */
    public _int.ippc.ephyto.CertificateType getCertificateType() {
        return certificateType;
    }


    /**
     * Sets the certificateType value for this AllowedDocument.
     * 
     * @param certificateType
     */
    public void setCertificateType(_int.ippc.ephyto.CertificateType certificateType) {
        this.certificateType = certificateType;
    }


    /**
     * Gets the certificateStatus value for this AllowedDocument.
     * 
     * @return certificateStatus
     */
    public _int.ippc.ephyto.CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }


    /**
     * Sets the certificateStatus value for this AllowedDocument.
     * 
     * @param certificateStatus
     */
    public void setCertificateStatus(_int.ippc.ephyto.CertificateStatus certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the active value for this AllowedDocument.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this AllowedDocument.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllowedDocument)) return false;
        AllowedDocument other = (AllowedDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.certificateType==null && other.getCertificateType()==null) || 
             (this.certificateType!=null &&
              this.certificateType.equals(other.getCertificateType()))) &&
            ((this.certificateStatus==null && other.getCertificateStatus()==null) || 
             (this.certificateStatus!=null &&
              this.certificateStatus.equals(other.getCertificateStatus()))) &&
            this.active == other.isActive();
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
        if (getCertificateType() != null) {
            _hashCode += getCertificateType().hashCode();
        }
        if (getCertificateStatus() != null) {
            _hashCode += getCertificateStatus().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllowedDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "allowedDocument"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("active");
        attrField.setXmlName(new javax.xml.namespace.QName("", "active"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "certificateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "certificateStatus"));
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
