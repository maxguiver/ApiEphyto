/**
 * IncludedSPSConsignmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class IncludedSPSConsignmentItem  implements java.io.Serializable {
    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsCargoType natureIdentificationSPSCargo;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem[] includedSPSTradeLineItem;

    public IncludedSPSConsignmentItem() {
    }

    public IncludedSPSConsignmentItem(
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsCargoType natureIdentificationSPSCargo,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem[] includedSPSTradeLineItem) {
           this.natureIdentificationSPSCargo = natureIdentificationSPSCargo;
           this.includedSPSTradeLineItem = includedSPSTradeLineItem;
    }


    /**
     * Gets the natureIdentificationSPSCargo value for this IncludedSPSConsignmentItem.
     * 
     * @return natureIdentificationSPSCargo
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsCargoType getNatureIdentificationSPSCargo() {
        return natureIdentificationSPSCargo;
    }


    /**
     * Sets the natureIdentificationSPSCargo value for this IncludedSPSConsignmentItem.
     * 
     * @param natureIdentificationSPSCargo
     */
    public void setNatureIdentificationSPSCargo(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.SpsCargoType natureIdentificationSPSCargo) {
        this.natureIdentificationSPSCargo = natureIdentificationSPSCargo;
    }


    /**
     * Gets the includedSPSTradeLineItem value for this IncludedSPSConsignmentItem.
     * 
     * @return includedSPSTradeLineItem
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem[] getIncludedSPSTradeLineItem() {
        return includedSPSTradeLineItem;
    }


    /**
     * Sets the includedSPSTradeLineItem value for this IncludedSPSConsignmentItem.
     * 
     * @param includedSPSTradeLineItem
     */
    public void setIncludedSPSTradeLineItem(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem[] includedSPSTradeLineItem) {
        this.includedSPSTradeLineItem = includedSPSTradeLineItem;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem getIncludedSPSTradeLineItem(int i) {
        return this.includedSPSTradeLineItem[i];
    }

    public void setIncludedSPSTradeLineItem(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSTradeLineItem _value) {
        this.includedSPSTradeLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncludedSPSConsignmentItem)) return false;
        IncludedSPSConsignmentItem other = (IncludedSPSConsignmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natureIdentificationSPSCargo==null && other.getNatureIdentificationSPSCargo()==null) || 
             (this.natureIdentificationSPSCargo!=null &&
              this.natureIdentificationSPSCargo.equals(other.getNatureIdentificationSPSCargo()))) &&
            ((this.includedSPSTradeLineItem==null && other.getIncludedSPSTradeLineItem()==null) || 
             (this.includedSPSTradeLineItem!=null &&
              java.util.Arrays.equals(this.includedSPSTradeLineItem, other.getIncludedSPSTradeLineItem())));
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
        if (getNatureIdentificationSPSCargo() != null) {
            _hashCode += getNatureIdentificationSPSCargo().hashCode();
        }
        if (getIncludedSPSTradeLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludedSPSTradeLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludedSPSTradeLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(IncludedSPSConsignmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSConsignmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureIdentificationSPSCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatureIdentificationSPSCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsCargoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedSPSTradeLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSTradeLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSTradeLineItem"));
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
