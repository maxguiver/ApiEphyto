package com.api.entity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.DatatypeConstants.Field;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

@XmlRootElement

public class Message implements Serializable {
	private Field[] fields;
    private String from;
    private String to;   
 
    @XmlAttribute
    public String getFrom() {
        return from;
    }
 
    public void setFrom(String from) {
        this.from = from;
    }
 
    @XmlAttribute
    public String getTo() {
        return to;
    }
 
    public void setTo(String to) {
        this.to = to;
    }
 
    public Field[] getFields() {
        return fields;
    }
 
    public void setFields(Field[] fields) {
        this.fields = fields;
    }
 
    @Override
    public String toString() {
 
        OutputStream xmlOutput = new OutputStream() {
            private StringBuilder string = new StringBuilder();
 
            @Override
            public void write
                    (
                            int b) throws IOException {
                this.string.append((char) b);
            }
 
            @Override
            public String toString
                    () {
                return this.string.toString();
            }
        };
 
        JAXBContext contextObj = null;
        Marshaller marshallerObj = null;
        try {
            contextObj = JAXBContext.newInstance(Message.class);
            marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallerObj.marshal(this, xmlOutput);
            xmlOutput.flush();
            xmlOutput.close();
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        } finally {
            if (contextObj != null) {
                contextObj = null;
            }
            if (marshallerObj != null) {
                marshallerObj = null;
            }
        }
 
        return xmlOutput.toString();
    }    

}
