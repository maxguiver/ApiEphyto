/**
 * SpecifiedSPSAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class SpecifiedSPSAddress  implements java.io.Serializable {
    private java.lang.String lineOne;

    private java.lang.String lineTwo;

    private java.lang.String lineThree;

    private java.lang.String lineFour;

    private java.lang.String lineFive;

    public SpecifiedSPSAddress() {
    }

    public SpecifiedSPSAddress(
           java.lang.String lineOne,
           java.lang.String lineTwo,
           java.lang.String lineThree,
           java.lang.String lineFour,
           java.lang.String lineFive) {
           this.lineOne = lineOne;
           this.lineTwo = lineTwo;
           this.lineThree = lineThree;
           this.lineFour = lineFour;
           this.lineFive = lineFive;
    }


    /**
     * Gets the lineOne value for this SpecifiedSPSAddress.
     * 
     * @return lineOne
     */
    public java.lang.String getLineOne() {
        return lineOne;
    }


    /**
     * Sets the lineOne value for this SpecifiedSPSAddress.
     * 
     * @param lineOne
     */
    public void setLineOne(java.lang.String lineOne) {
        this.lineOne = lineOne;
    }


    /**
     * Gets the lineTwo value for this SpecifiedSPSAddress.
     * 
     * @return lineTwo
     */
    public java.lang.String getLineTwo() {
        return lineTwo;
    }


    /**
     * Sets the lineTwo value for this SpecifiedSPSAddress.
     * 
     * @param lineTwo
     */
    public void setLineTwo(java.lang.String lineTwo) {
        this.lineTwo = lineTwo;
    }


    /**
     * Gets the lineThree value for this SpecifiedSPSAddress.
     * 
     * @return lineThree
     */
    public java.lang.String getLineThree() {
        return lineThree;
    }


    /**
     * Sets the lineThree value for this SpecifiedSPSAddress.
     * 
     * @param lineThree
     */
    public void setLineThree(java.lang.String lineThree) {
        this.lineThree = lineThree;
    }


    /**
     * Gets the lineFour value for this SpecifiedSPSAddress.
     * 
     * @return lineFour
     */
    public java.lang.String getLineFour() {
        return lineFour;
    }


    /**
     * Sets the lineFour value for this SpecifiedSPSAddress.
     * 
     * @param lineFour
     */
    public void setLineFour(java.lang.String lineFour) {
        this.lineFour = lineFour;
    }


    /**
     * Gets the lineFive value for this SpecifiedSPSAddress.
     * 
     * @return lineFive
     */
    public java.lang.String getLineFive() {
        return lineFive;
    }


    /**
     * Sets the lineFive value for this SpecifiedSPSAddress.
     * 
     * @param lineFive
     */
    public void setLineFive(java.lang.String lineFive) {
        this.lineFive = lineFive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecifiedSPSAddress)) return false;
        SpecifiedSPSAddress other = (SpecifiedSPSAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineOne==null && other.getLineOne()==null) || 
             (this.lineOne!=null &&
              this.lineOne.equals(other.getLineOne()))) &&
            ((this.lineTwo==null && other.getLineTwo()==null) || 
             (this.lineTwo!=null &&
              this.lineTwo.equals(other.getLineTwo()))) &&
            ((this.lineThree==null && other.getLineThree()==null) || 
             (this.lineThree!=null &&
              this.lineThree.equals(other.getLineThree()))) &&
            ((this.lineFour==null && other.getLineFour()==null) || 
             (this.lineFour!=null &&
              this.lineFour.equals(other.getLineFour()))) &&
            ((this.lineFive==null && other.getLineFive()==null) || 
             (this.lineFive!=null &&
              this.lineFive.equals(other.getLineFive())));
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
        if (getLineOne() != null) {
            _hashCode += getLineOne().hashCode();
        }
        if (getLineTwo() != null) {
            _hashCode += getLineTwo().hashCode();
        }
        if (getLineThree() != null) {
            _hashCode += getLineThree().hashCode();
        }
        if (getLineFour() != null) {
            _hashCode += getLineFour().hashCode();
        }
        if (getLineFive() != null) {
            _hashCode += getLineFive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecifiedSPSAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "specifiedSPSAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOne");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LineOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LineTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineThree");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LineThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineFour");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LineFour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineFive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "LineFive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
