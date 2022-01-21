/**
 * Nppo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto.HUB_Entities;

public class Nppo  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String receive;

    private java.lang.String send;

    private _int.ippc.ephyto.AllowedDocument[] allowedDocument;

    private _int.ippc.ephyto.SigningCertificate signature;

    private _int.ippc.ephyto.ChannelRule[] channelRules;

    public Nppo() {
    }

    public Nppo(
           java.lang.String country,
           java.lang.String receive,
           java.lang.String send,
           _int.ippc.ephyto.AllowedDocument[] allowedDocument,
           _int.ippc.ephyto.SigningCertificate signature,
           _int.ippc.ephyto.ChannelRule[] channelRules) {
           this.country = country;
           this.receive = receive;
           this.send = send;
           this.allowedDocument = allowedDocument;
           this.signature = signature;
           this.channelRules = channelRules;
    }


    /**
     * Gets the country value for this Nppo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Nppo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the receive value for this Nppo.
     * 
     * @return receive
     */
    public java.lang.String getReceive() {
        return receive;
    }


    /**
     * Sets the receive value for this Nppo.
     * 
     * @param receive
     */
    public void setReceive(java.lang.String receive) {
        this.receive = receive;
    }


    /**
     * Gets the send value for this Nppo.
     * 
     * @return send
     */
    public java.lang.String getSend() {
        return send;
    }


    /**
     * Sets the send value for this Nppo.
     * 
     * @param send
     */
    public void setSend(java.lang.String send) {
        this.send = send;
    }


    /**
     * Gets the allowedDocument value for this Nppo.
     * 
     * @return allowedDocument
     */
    public _int.ippc.ephyto.AllowedDocument[] getAllowedDocument() {
        return allowedDocument;
    }


    /**
     * Sets the allowedDocument value for this Nppo.
     * 
     * @param allowedDocument
     */
    public void setAllowedDocument(_int.ippc.ephyto.AllowedDocument[] allowedDocument) {
        this.allowedDocument = allowedDocument;
    }

    public _int.ippc.ephyto.AllowedDocument getAllowedDocument(int i) {
        return this.allowedDocument[i];
    }

    public void setAllowedDocument(int i, _int.ippc.ephyto.AllowedDocument _value) {
        this.allowedDocument[i] = _value;
    }


    /**
     * Gets the signature value for this Nppo.
     * 
     * @return signature
     */
    public _int.ippc.ephyto.SigningCertificate getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this Nppo.
     * 
     * @param signature
     */
    public void setSignature(_int.ippc.ephyto.SigningCertificate signature) {
        this.signature = signature;
    }


    /**
     * Gets the channelRules value for this Nppo.
     * 
     * @return channelRules
     */
    public _int.ippc.ephyto.ChannelRule[] getChannelRules() {
        return channelRules;
    }


    /**
     * Sets the channelRules value for this Nppo.
     * 
     * @param channelRules
     */
    public void setChannelRules(_int.ippc.ephyto.ChannelRule[] channelRules) {
        this.channelRules = channelRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nppo)) return false;
        Nppo other = (Nppo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.receive==null && other.getReceive()==null) || 
             (this.receive!=null &&
              this.receive.equals(other.getReceive()))) &&
            ((this.send==null && other.getSend()==null) || 
             (this.send!=null &&
              this.send.equals(other.getSend()))) &&
            ((this.allowedDocument==null && other.getAllowedDocument()==null) || 
             (this.allowedDocument!=null &&
              java.util.Arrays.equals(this.allowedDocument, other.getAllowedDocument()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.channelRules==null && other.getChannelRules()==null) || 
             (this.channelRules!=null &&
              java.util.Arrays.equals(this.channelRules, other.getChannelRules())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getReceive() != null) {
            _hashCode += getReceive().hashCode();
        }
        if (getSend() != null) {
            _hashCode += getSend().hashCode();
        }
        if (getAllowedDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getChannelRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelRules(), i);
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
        new org.apache.axis.description.TypeDesc(Nppo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Receive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Send"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "AllowedDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "allowedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "signingCertificate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ChannelRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "channelRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ChannelRule"));
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
