/**
 * MeanOfTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class MeanOfTransport  extends _int.ippc.ephyto.BaseEntity  implements java.io.Serializable {
    private boolean active;

    private java.lang.String lang;

    private java.util.Calendar lastModified;

    private java.lang.String lastModifiedBy;

    private java.lang.Integer modeCode;

    private java.lang.String usedTransportMean;

    public MeanOfTransport() {
    }

    public MeanOfTransport(
           boolean active,
           java.lang.String lang,
           java.util.Calendar lastModified,
           java.lang.String lastModifiedBy,
           java.lang.Integer modeCode,
           java.lang.String usedTransportMean) {
        this.active = active;
        this.lang = lang;
        this.lastModified = lastModified;
        this.lastModifiedBy = lastModifiedBy;
        this.modeCode = modeCode;
        this.usedTransportMean = usedTransportMean;
    }


    /**
     * Gets the active value for this MeanOfTransport.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this MeanOfTransport.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the lang value for this MeanOfTransport.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this MeanOfTransport.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the lastModified value for this MeanOfTransport.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this MeanOfTransport.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the lastModifiedBy value for this MeanOfTransport.
     * 
     * @return lastModifiedBy
     */
    public java.lang.String getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this MeanOfTransport.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(java.lang.String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the modeCode value for this MeanOfTransport.
     * 
     * @return modeCode
     */
    public java.lang.Integer getModeCode() {
        return modeCode;
    }


    /**
     * Sets the modeCode value for this MeanOfTransport.
     * 
     * @param modeCode
     */
    public void setModeCode(java.lang.Integer modeCode) {
        this.modeCode = modeCode;
    }


    /**
     * Gets the usedTransportMean value for this MeanOfTransport.
     * 
     * @return usedTransportMean
     */
    public java.lang.String getUsedTransportMean() {
        return usedTransportMean;
    }


    /**
     * Sets the usedTransportMean value for this MeanOfTransport.
     * 
     * @param usedTransportMean
     */
    public void setUsedTransportMean(java.lang.String usedTransportMean) {
        this.usedTransportMean = usedTransportMean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeanOfTransport)) return false;
        MeanOfTransport other = (MeanOfTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.modeCode==null && other.getModeCode()==null) || 
             (this.modeCode!=null &&
              this.modeCode.equals(other.getModeCode()))) &&
            ((this.usedTransportMean==null && other.getUsedTransportMean()==null) || 
             (this.usedTransportMean!=null &&
              this.usedTransportMean.equals(other.getUsedTransportMean())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getModeCode() != null) {
            _hashCode += getModeCode().hashCode();
        }
        if (getUsedTransportMean() != null) {
            _hashCode += getUsedTransportMean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeanOfTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "meanOfTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedTransportMean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedTransportMean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
