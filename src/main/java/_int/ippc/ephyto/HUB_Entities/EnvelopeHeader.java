/**
 * EnvelopeHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto.HUB_Entities;

public class EnvelopeHeader  implements java.io.Serializable {
    private java.lang.String from;

    private java.lang.String to;

    private int certificateType;

    private int certificateStatus;

    private java.lang.String NPPOCertificateNumber;

    private java.lang.String hubDeliveryNumber;

    private java.lang.String HUBTrackingInfo;

    private java.lang.String hubDeliveryErrorMessage;

    private _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[] forwardings;

    public EnvelopeHeader() {
    }

    public EnvelopeHeader(
           java.lang.String from,
           java.lang.String to,
           int certificateType,
           int certificateStatus,
           java.lang.String NPPOCertificateNumber,
           java.lang.String hubDeliveryNumber,
           java.lang.String HUBTrackingInfo,
           java.lang.String hubDeliveryErrorMessage,
           _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[] forwardings) {
           this.from = from;
           this.to = to;
           this.certificateType = certificateType;
           this.certificateStatus = certificateStatus;
           this.NPPOCertificateNumber = NPPOCertificateNumber;
           this.hubDeliveryNumber = hubDeliveryNumber;
           this.HUBTrackingInfo = HUBTrackingInfo;
           this.hubDeliveryErrorMessage = hubDeliveryErrorMessage;
           this.forwardings = forwardings;
    }


    /**
     * Gets the from value for this EnvelopeHeader.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this EnvelopeHeader.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this EnvelopeHeader.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this EnvelopeHeader.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the certificateType value for this EnvelopeHeader.
     * 
     * @return certificateType
     */
    public int getCertificateType() {
        return certificateType;
    }


    /**
     * Sets the certificateType value for this EnvelopeHeader.
     * 
     * @param certificateType
     */
    public void setCertificateType(int certificateType) {
        this.certificateType = certificateType;
    }


    /**
     * Gets the certificateStatus value for this EnvelopeHeader.
     * 
     * @return certificateStatus
     */
    public int getCertificateStatus() {
        return certificateStatus;
    }


    /**
     * Sets the certificateStatus value for this EnvelopeHeader.
     * 
     * @param certificateStatus
     */
    public void setCertificateStatus(int certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    /**
     * Gets the NPPOCertificateNumber value for this EnvelopeHeader.
     * 
     * @return NPPOCertificateNumber
     */
    public java.lang.String getNPPOCertificateNumber() {
        return NPPOCertificateNumber;
    }


    /**
     * Sets the NPPOCertificateNumber value for this EnvelopeHeader.
     * 
     * @param NPPOCertificateNumber
     */
    public void setNPPOCertificateNumber(java.lang.String NPPOCertificateNumber) {
        this.NPPOCertificateNumber = NPPOCertificateNumber;
    }


    /**
     * Gets the hubDeliveryNumber value for this EnvelopeHeader.
     * 
     * @return hubDeliveryNumber
     */
    public java.lang.String getHubDeliveryNumber() {
        return hubDeliveryNumber;
    }


    /**
     * Sets the hubDeliveryNumber value for this EnvelopeHeader.
     * 
     * @param hubDeliveryNumber
     */
    public void setHubDeliveryNumber(java.lang.String hubDeliveryNumber) {
        this.hubDeliveryNumber = hubDeliveryNumber;
    }


    /**
     * Gets the HUBTrackingInfo value for this EnvelopeHeader.
     * 
     * @return HUBTrackingInfo
     */
    public java.lang.String getHUBTrackingInfo() {
        return HUBTrackingInfo;
    }


    /**
     * Sets the HUBTrackingInfo value for this EnvelopeHeader.
     * 
     * @param HUBTrackingInfo
     */
    public void setHUBTrackingInfo(java.lang.String HUBTrackingInfo) {
        this.HUBTrackingInfo = HUBTrackingInfo;
    }


    /**
     * Gets the hubDeliveryErrorMessage value for this EnvelopeHeader.
     * 
     * @return hubDeliveryErrorMessage
     */
    public java.lang.String getHubDeliveryErrorMessage() {
        return hubDeliveryErrorMessage;
    }


    /**
     * Sets the hubDeliveryErrorMessage value for this EnvelopeHeader.
     * 
     * @param hubDeliveryErrorMessage
     */
    public void setHubDeliveryErrorMessage(java.lang.String hubDeliveryErrorMessage) {
        this.hubDeliveryErrorMessage = hubDeliveryErrorMessage;
    }


    /**
     * Gets the forwardings value for this EnvelopeHeader.
     * 
     * @return forwardings
     */
    public _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[] getForwardings() {
        return forwardings;
    }


    /**
     * Sets the forwardings value for this EnvelopeHeader.
     * 
     * @param forwardings
     */
    public void setForwardings(_int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[] forwardings) {
        this.forwardings = forwardings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeHeader)) return false;
        EnvelopeHeader other = (EnvelopeHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            this.certificateType == other.getCertificateType() &&
            this.certificateStatus == other.getCertificateStatus() &&
            ((this.NPPOCertificateNumber==null && other.getNPPOCertificateNumber()==null) || 
             (this.NPPOCertificateNumber!=null &&
              this.NPPOCertificateNumber.equals(other.getNPPOCertificateNumber()))) &&
            ((this.hubDeliveryNumber==null && other.getHubDeliveryNumber()==null) || 
             (this.hubDeliveryNumber!=null &&
              this.hubDeliveryNumber.equals(other.getHubDeliveryNumber()))) &&
            ((this.HUBTrackingInfo==null && other.getHUBTrackingInfo()==null) || 
             (this.HUBTrackingInfo!=null &&
              this.HUBTrackingInfo.equals(other.getHUBTrackingInfo()))) &&
            ((this.hubDeliveryErrorMessage==null && other.getHubDeliveryErrorMessage()==null) || 
             (this.hubDeliveryErrorMessage!=null &&
              this.hubDeliveryErrorMessage.equals(other.getHubDeliveryErrorMessage()))) &&
            ((this.forwardings==null && other.getForwardings()==null) || 
             (this.forwardings!=null &&
              java.util.Arrays.equals(this.forwardings, other.getForwardings())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        _hashCode += getCertificateType();
        _hashCode += getCertificateStatus();
        if (getNPPOCertificateNumber() != null) {
            _hashCode += getNPPOCertificateNumber().hashCode();
        }
        if (getHubDeliveryNumber() != null) {
            _hashCode += getHubDeliveryNumber().hashCode();
        }
        if (getHUBTrackingInfo() != null) {
            _hashCode += getHUBTrackingInfo().hashCode();
        }
        if (getHubDeliveryErrorMessage() != null) {
            _hashCode += getHubDeliveryErrorMessage().hashCode();
        }
        if (getForwardings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardings(), i);
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
        new org.apache.axis.description.TypeDesc(EnvelopeHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "CertificateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "CertificateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPPOCertificateNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "NPPOCertificateNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubDeliveryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "hubDeliveryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HUBTrackingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "HUBTrackingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hubDeliveryErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "hubDeliveryErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Forwardings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "EnvelopeFrowarding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EnvelopeForwarding"));
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
