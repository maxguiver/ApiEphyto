/**
 * UnitMeasureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class UnitMeasureType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UnitMeasureType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WEIGHT = "WEIGHT";
    public static final java.lang.String _VOLUME = "VOLUME";
    public static final java.lang.String _DURATION = "DURATION";
    public static final java.lang.String _TEMPERATURE = "TEMPERATURE";
    public static final java.lang.String _CONCENTRATION = "CONCENTRATION";
    public static final java.lang.String _AREA = "AREA";
    public static final java.lang.String _DISTANCE = "DISTANCE";
    public static final UnitMeasureType WEIGHT = new UnitMeasureType(_WEIGHT);
    public static final UnitMeasureType VOLUME = new UnitMeasureType(_VOLUME);
    public static final UnitMeasureType DURATION = new UnitMeasureType(_DURATION);
    public static final UnitMeasureType TEMPERATURE = new UnitMeasureType(_TEMPERATURE);
    public static final UnitMeasureType CONCENTRATION = new UnitMeasureType(_CONCENTRATION);
    public static final UnitMeasureType AREA = new UnitMeasureType(_AREA);
    public static final UnitMeasureType DISTANCE = new UnitMeasureType(_DISTANCE);
    public java.lang.String getValue() { return _value_;}
    public static UnitMeasureType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UnitMeasureType enumeration = (UnitMeasureType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UnitMeasureType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UnitMeasureType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unitMeasureType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
