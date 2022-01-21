/**
 * HUBTrackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto.HUB_Entities;

public class HUBTrackingInfo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HUBTrackingInfo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PendingDelivery = "PendingDelivery";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _FailedDelivery = "FailedDelivery";
    public static final java.lang.String _EnvelopeNotExists = "EnvelopeNotExists";
    public static final java.lang.String _DeliveredWithWarnings = "DeliveredWithWarnings";
    public static final java.lang.String _DeliveredNotReadable = "DeliveredNotReadable";
    public static final HUBTrackingInfo PendingDelivery = new HUBTrackingInfo(_PendingDelivery);
    public static final HUBTrackingInfo Delivered = new HUBTrackingInfo(_Delivered);
    public static final HUBTrackingInfo FailedDelivery = new HUBTrackingInfo(_FailedDelivery);
    public static final HUBTrackingInfo EnvelopeNotExists = new HUBTrackingInfo(_EnvelopeNotExists);
    public static final HUBTrackingInfo DeliveredWithWarnings = new HUBTrackingInfo(_DeliveredWithWarnings);
    public static final HUBTrackingInfo DeliveredNotReadable = new HUBTrackingInfo(_DeliveredNotReadable);
    public java.lang.String getValue() { return _value_;}
    public static HUBTrackingInfo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HUBTrackingInfo enumeration = (HUBTrackingInfo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HUBTrackingInfo fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HUBTrackingInfo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "HUBTrackingInfo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
