package com.api.prueba;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
import com.ephyto.client.UpdateData;

import _int.ippc.ephyto.HUB_Entities.Envelope;

@Path("/enviar") 
@Produces(MediaType.APPLICATION_JSON) 
//@Consumes(MediaType.APPLICATION_XML)
public class HubEnvio {
	
	@GET 
    public Response envio() throws Exception {
		HubClient cliente = new HubClient();
		Envelope env = (Envelope) cliente.DeliverEnvelope("BO", "PY", "851", 70, "BO-784754452", "ABC18111111");
		return Response.ok(cliente.deliverEnvelope(env),MediaType.APPLICATION_JSON).build();   
    }
	
}
