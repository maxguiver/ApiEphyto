/**
 * EPhytoEnvelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto.HUB_Entities;

public class EPhytoEnvelope  extends _int.ippc.ephyto.HUB_Entities.EnvelopeHeader  implements java.io.Serializable {
    private _int.ippc.ephyto.SPSCertificate SPSCertificate;

    public EPhytoEnvelope() {
    }

    public EPhytoEnvelope(
           java.lang.String from,
           java.lang.String to,
           int certificateType,
           int certificateStatus,
           java.lang.String NPPOCertificateNumber,
           java.lang.String hubDeliveryNumber,
           java.lang.String HUBTrackingInfo,
           java.lang.String hubDeliveryErrorMessage,
           _int.ippc.ephyto.HUB_Entities.EnvelopeFrowarding[] forwardings,
           _int.ippc.ephyto.SPSCertificate SPSCertificate) {
        super(
            from,
            to,
            certificateType,
            certificateStatus,
            NPPOCertificateNumber,
            hubDeliveryNumber,
            HUBTrackingInfo,
            hubDeliveryErrorMessage,
            forwardings);
        this.SPSCertificate = SPSCertificate;
    }


    /**
     * Gets the SPSCertificate value for this EPhytoEnvelope.
     * 
     * @return SPSCertificate
     */
    public _int.ippc.ephyto.SPSCertificate getSPSCertificate() {
        return SPSCertificate;
    }


    /**
     * Sets the SPSCertificate value for this EPhytoEnvelope.
     * 
     * @param SPSCertificate
     */
    public void setSPSCertificate(_int.ippc.ephyto.SPSCertificate SPSCertificate) {
        this.SPSCertificate = SPSCertificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EPhytoEnvelope)) return false;
        EPhytoEnvelope other = (EPhytoEnvelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SPSCertificate==null && other.getSPSCertificate()==null) || 
             (this.SPSCertificate!=null &&
              this.SPSCertificate.equals(other.getSPSCertificate())));
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
        if (getSPSCertificate() != null) {
            _hashCode += getSPSCertificate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EPhytoEnvelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ePhytoEnvelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPSCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:SPSCertificate:17", "SPSCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "SPSCertificate"));
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
