/**
 * MainCarriageSPSTransportMovement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class MainCarriageSPSTransportMovement  implements java.io.Serializable {
    private java.lang.String ID;

    private int modeCode;

    private _int.ippc.ephyto.UsedSPSTransportMeans usedSPSTransportMeans;

    public MainCarriageSPSTransportMovement() {
    }

    public MainCarriageSPSTransportMovement(
           java.lang.String ID,
           int modeCode,
           _int.ippc.ephyto.UsedSPSTransportMeans usedSPSTransportMeans) {
           this.ID = ID;
           this.modeCode = modeCode;
           this.usedSPSTransportMeans = usedSPSTransportMeans;
    }


    /**
     * Gets the ID value for this MainCarriageSPSTransportMovement.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this MainCarriageSPSTransportMovement.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the modeCode value for this MainCarriageSPSTransportMovement.
     * 
     * @return modeCode
     */
    public int getModeCode() {
        return modeCode;
    }


    /**
     * Sets the modeCode value for this MainCarriageSPSTransportMovement.
     * 
     * @param modeCode
     */
    public void setModeCode(int modeCode) {
        this.modeCode = modeCode;
    }


    /**
     * Gets the usedSPSTransportMeans value for this MainCarriageSPSTransportMovement.
     * 
     * @return usedSPSTransportMeans
     */
    public _int.ippc.ephyto.UsedSPSTransportMeans getUsedSPSTransportMeans() {
        return usedSPSTransportMeans;
    }


    /**
     * Sets the usedSPSTransportMeans value for this MainCarriageSPSTransportMovement.
     * 
     * @param usedSPSTransportMeans
     */
    public void setUsedSPSTransportMeans(_int.ippc.ephyto.UsedSPSTransportMeans usedSPSTransportMeans) {
        this.usedSPSTransportMeans = usedSPSTransportMeans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MainCarriageSPSTransportMovement)) return false;
        MainCarriageSPSTransportMovement other = (MainCarriageSPSTransportMovement) obj;
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
            this.modeCode == other.getModeCode() &&
            ((this.usedSPSTransportMeans==null && other.getUsedSPSTransportMeans()==null) || 
             (this.usedSPSTransportMeans!=null &&
              this.usedSPSTransportMeans.equals(other.getUsedSPSTransportMeans())));
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
        _hashCode += getModeCode();
        if (getUsedSPSTransportMeans() != null) {
            _hashCode += getUsedSPSTransportMeans().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MainCarriageSPSTransportMovement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "mainCarriageSPSTransportMovement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ModeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSPSTransportMeans");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "UsedSPSTransportMeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "usedSPSTransportMeans"));
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
