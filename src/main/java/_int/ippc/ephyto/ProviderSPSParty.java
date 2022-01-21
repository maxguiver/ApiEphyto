/**
 * ProviderSPSParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ProviderSPSParty  implements java.io.Serializable {
    private java.lang.String name;

    private _int.ippc.ephyto.SpecifiedSPSPerson specifiedSPSPerson;

    public ProviderSPSParty() {
    }

    public ProviderSPSParty(
           java.lang.String name,
           _int.ippc.ephyto.SpecifiedSPSPerson specifiedSPSPerson) {
           this.name = name;
           this.specifiedSPSPerson = specifiedSPSPerson;
    }


    /**
     * Gets the name value for this ProviderSPSParty.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProviderSPSParty.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the specifiedSPSPerson value for this ProviderSPSParty.
     * 
     * @return specifiedSPSPerson
     */
    public _int.ippc.ephyto.SpecifiedSPSPerson getSpecifiedSPSPerson() {
        return specifiedSPSPerson;
    }


    /**
     * Sets the specifiedSPSPerson value for this ProviderSPSParty.
     * 
     * @param specifiedSPSPerson
     */
    public void setSpecifiedSPSPerson(_int.ippc.ephyto.SpecifiedSPSPerson specifiedSPSPerson) {
        this.specifiedSPSPerson = specifiedSPSPerson;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProviderSPSParty)) return false;
        ProviderSPSParty other = (ProviderSPSParty) obj;
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
            ((this.specifiedSPSPerson==null && other.getSpecifiedSPSPerson()==null) || 
             (this.specifiedSPSPerson!=null &&
              this.specifiedSPSPerson.equals(other.getSpecifiedSPSPerson())));
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
        if (getSpecifiedSPSPerson() != null) {
            _hashCode += getSpecifiedSPSPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProviderSPSParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "providerSPSParty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specifiedSPSPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SpecifiedSPSPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "specifiedSPSPerson"));
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
