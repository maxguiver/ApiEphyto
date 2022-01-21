/**
 * IncludedSPSTradeLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un;

public class IncludedSPSTradeLineItem  implements java.io.Serializable {
    private int sequenceNumeric;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] description;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] commonName;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] scientificName;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] intendedUse;

    private _int.ippc.ephyto.MeasureType netWeightMeasure;

    private _int.ippc.ephyto.MeasureType grossWeightMeasure;

    private _int.ippc.ephyto.MeasureType netVolumeMeasure;

    private _int.ippc.ephyto.MeasureType grossVolumeMeasure;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote[] additionalInformationSPSNote;

    private _int.ippc.ephyto.ApplicableSPSClassification[] applicableSPSClassification;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage[] physicalSPSPackage;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry[] originSPSCountry;

    private _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess[] appliedSPSProcess;

    public IncludedSPSTradeLineItem() {
    }

    public IncludedSPSTradeLineItem(
           int sequenceNumeric,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] description,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] commonName,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] scientificName,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] intendedUse,
           _int.ippc.ephyto.MeasureType netWeightMeasure,
           _int.ippc.ephyto.MeasureType grossWeightMeasure,
           _int.ippc.ephyto.MeasureType netVolumeMeasure,
           _int.ippc.ephyto.MeasureType grossVolumeMeasure,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote[] additionalInformationSPSNote,
           _int.ippc.ephyto.ApplicableSPSClassification[] applicableSPSClassification,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage[] physicalSPSPackage,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry[] originSPSCountry,
           _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess[] appliedSPSProcess) {
           this.sequenceNumeric = sequenceNumeric;
           this.description = description;
           this.commonName = commonName;
           this.scientificName = scientificName;
           this.intendedUse = intendedUse;
           this.netWeightMeasure = netWeightMeasure;
           this.grossWeightMeasure = grossWeightMeasure;
           this.netVolumeMeasure = netVolumeMeasure;
           this.grossVolumeMeasure = grossVolumeMeasure;
           this.additionalInformationSPSNote = additionalInformationSPSNote;
           this.applicableSPSClassification = applicableSPSClassification;
           this.physicalSPSPackage = physicalSPSPackage;
           this.originSPSCountry = originSPSCountry;
           this.appliedSPSProcess = appliedSPSProcess;
    }


    /**
     * Gets the sequenceNumeric value for this IncludedSPSTradeLineItem.
     * 
     * @return sequenceNumeric
     */
    public int getSequenceNumeric() {
        return sequenceNumeric;
    }


    /**
     * Sets the sequenceNumeric value for this IncludedSPSTradeLineItem.
     * 
     * @param sequenceNumeric
     */
    public void setSequenceNumeric(int sequenceNumeric) {
        this.sequenceNumeric = sequenceNumeric;
    }


    /**
     * Gets the description value for this IncludedSPSTradeLineItem.
     * 
     * @return description
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this IncludedSPSTradeLineItem.
     * 
     * @param description
     */
    public void setDescription(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] description) {
        this.description = description;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the commonName value for this IncludedSPSTradeLineItem.
     * 
     * @return commonName
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] getCommonName() {
        return commonName;
    }


    /**
     * Sets the commonName value for this IncludedSPSTradeLineItem.
     * 
     * @param commonName
     */
    public void setCommonName(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] commonName) {
        this.commonName = commonName;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getCommonName(int i) {
        return this.commonName[i];
    }

    public void setCommonName(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType _value) {
        this.commonName[i] = _value;
    }


    /**
     * Gets the scientificName value for this IncludedSPSTradeLineItem.
     * 
     * @return scientificName
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] getScientificName() {
        return scientificName;
    }


    /**
     * Sets the scientificName value for this IncludedSPSTradeLineItem.
     * 
     * @param scientificName
     */
    public void setScientificName(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] scientificName) {
        this.scientificName = scientificName;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getScientificName(int i) {
        return this.scientificName[i];
    }

    public void setScientificName(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType _value) {
        this.scientificName[i] = _value;
    }


    /**
     * Gets the intendedUse value for this IncludedSPSTradeLineItem.
     * 
     * @return intendedUse
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] getIntendedUse() {
        return intendedUse;
    }


    /**
     * Sets the intendedUse value for this IncludedSPSTradeLineItem.
     * 
     * @param intendedUse
     */
    public void setIntendedUse(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType[] intendedUse) {
        this.intendedUse = intendedUse;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType getIntendedUse(int i) {
        return this.intendedUse[i];
    }

    public void setIntendedUse(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.TextType _value) {
        this.intendedUse[i] = _value;
    }


    /**
     * Gets the netWeightMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @return netWeightMeasure
     */
    public _int.ippc.ephyto.MeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }


    /**
     * Sets the netWeightMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @param netWeightMeasure
     */
    public void setNetWeightMeasure(_int.ippc.ephyto.MeasureType netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }


    /**
     * Gets the grossWeightMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @return grossWeightMeasure
     */
    public _int.ippc.ephyto.MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }


    /**
     * Sets the grossWeightMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @param grossWeightMeasure
     */
    public void setGrossWeightMeasure(_int.ippc.ephyto.MeasureType grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
    }


    /**
     * Gets the netVolumeMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @return netVolumeMeasure
     */
    public _int.ippc.ephyto.MeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }


    /**
     * Sets the netVolumeMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @param netVolumeMeasure
     */
    public void setNetVolumeMeasure(_int.ippc.ephyto.MeasureType netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }


    /**
     * Gets the grossVolumeMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @return grossVolumeMeasure
     */
    public _int.ippc.ephyto.MeasureType getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }


    /**
     * Sets the grossVolumeMeasure value for this IncludedSPSTradeLineItem.
     * 
     * @param grossVolumeMeasure
     */
    public void setGrossVolumeMeasure(_int.ippc.ephyto.MeasureType grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
    }


    /**
     * Gets the additionalInformationSPSNote value for this IncludedSPSTradeLineItem.
     * 
     * @return additionalInformationSPSNote
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote[] getAdditionalInformationSPSNote() {
        return additionalInformationSPSNote;
    }


    /**
     * Sets the additionalInformationSPSNote value for this IncludedSPSTradeLineItem.
     * 
     * @param additionalInformationSPSNote
     */
    public void setAdditionalInformationSPSNote(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote[] additionalInformationSPSNote) {
        this.additionalInformationSPSNote = additionalInformationSPSNote;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote getAdditionalInformationSPSNote(int i) {
        return this.additionalInformationSPSNote[i];
    }

    public void setAdditionalInformationSPSNote(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AdditionalInformationSPSNote _value) {
        this.additionalInformationSPSNote[i] = _value;
    }


    /**
     * Gets the applicableSPSClassification value for this IncludedSPSTradeLineItem.
     * 
     * @return applicableSPSClassification
     */
    public _int.ippc.ephyto.ApplicableSPSClassification[] getApplicableSPSClassification() {
        return applicableSPSClassification;
    }


    /**
     * Sets the applicableSPSClassification value for this IncludedSPSTradeLineItem.
     * 
     * @param applicableSPSClassification
     */
    public void setApplicableSPSClassification(_int.ippc.ephyto.ApplicableSPSClassification[] applicableSPSClassification) {
        this.applicableSPSClassification = applicableSPSClassification;
    }

    public _int.ippc.ephyto.ApplicableSPSClassification getApplicableSPSClassification(int i) {
        return this.applicableSPSClassification[i];
    }

    public void setApplicableSPSClassification(int i, _int.ippc.ephyto.ApplicableSPSClassification _value) {
        this.applicableSPSClassification[i] = _value;
    }


    /**
     * Gets the physicalSPSPackage value for this IncludedSPSTradeLineItem.
     * 
     * @return physicalSPSPackage
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage[] getPhysicalSPSPackage() {
        return physicalSPSPackage;
    }


    /**
     * Sets the physicalSPSPackage value for this IncludedSPSTradeLineItem.
     * 
     * @param physicalSPSPackage
     */
    public void setPhysicalSPSPackage(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage[] physicalSPSPackage) {
        this.physicalSPSPackage = physicalSPSPackage;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage getPhysicalSPSPackage(int i) {
        return this.physicalSPSPackage[i];
    }

    public void setPhysicalSPSPackage(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.PhysicalSPSPackage _value) {
        this.physicalSPSPackage[i] = _value;
    }


    /**
     * Gets the originSPSCountry value for this IncludedSPSTradeLineItem.
     * 
     * @return originSPSCountry
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry[] getOriginSPSCountry() {
        return originSPSCountry;
    }


    /**
     * Sets the originSPSCountry value for this IncludedSPSTradeLineItem.
     * 
     * @param originSPSCountry
     */
    public void setOriginSPSCountry(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry[] originSPSCountry) {
        this.originSPSCountry = originSPSCountry;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry getOriginSPSCountry(int i) {
        return this.originSPSCountry[i];
    }

    public void setOriginSPSCountry(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.OriginSPSCountry _value) {
        this.originSPSCountry[i] = _value;
    }


    /**
     * Gets the appliedSPSProcess value for this IncludedSPSTradeLineItem.
     * 
     * @return appliedSPSProcess
     */
    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess[] getAppliedSPSProcess() {
        return appliedSPSProcess;
    }


    /**
     * Sets the appliedSPSProcess value for this IncludedSPSTradeLineItem.
     * 
     * @param appliedSPSProcess
     */
    public void setAppliedSPSProcess(_21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess[] appliedSPSProcess) {
        this.appliedSPSProcess = appliedSPSProcess;
    }

    public _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess getAppliedSPSProcess(int i) {
        return this.appliedSPSProcess[i];
    }

    public void setAppliedSPSProcess(int i, _21.ReusableAggregateBusinessInformationEntity.standard.data.uncefact.unece.un.AppliedSPSProcess _value) {
        this.appliedSPSProcess[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncludedSPSTradeLineItem)) return false;
        IncludedSPSTradeLineItem other = (IncludedSPSTradeLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sequenceNumeric == other.getSequenceNumeric() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.commonName==null && other.getCommonName()==null) || 
             (this.commonName!=null &&
              java.util.Arrays.equals(this.commonName, other.getCommonName()))) &&
            ((this.scientificName==null && other.getScientificName()==null) || 
             (this.scientificName!=null &&
              java.util.Arrays.equals(this.scientificName, other.getScientificName()))) &&
            ((this.intendedUse==null && other.getIntendedUse()==null) || 
             (this.intendedUse!=null &&
              java.util.Arrays.equals(this.intendedUse, other.getIntendedUse()))) &&
            ((this.netWeightMeasure==null && other.getNetWeightMeasure()==null) || 
             (this.netWeightMeasure!=null &&
              this.netWeightMeasure.equals(other.getNetWeightMeasure()))) &&
            ((this.grossWeightMeasure==null && other.getGrossWeightMeasure()==null) || 
             (this.grossWeightMeasure!=null &&
              this.grossWeightMeasure.equals(other.getGrossWeightMeasure()))) &&
            ((this.netVolumeMeasure==null && other.getNetVolumeMeasure()==null) || 
             (this.netVolumeMeasure!=null &&
              this.netVolumeMeasure.equals(other.getNetVolumeMeasure()))) &&
            ((this.grossVolumeMeasure==null && other.getGrossVolumeMeasure()==null) || 
             (this.grossVolumeMeasure!=null &&
              this.grossVolumeMeasure.equals(other.getGrossVolumeMeasure()))) &&
            ((this.additionalInformationSPSNote==null && other.getAdditionalInformationSPSNote()==null) || 
             (this.additionalInformationSPSNote!=null &&
              java.util.Arrays.equals(this.additionalInformationSPSNote, other.getAdditionalInformationSPSNote()))) &&
            ((this.applicableSPSClassification==null && other.getApplicableSPSClassification()==null) || 
             (this.applicableSPSClassification!=null &&
              java.util.Arrays.equals(this.applicableSPSClassification, other.getApplicableSPSClassification()))) &&
            ((this.physicalSPSPackage==null && other.getPhysicalSPSPackage()==null) || 
             (this.physicalSPSPackage!=null &&
              java.util.Arrays.equals(this.physicalSPSPackage, other.getPhysicalSPSPackage()))) &&
            ((this.originSPSCountry==null && other.getOriginSPSCountry()==null) || 
             (this.originSPSCountry!=null &&
              java.util.Arrays.equals(this.originSPSCountry, other.getOriginSPSCountry()))) &&
            ((this.appliedSPSProcess==null && other.getAppliedSPSProcess()==null) || 
             (this.appliedSPSProcess!=null &&
              java.util.Arrays.equals(this.appliedSPSProcess, other.getAppliedSPSProcess())));
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
        _hashCode += getSequenceNumeric();
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommonName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommonName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommonName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScientificName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScientificName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScientificName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntendedUse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntendedUse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntendedUse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetWeightMeasure() != null) {
            _hashCode += getNetWeightMeasure().hashCode();
        }
        if (getGrossWeightMeasure() != null) {
            _hashCode += getGrossWeightMeasure().hashCode();
        }
        if (getNetVolumeMeasure() != null) {
            _hashCode += getNetVolumeMeasure().hashCode();
        }
        if (getGrossVolumeMeasure() != null) {
            _hashCode += getGrossVolumeMeasure().hashCode();
        }
        if (getAdditionalInformationSPSNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInformationSPSNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInformationSPSNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicableSPSClassification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicableSPSClassification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicableSPSClassification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhysicalSPSPackage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalSPSPackage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalSPSPackage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginSPSCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginSPSCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginSPSCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedSPSProcess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedSPSProcess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedSPSProcess(), i);
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
        new org.apache.axis.description.TypeDesc(IncludedSPSTradeLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IncludedSPSTradeLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumeric");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SequenceNumeric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "CommonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scientificName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ScientificName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intendedUse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "IntendedUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWeightMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "NetWeightMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossWeightMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "GrossWeightMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netVolumeMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "NetVolumeMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossVolumeMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "GrossVolumeMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "measureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformationSPSNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "AdditionalInformationSPSNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "additionalInformationSPSNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableSPSClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ApplicableSPSClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "ApplicableSPSClassification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalSPSPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "PhysicalSPSPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "physicalSPSPackage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originSPSCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "OriginSPSCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "originSPSCountry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedSPSProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "AppliedSPSProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "appliedSPSProcess"));
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
