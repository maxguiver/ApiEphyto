/**
 * UtilizedSPSTransportEquipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class UtilizedSPSTransportEquipment  implements java.io.Serializable {
    private java.lang.String ID;

    private _int.ippc.ephyto.AffixedSPSSeal affixedSPSSeal;

    public UtilizedSPSTransportEquipment() {
    }

    public UtilizedSPSTransportEquipment(
           java.lang.String ID,
           _int.ippc.ephyto.AffixedSPSSeal affixedSPSSeal) {
           this.ID = ID;
           this.affixedSPSSeal = affixedSPSSeal;
    }


    /**
     * Gets the ID value for this UtilizedSPSTransportEquipment.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this UtilizedSPSTransportEquipment.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the affixedSPSSeal value for this UtilizedSPSTransportEquipment.
     * 
     * @return affixedSPSSeal
     */
    public _int.ippc.ephyto.AffixedSPSSeal getAffixedSPSSeal() {
        return affixedSPSSeal;
    }


    /**
     * Sets the affixedSPSSeal value for this UtilizedSPSTransportEquipment.
     * 
     * @param affixedSPSSeal
     */
    public void setAffixedSPSSeal(_int.ippc.ephyto.AffixedSPSSeal affixedSPSSeal) {
        this.affixedSPSSeal = affixedSPSSeal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UtilizedSPSTransportEquipment)) return false;
        UtilizedSPSTransportEquipment other = (UtilizedSPSTransportEquipment) obj;
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
            ((this.affixedSPSSeal==null && other.getAffixedSPSSeal()==null) || 
             (this.affixedSPSSeal!=null &&
              this.affixedSPSSeal.equals(other.getAffixedSPSSeal())));
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
        if (getAffixedSPSSeal() != null) {
            _hashCode += getAffixedSPSSeal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UtilizedSPSTransportEquipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "utilizedSPSTransportEquipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affixedSPSSeal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "AffixedSPSSeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "affixedSPSSeal"));
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
