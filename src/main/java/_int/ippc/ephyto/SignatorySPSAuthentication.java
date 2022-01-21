/**
 * SignatorySPSAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class SignatorySPSAuthentication  implements java.io.Serializable {
    private _int.ippc.ephyto.ActualDateTime actualDateTime;

    private _int.ippc.ephyto.IssueSPSLocation issueSPSLocation;

    private _int.ippc.ephyto.ProviderSPSParty providerSPSParty;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause[] includedSPSClause;

    public SignatorySPSAuthentication() {
    }

    public SignatorySPSAuthentication(
           _int.ippc.ephyto.ActualDateTime actualDateTime,
           _int.ippc.ephyto.IssueSPSLocation issueSPSLocation,
           _int.ippc.ephyto.ProviderSPSParty providerSPSParty,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause[] includedSPSClause) {
           this.actualDateTime = actualDateTime;
           this.issueSPSLocation = issueSPSLocation;
           this.providerSPSParty = providerSPSParty;
           this.includedSPSClause = includedSPSClause;
    }


    /**
     * Gets the actualDateTime value for this SignatorySPSAuthentication.
     * 
     * @return actualDateTime
     */
    public _int.ippc.ephyto.ActualDateTime getActualDateTime() {
        return actualDateTime;
    }


    /**
     * Sets the actualDateTime value for this SignatorySPSAuthentication.
     * 
     * @param actualDateTime
     */
    public void setActualDateTime(_int.ippc.ephyto.ActualDateTime actualDateTime) {
        this.actualDateTime = actualDateTime;
    }


    /**
     * Gets the issueSPSLocation value for this SignatorySPSAuthentication.
     * 
     * @return issueSPSLocation
     */
    public _int.ippc.ephyto.IssueSPSLocation getIssueSPSLocation() {
        return issueSPSLocation;
    }


    /**
     * Sets the issueSPSLocation value for this SignatorySPSAuthentication.
     * 
     * @param issueSPSLocation
     */
    public void setIssueSPSLocation(_int.ippc.ephyto.IssueSPSLocation issueSPSLocation) {
        this.issueSPSLocation = issueSPSLocation;
    }


    /**
     * Gets the providerSPSParty value for this SignatorySPSAuthentication.
     * 
     * @return providerSPSParty
     */
    public _int.ippc.ephyto.ProviderSPSParty getProviderSPSParty() {
        return providerSPSParty;
    }


    /**
     * Sets the providerSPSParty value for this SignatorySPSAuthentication.
     * 
     * @param providerSPSParty
     */
    public void setProviderSPSParty(_int.ippc.ephyto.ProviderSPSParty providerSPSParty) {
        this.providerSPSParty = providerSPSParty;
    }


    /**
     * Gets the includedSPSClause value for this SignatorySPSAuthentication.
     * 
     * @return includedSPSClause
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause[] getIncludedSPSClause() {
        return includedSPSClause;
    }


    /**
     * Sets the includedSPSClause value for this SignatorySPSAuthentication.
     * 
     * @param includedSPSClause
     */
    public void setIncludedSPSClause(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause[] includedSPSClause) {
        this.includedSPSClause = includedSPSClause;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause getIncludedSPSClause(int i) {
        return this.includedSPSClause[i];
    }

    public void setIncludedSPSClause(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSClause _value) {
        this.includedSPSClause[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignatorySPSAuthentication)) return false;
        SignatorySPSAuthentication other = (SignatorySPSAuthentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualDateTime==null && other.getActualDateTime()==null) || 
             (this.actualDateTime!=null &&
              this.actualDateTime.equals(other.getActualDateTime()))) &&
            ((this.issueSPSLocation==null && other.getIssueSPSLocation()==null) || 
             (this.issueSPSLocation!=null &&
              this.issueSPSLocation.equals(other.getIssueSPSLocation()))) &&
            ((this.providerSPSParty==null && other.getProviderSPSParty()==null) || 
             (this.providerSPSParty!=null &&
              this.providerSPSParty.equals(other.getProviderSPSParty()))) &&
            ((this.includedSPSClause==null && other.getIncludedSPSClause()==null) || 
             (this.includedSPSClause!=null &&
              java.util.Arrays.equals(this.includedSPSClause, other.getIncludedSPSClause())));
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
        if (getActualDateTime() != null) {
            _hashCode += getActualDateTime().hashCode();
        }
        if (getIssueSPSLocation() != null) {
            _hashCode += getIssueSPSLocation().hashCode();
        }
        if (getProviderSPSParty() != null) {
            _hashCode += getProviderSPSParty().hashCode();
        }
        if (getIncludedSPSClause() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludedSPSClause());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludedSPSClause(), i);
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
        new org.apache.axis.description.TypeDesc(SignatorySPSAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "signatorySPSAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ActualDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "actualDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueSPSLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IssueSPSLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "issueSPSLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerSPSParty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ProviderSPSParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "providerSPSParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedSPSClause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSClause"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSClause"));
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
