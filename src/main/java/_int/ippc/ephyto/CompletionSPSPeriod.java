/**
 * CompletionSPSPeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class CompletionSPSPeriod  implements java.io.Serializable {
    private _int.ippc.ephyto.StartDateTime startDateTime;

    private _int.ippc.ephyto.EndDateTime endDateTime;

    private _int.ippc.ephyto.MeasureType durationMeasure;

    public CompletionSPSPeriod() {
    }

    public CompletionSPSPeriod(
           _int.ippc.ephyto.StartDateTime startDateTime,
           _int.ippc.ephyto.EndDateTime endDateTime,
           _int.ippc.ephyto.MeasureType durationMeasure) {
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.durationMeasure = durationMeasure;
    }


    /**
     * Gets the startDateTime value for this CompletionSPSPeriod.
     * 
     * @return startDateTime
     */
    public _int.ippc.ephyto.StartDateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this CompletionSPSPeriod.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(_int.ippc.ephyto.StartDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this CompletionSPSPeriod.
     * 
     * @return endDateTime
     */
    public _int.ippc.ephyto.EndDateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this CompletionSPSPeriod.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(_int.ippc.ephyto.EndDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the durationMeasure value for this CompletionSPSPeriod.
     * 
     * @return durationMeasure
     */
    public _int.ippc.ephyto.MeasureType getDurationMeasure() {
        return durationMeasure;
    }


    /**
     * Sets the durationMeasure value for this CompletionSPSPeriod.
     * 
     * @param durationMeasure
     */
    public void setDurationMeasure(_int.ippc.ephyto.MeasureType durationMeasure) {
        this.durationMeasure = durationMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletionSPSPeriod)) return false;
        CompletionSPSPeriod other = (CompletionSPSPeriod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.durationMeasure==null && other.getDurationMeasure()==null) || 
             (this.durationMeasure!=null &&
              this.durationMeasure.equals(other.getDurationMeasure())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDurationMeasure() != null) {
            _hashCode += getDurationMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletionSPSPeriod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "completionSPSPeriod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "startDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "endDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "DurationMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType"));
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
