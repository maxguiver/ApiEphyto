/**
 * ExaminationSPSEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class ExaminationSPSEvent  implements java.io.Serializable {
    private _int.ippc.ephyto.OccurrenceSPSLocation occurrenceSPSLocation;

    public ExaminationSPSEvent() {
    }

    public ExaminationSPSEvent(
           _int.ippc.ephyto.OccurrenceSPSLocation occurrenceSPSLocation) {
           this.occurrenceSPSLocation = occurrenceSPSLocation;
    }


    /**
     * Gets the occurrenceSPSLocation value for this ExaminationSPSEvent.
     * 
     * @return occurrenceSPSLocation
     */
    public _int.ippc.ephyto.OccurrenceSPSLocation getOccurrenceSPSLocation() {
        return occurrenceSPSLocation;
    }


    /**
     * Sets the occurrenceSPSLocation value for this ExaminationSPSEvent.
     * 
     * @param occurrenceSPSLocation
     */
    public void setOccurrenceSPSLocation(_int.ippc.ephyto.OccurrenceSPSLocation occurrenceSPSLocation) {
        this.occurrenceSPSLocation = occurrenceSPSLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExaminationSPSEvent)) return false;
        ExaminationSPSEvent other = (ExaminationSPSEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.occurrenceSPSLocation==null && other.getOccurrenceSPSLocation()==null) || 
             (this.occurrenceSPSLocation!=null &&
              this.occurrenceSPSLocation.equals(other.getOccurrenceSPSLocation())));
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
        if (getOccurrenceSPSLocation() != null) {
            _hashCode += getOccurrenceSPSLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExaminationSPSEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "examinationSPSEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occurrenceSPSLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "OccurrenceSPSLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "occurrenceSPSLocation"));
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
