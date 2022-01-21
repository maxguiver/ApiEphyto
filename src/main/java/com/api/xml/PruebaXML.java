package com.api.xml;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;

import com.ephyto.client.HubClient;

public class PruebaXML {
	 static final private Logger LOGGER = Logger.getLogger("mx.com.hash.pruebaxml.PruebaXML");
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		try {
            CrearXml ejemploXML = new CrearXml();
            Document documento = ejemploXML.crearDocumento();
           // HubClient xml = new HubClient();
            System.out.println(ejemploXML.convertirString(documento));
           // xml.validateXml("ejemplo.xml");
            ejemploXML.escribirArchivo(documento, "ejemplo.xml");            
            
        } catch (ParserConfigurationException ex) {
            LOGGER.log(Level.SEVERE, "Error de configuracion");
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            LOGGER.log(Level.SEVERE, "Error de transformacion XML a String");
            LOGGER.log(Level.SEVERE, null, ex);
        }
	}
	
   
}
