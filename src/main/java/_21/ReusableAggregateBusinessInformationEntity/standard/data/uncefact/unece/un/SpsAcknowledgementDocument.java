/**
 * SpsAcknowledgementDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class SpsAcknowledgementDocument  implements java.io.Serializable {
    private java.lang.Object issueDateTime;

    private int statusCode;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType reasonInformation;

    private _int.ippc.ephyto.ReferenceSPSReferencedDocument[] referenceSPSReferencedDocument;

    public SpsAcknowledgementDocument() {
    }

    public SpsAcknowledgementDocument(
           java.lang.Object issueDateTime,
           int statusCode,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType reasonInformation,
           _int.ippc.ephyto.ReferenceSPSReferencedDocument[] referenceSPSReferencedDocument) {
           this.issueDateTime = issueDateTime;
           this.statusCode = statusCode;
           this.reasonInformation = reasonInformation;
           this.referenceSPSReferencedDocument = referenceSPSReferencedDocument;
    }


    /**
     * Gets the issueDateTime value for this SpsAcknowledgementDocument.
     * 
     * @return issueDateTime
     */
    public java.lang.Object getIssueDateTime() {
        return issueDateTime;
    }


    /**
     * Sets the issueDateTime value for this SpsAcknowledgementDocument.
     * 
     * @param issueDateTime
     */
    public void setIssueDateTime(java.lang.Object issueDateTime) {
        this.issueDateTime = issueDateTime;
    }


    /**
     * Gets the statusCode value for this SpsAcknowledgementDocument.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SpsAcknowledgementDocument.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the reasonInformation value for this SpsAcknowledgementDocument.
     * 
     * @return reasonInformation
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getReasonInformation() {
        return reasonInformation;
    }


    /**
     * Sets the reasonInformation value for this SpsAcknowledgementDocument.
     * 
     * @param reasonInformation
     */
    public void setReasonInformation(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType reasonInformation) {
        this.reasonInformation = reasonInformation;
    }


    /**
     * Gets the referenceSPSReferencedDocument value for this SpsAcknowledgementDocument.
     * 
     * @return referenceSPSReferencedDocument
     */
    public _int.ippc.ephyto.ReferenceSPSReferencedDocument[] getReferenceSPSReferencedDocument() {
        return referenceSPSReferencedDocument;
    }


    /**
     * Sets the referenceSPSReferencedDocument value for this SpsAcknowledgementDocument.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpsAcknowledgementDocument)) return false;
        SpsAcknowledgementDocument other = (SpsAcknowledgementDocument) obj;
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
            this.statusCode == other.getStatusCode() &&
            ((this.reasonInformation==null && other.getReasonInformation()==null) || 
             (this.reasonInformation!=null &&
              this.reasonInformation.equals(other.getReasonInformation()))) &&
            ((this.referenceSPSReferencedDocument==null && other.getReferenceSPSReferencedDocument()==null) || 
             (this.referenceSPSReferencedDocument!=null &&
              java.util.Arrays.equals(this.referenceSPSReferencedDocument, other.getReferenceSPSReferencedDocument())));
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
        _hashCode += getStatusCode();
        if (getReasonInformation() != null) {
            _hashCode += getReasonInformation().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpsAcknowledgementDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsAcknowledgementDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IssueDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ReasonInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceSPSReferencedDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ReferenceSPSReferencedDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ReferenceSPSReferencedDocument"));
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
