package com.ephyto.client;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.api.conection.SQLDatabaseConnection;

import _int.ippc.ephyto.DeliveryService;
import _int.ippc.ephyto.DeliveryServiceLocator;
import _int.ippc.ephyto.HubWebException;
import _int.ippc.ephyto.IDeliveryService;
import _int.ippc.ephyto.ValidationResult;
import _int.ippc.ephyto.HUB_Entities.Envelope;
import _int.ippc.ephyto.HUB_Entities.EnvelopeHeader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.Statement;

public class HubClient {
	
	//private static final String KEYSTORE_TRUSTED_PASSWORD = "password";
    //private static final String KEYSTORE_SERVER_PASSWORD = "password";

    /**
     * Se debe manejar el status 40 (retirar un certificado del HUB) enviando de vuelta con status code 40
     * VUE solo invoca DeliverEnvelop y getEnvelopeTrackingInfo
     * */

    public static EnvelopeHeader DeliverEnvelope(String from, String to, String type, int status, String certificateNumber, String xml) throws Exception {
    	//System.out.println("PROPIEDADES:");
    	//System.out.println(System.getProperties());
    	//
    	IDeliveryService proxy = getClientConnection();
        Envelope envelope = new Envelope();
        envelope.setFrom(from);
        envelope.setTo(to);
        envelope.setCertificateType(Integer.parseInt(type));
        envelope.setCertificateStatus(status);
        envelope.setNPPOCertificateNumber(certificateNumber);

        try {
            envelope.setContent(xml);
        } catch (Exception e1) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // The XML string could not be parsed
            System.out.println("Failed to load certificate into XML document.");
            throw new Exception(e1); // Without certificate we cannot continue
        }

        try {
            // send the message to the hub and get back the header
            EnvelopeHeader header = proxy.deliverEnvelope(envelope);
            //System.out.println("PRUEBA EXITOSA DELIVERY");
            // Handle internal issues

            if (header.getHUBTrackingInfo() != null && header.getHUBTrackingInfo().equals("FailedDelivery")) {
                // manage the exception and provide errors to the client
                // in this case the error is due to one of the following
                // Header validation error
                // System.out.println("FALLA DE PRUEBA");
                String error = header.getHubDeliveryErrorMessage();
                System.out.println(String.format("Message failed delivery. %s",
                        error));
            } else {
                // get the hub tracking number...
                String hubTrackingNumber = header.getHubDeliveryNumber();
                System.out.println(String.format(
                        "Header delivered with tracking number: %s",
                        hubTrackingNumber));
                System.out.println(String.format(
                        "Header delivered with tracking info: %s",
                        header.getHUBTrackingInfo()));
            }
            return header;
        } catch (RemoteException e) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // network
            // unavailability of the remote system
            // Pudo haber sido por un problema de conextión
            e.printStackTrace();
          //  System.out.println("PROPIEDADES");
            System.out.println(String.format(
                    "Failed to deliver the message to the HUB. ",
                    e.getMessage()));
            throw new Exception(e);
        }
    }

    public  static void validateXml(String xml) throws Exception {
        IDeliveryService proxy = getClientConnection();
        try {
            ValidationResult[] validationResults = proxy.validatePhytoXML(xml);
            System.out.println("Validation, total: " + validationResults.length);
            for(ValidationResult det: validationResults){
                System.out.println("------------------------");
                System.out.println("field: " + det.getField());
                System.out.println("message: " + det.getMsg());
                System.out.println("area: " + det.getArea().getValue());
                System.out.println("------------------------");
                //TODO: guardar como ERROR. SEVERE no debe enviar. Se debe aplicar cambios y volver a generar
            }
        } catch (Exception e1) {
            //TODO: guardar como ERROR. Se pudo deber a algun problema de parseo del String a XML. Se debe volver a generar el XML luego de aplicar los ajustes
            System.out.println("Failed to load certificate into XML document.");
            throw e1; // Without certificate we cannot continue
        }
    }


    private static IDeliveryService getClientConnection()
            throws ServiceException {

        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        //Esta configuracion se debe realizar en el JBOSS
        //System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_TRUSTED_PASSWORD);
        //System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_SERVER_PASSWORD);

        // Uncomment next line to have handshake debug information
        // System.setProperty("javax.net.debug", "ssl");
        // System.setProperty("javax.net.debug", "help");
        System.out.println(System.getProperties());
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");

        DeliveryService deliveryServiceLocator = new DeliveryServiceLocator();

        return deliveryServiceLocator.getIDeliveryServiceImplPort();

    }

    /**
     * Los metodos de abajo solamente se utilizan para los servicios PULL y PUSH que son invocados por el HUB.
     * PULL y PUSH implementa ADUANAS - VUI
     */
    public static void pullAcknowledge() throws Exception {
        IDeliveryService proxy = getClientConnection();
        try {
            // get all the envelopes pending delivery
            Envelope[] envelopesToImport = proxy.PULLImportEnvelope();

            for (Envelope envelope : envelopesToImport) {
                System.out.println(String.format(
                        "Processing hub delivery number:%s",
                        envelope.getHubDeliveryNumber()));
                // get the content containing the certificate XML
                String xmlContent = envelope.getContent();

                // verifications in XML
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                        .newInstance();
                DocumentBuilder dBuilder;
                try {
                    dBuilder = dbFactory.newDocumentBuilder();
                    InputStream content = new ByteArrayInputStream(envelope
                            .getContent().getBytes(
                                    StandardCharsets.UTF_8.name()));
                    Document doc = dBuilder.parse(content);
                } catch (ParserConfigurationException | SAXException
                        | IOException e) {
                    // The content of the envelope is not a proper XML file
                    System.out.println(String.format("Error parsing content of %1$s %2$s",
                            envelope.getHubDeliveryNumber(), e.getMessage()));
                    // This envelope won't be acknowledgedacknowledgeEnvelopeReceipt

                    proxy.advancedAcknowledgeEnvelopeReceipt(
                            envelope.getHubDeliveryNumber(),
                            "error while parsing the XML");
                    continue;
                }

                // acknowledge the receipt back to the server (this could be
                // done as a separate action based on user validation)
                proxy.acknowledgeEnvelopeReceipt(envelope
                        .getHubDeliveryNumber());
            }
        } catch (RemoteException e) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // network
            // unavailability of the remote system
            System.out.println(String.format("Failed to deliver the message to	the HUB. ",
                    e.getMessage()));
            throw new Exception(e);
        }
    }

    private static void getUnderDeliveryEnvelope() throws Exception {
        IDeliveryService proxy = getClientConnection();
        try {

            // get the envelopes under delivery
            EnvelopeHeader[] headers = proxy.getUnderDeliveryEnvelope();

            // clicles the records to update the client system
            for (EnvelopeHeader header : headers) {
                // updates client records
                System.out.println(String.format(
                        "Envelope: %1$s - Tracking info:	%2$s",
                        header.getHubDeliveryNumber(),
                        header.getHUBTrackingInfo()));
            }
        } catch (RemoteException e) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // network
            // unavailability of the remote system
            System.out.println(String.format(
                    "Failed to deliver the message to	the HUB. ",
                    e.getMessage()));
            throw new Exception(e);
        }
    }

    private static void getImportEnvelopeHeaders() throws Exception {
        IDeliveryService proxy = getClientConnection();
        try {

            // get the envelopes under delivery
            EnvelopeHeader[] headers = proxy.getUnderDeliveryEnvelope();

            // clicles the records to update the client system
            for (EnvelopeHeader header : headers) {
                // get the envelope
                Envelope env = proxy.PULLSingleImportEnvelope(header
                        .getHubDeliveryNumber());

                // get the content containing the certificate XML
                String xmlContent = env.getContent();

                // verifications in XML
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                        .newInstance();
                DocumentBuilder dBuilder;
                try {
                    dBuilder = dbFactory.newDocumentBuilder();
                    InputStream content = new ByteArrayInputStream(env
                            .getContent().getBytes(
                                    StandardCharsets.UTF_8.name()));
                    Document doc = dBuilder.parse(content);
                } catch (ParserConfigurationException | SAXException
                        | IOException e) {
                    // The content of the envelope is not a proper XML file
                    System.out.println(String.format(
                            "Error parsing content of %1$s %2$s",
                            env.getHubDeliveryNumber(), e.getMessage()));
                    // This envelope won't be acknowledged

                    proxy.advancedAcknowledgeEnvelopeReceipt(
                            env.getHubDeliveryNumber(),
                            "error while parsing the XML");
                    continue;
                }

                // acknowledge the receipt back to the server (this could be
                // done as a separate action based on user validation)
                proxy.acknowledgeEnvelopeReceipt(env.getHubDeliveryNumber());
            }
        } catch (RemoteException e) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // network
            // unavailability of the remote system
            System.out.println(String.format(
                    "Failed to pull envelopes from the HUB. ", e.getMessage()));
            throw new Exception(e);
        }
    }

    public static EnvelopeHeader getEnvelopeTrackingInfo(String hubTrackingNumber)
            throws Exception {
        IDeliveryService proxy = getClientConnection();
        try {
            EnvelopeHeader header = proxy.getEnvelopeTrackingInfo(hubTrackingNumber);
            System.out.println(String.format("The envelope %1$s tracking info is %2$s",
                            header.getHubDeliveryNumber(),
                            header.getHUBTrackingInfo()));
            switch (header.getHUBTrackingInfo()) {
                case "Delivered":
                    // perform client updates to mark the envelope as delivered
                    break;
                case "DeliveredWithWarnings":
                    // perform client updates to mark the envelope as delivered,
                    // capture the error message and send it to the technical people
                    break;
                case "FailedDelivery":
                    String errorMessage = header.getHubDeliveryErrorMessage();
                    // update the client state with the informational error message
                    break;
                case "EnvelopeNotExists":
                    // the message was received by the hub but not yet added to the
                    // queue or the number is not correct
                    // resending of the original can be applied
                    break;
                case "PendingDelivery":
                    // still in the queue on the hub, waiting to be pulled or pushed
                    break;
            }
            return header;
        } catch (RemoteException e) {
            // manage the exception and provide errors to the client
            // in this case the error is due to one of the following
            // network
            // unavailability of the remote system
            System.out.println(String.format(
                    "Failed to deliver the message to the HUB. ",
                    e.getMessage()));
            throw new Exception(e);
        }
    }

    public EnvelopeHeader deliverEnvelope(Envelope env) throws RemoteException, Exception {
    	saveEnvelope(env);
        return env;
    }
    private void saveEnvelope(Envelope env) throws HubWebException, RemoteException, ServiceException {
        // do checks and store the envelope in the suitable place
        IDeliveryService proxy = getClientConnection();

        // acknowledge the reception
        proxy.acknowledgeEnvelopeReceipt(env.getHubDeliveryNumber());
    }
}
