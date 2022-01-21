/**
 * ReferenceSPSReferencedDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ReferenceSPSReferencedDocument  implements java.io.Serializable {
    private java.lang.Object issueDateTime;

    private int typeCode;

    private java.lang.String relationshipTypeCode;

    private java.lang.Object ID;

    private _int.ippc.ephyto.BinaryObjectType attachmentBinaryObject;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType information;

    public ReferenceSPSReferencedDocument() {
    }

    public ReferenceSPSReferencedDocument(
           java.lang.Object issueDateTime,
           int typeCode,
           java.lang.String relationshipTypeCode,
           java.lang.Object ID,
           _int.ippc.ephyto.BinaryObjectType attachmentBinaryObject,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType information) {
           this.issueDateTime = issueDateTime;
           this.typeCode = typeCode;
           this.relationshipTypeCode = relationshipTypeCode;
           this.ID = ID;
           this.attachmentBinaryObject = attachmentBinaryObject;
           this.information = information;
    }


    /**
     * Gets the issueDateTime value for this ReferenceSPSReferencedDocument.
     * 
     * @return issueDateTime
     */
    public java.lang.Object getIssueDateTime() {
        return issueDateTime;
    }


    /**
     * Sets the issueDateTime value for this ReferenceSPSReferencedDocument.
     * 
     * @param issueDateTime
     */
    public void setIssueDateTime(java.lang.Object issueDateTime) {
        this.issueDateTime = issueDateTime;
    }


    /**
     * Gets the typeCode value for this ReferenceSPSReferencedDocument.
     * 
     * @return typeCode
     */
    public int getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this ReferenceSPSReferencedDocument.
     * 
     * @param typeCode
     */
    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the relationshipTypeCode value for this ReferenceSPSReferencedDocument.
     * 
     * @return relationshipTypeCode
     */
    public java.lang.String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }


    /**
     * Sets the relationshipTypeCode value for this ReferenceSPSReferencedDocument.
     * 
     * @param relationshipTypeCode
     */
    public void setRelationshipTypeCode(java.lang.String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }


    /**
     * Gets the ID value for this ReferenceSPSReferencedDocument.
     * 
     * @return ID
     */
    public java.lang.Object getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ReferenceSPSReferencedDocument.
     * 
     * @param ID
     */
    public void setID(java.lang.Object ID) {
        this.ID = ID;
    }


    /**
     * Gets the attachmentBinaryObject value for this ReferenceSPSReferencedDocument.
     * 
     * @return attachmentBinaryObject
     */
    public _int.ippc.ephyto.BinaryObjectType getAttachmentBinaryObject() {
        return attachmentBinaryObject;
    }


    /**
     * Sets the attachmentBinaryObject value for this ReferenceSPSReferencedDocument.
     * 
     * @param attachmentBinaryObject
     */
    public void setAttachmentBinaryObject(_int.ippc.ephyto.BinaryObjectType attachmentBinaryObject) {
        this.attachmentBinaryObject = attachmentBinaryObject;
    }


    /**
     * Gets the information value for this ReferenceSPSReferencedDocument.
     * 
     * @return information
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getInformation() {
        return information;
    }


    /**
     * Sets the information value for this ReferenceSPSReferencedDocument.
     * 
     * @param information
     */
    public void setInformation(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType information) {
        this.information = information;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceSPSReferencedDocument)) return false;
        ReferenceSPSReferencedDocument other = (ReferenceSPSReferencedDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issueDateTime==null && other.getIssueDateTime()==null) || 
             (this.issueDateTime!=null &&
              this.issueDateTime.equals(other.getIssueDateTime()))) &&
            this.typeCode == other.getTypeCode() &&
            ((this.relationshipTypeCode==null && other.getRelationshipTypeCode()==null) || 
             (this.relationshipTypeCode!=null &&
              this.relationshipTypeCode.equals(other.getRelationshipTypeCode()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.attachmentBinaryObject==null && other.getAttachmentBinaryObject()==null) || 
             (this.attachmentBinaryObject!=null &&
              this.attachmentBinaryObject.equals(other.getAttachmentBinaryObject()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation())));
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
        if (getIssueDateTime() != null) {
            _hashCode += getIssueDateTime().hashCode();
        }
        _hashCode += getTypeCode();
        if (getRelationshipTypeCode() != null) {
            _hashCode += getRelationshipTypeCode().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getAttachmentBinaryObject() != null) {
            _hashCode += getAttachmentBinaryObject().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceSPSReferencedDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "referenceSPSReferencedDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IssueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
        elemField.setFieldName("relationshipTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "RelationshipTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentBinaryObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "AttachmentBinaryObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "binaryObjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("information");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Information"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
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
