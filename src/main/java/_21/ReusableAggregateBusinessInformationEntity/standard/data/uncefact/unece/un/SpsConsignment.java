/**
 * SpsConsignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class SpsConsignment  implements java.io.Serializable {
    private _int.ippc.ephyto.ConsignorSPSParty consignorSPSParty;

    private _int.ippc.ephyto.ConsigneeSPSParty consigneeSPSParty;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExportSPSCountry exportSPSCountry;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ImportSPSCountry importSPSCountry;

    private _int.ippc.ephyto.TransitSPSCountry[] transitSPSCountry;

    private _int.ippc.ephyto.UnloadingBaseportSPSLocation unloadingBaseportSPSLocation;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExaminationSPSEvent examinationSPSEvent;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement[] mainCarriageSPSTransportMovement;

    private _int.ippc.ephyto.UtilizedSPSTransportEquipment utilizedSPSTransportEquipment;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem[] includedSPSConsignmentItem;

    public SpsConsignment() {
    }

    public SpsConsignment(
           _int.ippc.ephyto.ConsignorSPSParty consignorSPSParty,
           _int.ippc.ephyto.ConsigneeSPSParty consigneeSPSParty,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExportSPSCountry exportSPSCountry,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ImportSPSCountry importSPSCountry,
           _int.ippc.ephyto.TransitSPSCountry[] transitSPSCountry,
           _int.ippc.ephyto.UnloadingBaseportSPSLocation unloadingBaseportSPSLocation,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExaminationSPSEvent examinationSPSEvent,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement[] mainCarriageSPSTransportMovement,
           _int.ippc.ephyto.UtilizedSPSTransportEquipment utilizedSPSTransportEquipment,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem[] includedSPSConsignmentItem) {
           this.consignorSPSParty = consignorSPSParty;
           this.consigneeSPSParty = consigneeSPSParty;
           this.exportSPSCountry = exportSPSCountry;
           this.importSPSCountry = importSPSCountry;
           this.transitSPSCountry = transitSPSCountry;
           this.unloadingBaseportSPSLocation = unloadingBaseportSPSLocation;
           this.examinationSPSEvent = examinationSPSEvent;
           this.mainCarriageSPSTransportMovement = mainCarriageSPSTransportMovement;
           this.utilizedSPSTransportEquipment = utilizedSPSTransportEquipment;
           this.includedSPSConsignmentItem = includedSPSConsignmentItem;
    }


    /**
     * Gets the consignorSPSParty value for this SpsConsignment.
     * 
     * @return consignorSPSParty
     */
    public _int.ippc.ephyto.ConsignorSPSParty getConsignorSPSParty() {
        return consignorSPSParty;
    }


    /**
     * Sets the consignorSPSParty value for this SpsConsignment.
     * 
     * @param consignorSPSParty
     */
    public void setConsignorSPSParty(_int.ippc.ephyto.ConsignorSPSParty consignorSPSParty) {
        this.consignorSPSParty = consignorSPSParty;
    }


    /**
     * Gets the consigneeSPSParty value for this SpsConsignment.
     * 
     * @return consigneeSPSParty
     */
    public _int.ippc.ephyto.ConsigneeSPSParty getConsigneeSPSParty() {
        return consigneeSPSParty;
    }


    /**
     * Sets the consigneeSPSParty value for this SpsConsignment.
     * 
     * @param consigneeSPSParty
     */
    public void setConsigneeSPSParty(_int.ippc.ephyto.ConsigneeSPSParty consigneeSPSParty) {
        this.consigneeSPSParty = consigneeSPSParty;
    }


    /**
     * Gets the exportSPSCountry value for this SpsConsignment.
     * 
     * @return exportSPSCountry
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExportSPSCountry getExportSPSCountry() {
        return exportSPSCountry;
    }


    /**
     * Sets the exportSPSCountry value for this SpsConsignment.
     * 
     * @param exportSPSCountry
     */
    public void setExportSPSCountry(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExportSPSCountry exportSPSCountry) {
        this.exportSPSCountry = exportSPSCountry;
    }


    /**
     * Gets the importSPSCountry value for this SpsConsignment.
     * 
     * @return importSPSCountry
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ImportSPSCountry getImportSPSCountry() {
        return importSPSCountry;
    }


    /**
     * Sets the importSPSCountry value for this SpsConsignment.
     * 
     * @param importSPSCountry
     */
    public void setImportSPSCountry(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ImportSPSCountry importSPSCountry) {
        this.importSPSCountry = importSPSCountry;
    }


    /**
     * Gets the transitSPSCountry value for this SpsConsignment.
     * 
     * @return transitSPSCountry
     */
    public _int.ippc.ephyto.TransitSPSCountry[] getTransitSPSCountry() {
        return transitSPSCountry;
    }


    /**
     * Sets the transitSPSCountry value for this SpsConsignment.
     * 
     * @param transitSPSCountry
     */
    public void setTransitSPSCountry(_int.ippc.ephyto.TransitSPSCountry[] transitSPSCountry) {
        this.transitSPSCountry = transitSPSCountry;
    }

    public _int.ippc.ephyto.TransitSPSCountry getTransitSPSCountry(int i) {
        return this.transitSPSCountry[i];
    }

    public void setTransitSPSCountry(int i, _int.ippc.ephyto.TransitSPSCountry _value) {
        this.transitSPSCountry[i] = _value;
    }


    /**
     * Gets the unloadingBaseportSPSLocation value for this SpsConsignment.
     * 
     * @return unloadingBaseportSPSLocation
     */
    public _int.ippc.ephyto.UnloadingBaseportSPSLocation getUnloadingBaseportSPSLocation() {
        return unloadingBaseportSPSLocation;
    }


    /**
     * Sets the unloadingBaseportSPSLocation value for this SpsConsignment.
     * 
     * @param unloadingBaseportSPSLocation
     */
    public void setUnloadingBaseportSPSLocation(_int.ippc.ephyto.UnloadingBaseportSPSLocation unloadingBaseportSPSLocation) {
        this.unloadingBaseportSPSLocation = unloadingBaseportSPSLocation;
    }


    /**
     * Gets the examinationSPSEvent value for this SpsConsignment.
     * 
     * @return examinationSPSEvent
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExaminationSPSEvent getExaminationSPSEvent() {
        return examinationSPSEvent;
    }


    /**
     * Sets the examinationSPSEvent value for this SpsConsignment.
     * 
     * @param examinationSPSEvent
     */
    public void setExaminationSPSEvent(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.ExaminationSPSEvent examinationSPSEvent) {
        this.examinationSPSEvent = examinationSPSEvent;
    }


    /**
     * Gets the mainCarriageSPSTransportMovement value for this SpsConsignment.
     * 
     * @return mainCarriageSPSTransportMovement
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement[] getMainCarriageSPSTransportMovement() {
        return mainCarriageSPSTransportMovement;
    }


    /**
     * Sets the mainCarriageSPSTransportMovement value for this SpsConsignment.
     * 
     * @param mainCarriageSPSTransportMovement
     */
    public void setMainCarriageSPSTransportMovement(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement[] mainCarriageSPSTransportMovement) {
        this.mainCarriageSPSTransportMovement = mainCarriageSPSTransportMovement;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement getMainCarriageSPSTransportMovement(int i) {
        return this.mainCarriageSPSTransportMovement[i];
    }

    public void setMainCarriageSPSTransportMovement(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.MainCarriageSPSTransportMovement _value) {
        this.mainCarriageSPSTransportMovement[i] = _value;
    }


    /**
     * Gets the utilizedSPSTransportEquipment value for this SpsConsignment.
     * 
     * @return utilizedSPSTransportEquipment
     */
    public _int.ippc.ephyto.UtilizedSPSTransportEquipment getUtilizedSPSTransportEquipment() {
        return utilizedSPSTransportEquipment;
    }


    /**
     * Sets the utilizedSPSTransportEquipment value for this SpsConsignment.
     * 
     * @param utilizedSPSTransportEquipment
     */
    public void setUtilizedSPSTransportEquipment(_int.ippc.ephyto.UtilizedSPSTransportEquipment utilizedSPSTransportEquipment) {
        this.utilizedSPSTransportEquipment = utilizedSPSTransportEquipment;
    }


    /**
     * Gets the includedSPSConsignmentItem value for this SpsConsignment.
     * 
     * @return includedSPSConsignmentItem
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem[] getIncludedSPSConsignmentItem() {
        return includedSPSConsignmentItem;
    }


    /**
     * Sets the includedSPSConsignmentItem value for this SpsConsignment.
     * 
     * @param includedSPSConsignmentItem
     */
    public void setIncludedSPSConsignmentItem(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem[] includedSPSConsignmentItem) {
        this.includedSPSConsignmentItem = includedSPSConsignmentItem;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem getIncludedSPSConsignmentItem(int i) {
        return this.includedSPSConsignmentItem[i];
    }

    public void setIncludedSPSConsignmentItem(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.IncludedSPSConsignmentItem _value) {
        this.includedSPSConsignmentItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpsConsignment)) return false;
        SpsConsignment other = (SpsConsignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consignorSPSParty==null && other.getConsignorSPSParty()==null) || 
             (this.consignorSPSParty!=null &&
              this.consignorSPSParty.equals(other.getConsignorSPSParty()))) &&
            ((this.consigneeSPSParty==null && other.getConsigneeSPSParty()==null) || 
             (this.consigneeSPSParty!=null &&
              this.consigneeSPSParty.equals(other.getConsigneeSPSParty()))) &&
            ((this.exportSPSCountry==null && other.getExportSPSCountry()==null) || 
             (this.exportSPSCountry!=null &&
              this.exportSPSCountry.equals(other.getExportSPSCountry()))) &&
            ((this.importSPSCountry==null && other.getImportSPSCountry()==null) || 
             (this.importSPSCountry!=null &&
              this.importSPSCountry.equals(other.getImportSPSCountry()))) &&
            ((this.transitSPSCountry==null && other.getTransitSPSCountry()==null) || 
             (this.transitSPSCountry!=null &&
              java.util.Arrays.equals(this.transitSPSCountry, other.getTransitSPSCountry()))) &&
            ((this.unloadingBaseportSPSLocation==null && other.getUnloadingBaseportSPSLocation()==null) || 
             (this.unloadingBaseportSPSLocation!=null &&
              this.unloadingBaseportSPSLocation.equals(other.getUnloadingBaseportSPSLocation()))) &&
            ((this.examinationSPSEvent==null && other.getExaminationSPSEvent()==null) || 
             (this.examinationSPSEvent!=null &&
              this.examinationSPSEvent.equals(other.getExaminationSPSEvent()))) &&
            ((this.mainCarriageSPSTransportMovement==null && other.getMainCarriageSPSTransportMovement()==null) || 
             (this.mainCarriageSPSTransportMovement!=null &&
              java.util.Arrays.equals(this.mainCarriageSPSTransportMovement, other.getMainCarriageSPSTransportMovement()))) &&
            ((this.utilizedSPSTransportEquipment==null && other.getUtilizedSPSTransportEquipment()==null) || 
             (this.utilizedSPSTransportEquipment!=null &&
              this.utilizedSPSTransportEquipment.equals(other.getUtilizedSPSTransportEquipment()))) &&
            ((this.includedSPSConsignmentItem==null && other.getIncludedSPSConsignmentItem()==null) || 
             (this.includedSPSConsignmentItem!=null &&
              java.util.Arrays.equals(this.includedSPSConsignmentItem, other.getIncludedSPSConsignmentItem())));
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
        if (getConsignorSPSParty() != null) {
            _hashCode += getConsignorSPSParty().hashCode();
        }
        if (getConsigneeSPSParty() != null) {
            _hashCode += getConsigneeSPSParty().hashCode();
        }
        if (getExportSPSCountry() != null) {
            _hashCode += getExportSPSCountry().hashCode();
        }
        if (getImportSPSCountry() != null) {
            _hashCode += getImportSPSCountry().hashCode();
        }
        if (getTransitSPSCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransitSPSCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransitSPSCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnloadingBaseportSPSLocation() != null) {
            _hashCode += getUnloadingBaseportSPSLocation().hashCode();
        }
        if (getExaminationSPSEvent() != null) {
            _hashCode += getExaminationSPSEvent().hashCode();
        }
        if (getMainCarriageSPSTransportMovement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainCarriageSPSTransportMovement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainCarriageSPSTransportMovement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUtilizedSPSTransportEquipment() != null) {
            _hashCode += getUtilizedSPSTransportEquipment().hashCode();
        }
        if (getIncludedSPSConsignmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludedSPSConsignmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludedSPSConsignmentItem(), i);
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
        new org.apache.axis.description.TypeDesc(SpsConsignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "spsConsignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignorSPSParty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ConsignorSPSParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "consignorSPSParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consigneeSPSParty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ConsigneeSPSParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "consigneeSPSParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportSPSCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ExportSPSCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "exportSPSCountry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importSPSCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ImportSPSCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "importSPSCountry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitSPSCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "TransitSPSCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "TransitSPSCountry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unloadingBaseportSPSLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "UnloadingBaseportSPSLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "unloadingBaseportSPSLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examinationSPSEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ExaminationSPSEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "examinationSPSEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainCarriageSPSTransportMovement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "MainCarriageSPSTransportMovement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "mainCarriageSPSTransportMovement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilizedSPSTransportEquipment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "UtilizedSPSTransportEquipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "utilizedSPSTransportEquipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedSPSConsignmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSConsignmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSConsignmentItem"));
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
