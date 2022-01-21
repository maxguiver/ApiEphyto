package com.api.prueba;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Logger;

//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.w3c.dom.Document;

import com.api.conection.SQLDatabaseConnection;
import com.api.xml.CrearXmlDatos;
import com.ephyto.client.HubClient;

import _int.ippc.ephyto.HUB_Entities.Envelope;

@Path("/enviar") 
@Produces(MediaType.APPLICATION_XML) 
//@Consumes(MediaType.APPLICATION_XML)
public class HubEnvio {
	
	@GET 
    public Response envio() throws Exception {
		
		HubClient cliente = new HubClient();
		Envelope env = (Envelope) cliente.DeliverEnvelope("BO", "AR", "851", 70, "BO-784754444444444", "ABC1234568");
		return Response.ok(cliente.deliverEnvelope(env),MediaType.APPLICATION_XML).build();   
       
    }

}
