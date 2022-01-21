/**
 * DeliverPhytoEnvelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class DeliverPhytoEnvelope  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope ePhytoEnvelope;

    public DeliverPhytoEnvelope() {
    }

    public DeliverPhytoEnvelope(
           _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope ePhytoEnvelope) {
           this.ePhytoEnvelope = ePhytoEnvelope;
    }


    /**
     * Gets the ePhytoEnvelope value for this DeliverPhytoEnvelope.
     * 
     * @return ePhytoEnvelope
     */
    public _int.ippc.ephyto.HUB_Entities.EPhytoEnvelope getEPhytoEnvelope() {
        return ePhytoEnvelope;
    }


    /**
     * Sets the ePhytoEnvelope value for this DeliverPhytoEnvelope.
     * 
     * @param ePhytoEnvelope
     */
    public void setEPhytoEnvelope(_int.ippc.ephyto.HUB_Entities.EPhytoEnvelope ePhytoEnvelope) {
        this.ePhytoEnvelope = ePhytoEnvelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliverPhytoEnvelope)) return false;
        DeliverPhytoEnvelope other = (DeliverPhytoEnvelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ePhytoEnvelope==null && other.getEPhytoEnvelope()==null) || 
             (this.ePhytoEnvelope!=null &&
              this.ePhytoEnvelope.equals(other.getEPhytoEnvelope())));
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
        if (getEPhytoEnvelope() != null) {
            _hashCode += getEPhytoEnvelope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliverPhytoEnvelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliverPhytoEnvelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPhytoEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "ePhytoEnvelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "ePhytoEnvelope"));
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
