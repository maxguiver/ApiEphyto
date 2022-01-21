/**
 * OriginSPSCountry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class OriginSPSCountry  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String name;

    private _int.ippc.ephyto.SubordinateSPSCountrySubDivision subordinateSPSCountrySubDivision;

    public OriginSPSCountry() {
    }

    public OriginSPSCountry(
           java.lang.String ID,
           java.lang.String name,
           _int.ippc.ephyto.SubordinateSPSCountrySubDivision subordinateSPSCountrySubDivision) {
           this.ID = ID;
           this.name = name;
           this.subordinateSPSCountrySubDivision = subordinateSPSCountrySubDivision;
    }


    /**
     * Gets the ID value for this OriginSPSCountry.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this OriginSPSCountry.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this OriginSPSCountry.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OriginSPSCountry.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the subordinateSPSCountrySubDivision value for this OriginSPSCountry.
     * 
     * @return subordinateSPSCountrySubDivision
     */
    public _int.ippc.ephyto.SubordinateSPSCountrySubDivision getSubordinateSPSCountrySubDivision() {
        return subordinateSPSCountrySubDivision;
    }


    /**
     * Sets the subordinateSPSCountrySubDivision value for this OriginSPSCountry.
     * 
     * @param subordinateSPSCountrySubDivision
     */
    public void setSubordinateSPSCountrySubDivision(_int.ippc.ephyto.SubordinateSPSCountrySubDivision subordinateSPSCountrySubDivision) {
        this.subordinateSPSCountrySubDivision = subordinateSPSCountrySubDivision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginSPSCountry)) return false;
        OriginSPSCountry other = (OriginSPSCountry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.subordinateSPSCountrySubDivision==null && other.getSubordinateSPSCountrySubDivision()==null) || 
             (this.subordinateSPSCountrySubDivision!=null &&
              this.subordinateSPSCountrySubDivision.equals(other.getSubordinateSPSCountrySubDivision())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSubordinateSPSCountrySubDivision() != null) {
            _hashCode += getSubordinateSPSCountrySubDivision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginSPSCountry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "originSPSCountry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subordinateSPSCountrySubDivision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SubordinateSPSCountrySubDivision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "subordinateSPSCountrySubDivision"));
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
