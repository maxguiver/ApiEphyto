/**
 * SpsExchangedDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class SpsExchangedDocument  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ID;

    private int typeCode;

    private int statusCode;

    private java.lang.Object issueDateTime;

    private _int.ippc.ephyto.SpsIssuerSPSParty issuerSPSParty;

    private _int.ippc.ephyto.IncludedSPSNote[] includedSPSNote;

    private _int.ippc.ephyto.ReferenceSPSReferencedDocument[] referenceSPSReferencedDocument;

    private _int.ippc.ephyto.SignatorySPSAuthentication signatorySPSAuthentication;

    public SpsExchangedDocument() {
    }

    public SpsExchangedDocument(
           java.lang.String name,
           java.lang.String ID,
           int typeCode,
           int statusCode,
           java.lang.Object issueDateTime,
           _int.ippc.ephyto.SpsIssuerSPSParty issuerSPSParty,
           _int.ippc.ephyto.IncludedSPSNote[] includedSPSNote,
           _int.ippc.ephyto.ReferenceSPSReferencedDocument[] referenceSPSReferencedDocument,
           _int.ippc.ephyto.SignatorySPSAuthentication signatorySPSAuthentication) {
           this.name = name;
           this.ID = ID;
           this.typeCode = typeCode;
           this.statusCode = statusCode;
           this.issueDateTime = issueDateTime;
           this.issuerSPSParty = issuerSPSParty;
           this.includedSPSNote = includedSPSNote;
           this.referenceSPSReferencedDocument = referenceSPSReferencedDocument;
           this.signatorySPSAuthentication = signatorySPSAuthentication;
    }


    /**
     * Gets the name value for this SpsExchangedDocument.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SpsExchangedDocument.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ID value for this SpsExchangedDocument.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SpsExchangedDocument.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the typeCode value for this SpsExchangedDocument.
     * 
     * @return typeCode
     */
    public int getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this SpsExchangedDocument.
     * 
     * @param typeCode
     */
    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the statusCode value for this SpsExchangedDocument.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SpsExchangedDocument.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the issueDateTime value for this SpsExchangedDocument.
     * 
     * @return issueDateTime
     */
    public java.lang.Object getIssueDateTime() {
        return issueDateTime;
    }


    /**
     * Sets the issueDateTime value for this SpsExchangedDocument.
     * 
     * @param issueDateTime
     */
    public void setIssueDateTime(java.lang.Object issueDateTime) {
        this.issueDateTime = issueDateTime;
    }


    /**
     * Gets the issuerSPSParty value for this SpsExchangedDocument.
     * 
     * @return issuerSPSParty
     */
    public _int.ippc.ephyto.SpsIssuerSPSParty getIssuerSPSParty() {
        return issuerSPSParty;
    }


    /**
     * Sets the issuerSPSParty value for this SpsExchangedDocument.
     * 
     * @param issuerSPSParty
     */
    public void setIssuerSPSParty(_int.ippc.ephyto.SpsIssuerSPSParty issuerSPSParty) {
        this.issuerSPSParty = issuerSPSParty;
    }


    /**
     * Gets the includedSPSNote value for this SpsExchangedDocument.
     * 
     * @return includedSPSNote
     */
    public _int.ippc.ephyto.IncludedSPSNote[] getIncludedSPSNote() {
        return includedSPSNote;
    }


    /**
     * Sets the includedSPSNote value for this SpsExchangedDocument.
     * 
     * @param includedSPSNote
     */
    public void setIncludedSPSNote(_int.ippc.ephyto.IncludedSPSNote[] includedSPSNote) {
        this.includedSPSNote = includedSPSNote;
    }

    public _int.ippc.ephyto.IncludedSPSNote getIncludedSPSNote(int i) {
        return this.includedSPSNote[i];
    }

    public void setIncludedSPSNote(int i, _int.ippc.ephyto.IncludedSPSNote _value) {
        this.includedSPSNote[i] = _value;
    }


    /**
     * Gets the referenceSPSReferencedDocument value for this SpsExchangedDocument.
     * 
     * @return referenceSPSReferencedDocument
     */
    public _int.ippc.ephyto.ReferenceSPSReferencedDocument[] getReferenceSPSReferencedDocument() {
        return referenceSPSReferencedDocument;
    }


    /**
     * Sets the referenceSPSReferencedDocument value for this SpsExchangedDocument.
     * 
     * @param referenceSPSReferencedDocument
     */
    public void setReferenceSPSReferencedDocument(_int.ippc.ephyto.ReferenceSPSReferencedDocument[] referenceSPSReferencedDocument) {
        this.referenceSPSReferencedDocument = referenceSPSReferencedDocument;
    }

    public _int.ippc.ephyto.ReferenceSPSReferencedDocument getReferenceSPSReferencedDocument(int i) {
        return this.referenceSPSReferencedDocument[i];
    }

    public void setReferenceSPSReferencedDocument(int i, _int.ippc.ephyto.ReferenceSPSReferencedDocument _value) {
        this.referenceSPSReferencedDocument[i] = _value;
    }


    /**
     * Gets the signatorySPSAuthentication value for this SpsExchangedDocument.
     * 
     * @return signatorySPSAuthentication
     */
    public _int.ippc.ephyto.SignatorySPSAuthentication getSignatorySPSAuthentication() {
        return signatorySPSAuthentication;
    }


    /**
     * Sets the signatorySPSAuthentication value for this SpsExchangedDocument.
     * 
     * @param signatorySPSAuthentication
     */
    public void setSignatorySPSAuthentication(_int.ippc.ephyto.SignatorySPSAuthentication signatorySPSAuthentication) {
        this.signatorySPSAuthentication = signatorySPSAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpsExchangedDocument)) return false;
        SpsExchangedDocument other = (SpsExchangedDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            this.typeCode == other.getTypeCode() &&
            this.statusCode == other.getStatusCode() &&
            ((this.issueDateTime==null && other.getIssueDateTime()==null) || 
             (this.issueDateTime!=null &&
              this.issueDateTime.equals(other.getIssueDateTime()))) &&
            ((this.issuerSPSParty==null && other.getIssuerSPSParty()==null) || 
             (this.issuerSPSParty!=null &&
              this.issuerSPSParty.equals(other.getIssuerSPSParty()))) &&
            ((this.includedSPSNote==null && other.getIncludedSPSNote()==null) || 
             (this.includedSPSNote!=null &&
              java.util.Arrays.equals(this.includedSPSNote, other.getIncludedSPSNote()))) &&
            ((this.referenceSPSReferencedDocument==null && other.getReferenceSPSReferencedDocument()==null) || 
             (this.referenceSPSReferencedDocument!=null &&
              java.util.Arrays.equals(this.referenceSPSReferencedDocument, other.getReferenceSPSReferencedDocument()))) &&
            ((this.signatorySPSAuthentication==null && other.getSignatorySPSAuthentication()==null) || 
             (this.signatorySPSAuthentication!=null &&
              this.signatorySPSAuthentication.equals(other.getSignatorySPSAuthentication())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        _hashCode += getTypeCode();
        _hashCode += getStatusCode();
        if (getIssueDateTime() != null) {
            _hashCode += getIssueDateTime().hashCode();
        }
        if (getIssuerSPSParty() != null) {
            _hashCode += getIssuerSPSParty().hashCode();
        }
        if (getIncludedSPSNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludedSPSNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludedSPSNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceSPSReferencedDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceSPSReferencedDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceSPSReferencedDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignatorySPSAuthentication() != null) {
            _hashCode += getSignatorySPSAuthentication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpsExchangedDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsExchangedDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "TypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IssueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerSPSParty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IssuerSPSParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "spsIssuerSPSParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedSPSNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceSPSReferencedDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ReferenceSPSReferencedDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ReferenceSPSReferencedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatorySPSAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SignatorySPSAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "signatorySPSAuthentication"));
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
