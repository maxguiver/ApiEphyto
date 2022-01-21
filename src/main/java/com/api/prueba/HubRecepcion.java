package com.api.prueba;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ephyto.client.HubClient;

import _int.ippc.ephyto.HUB_Entities.Envelope;

@Path("/recibir") 
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class HubRecepcion {

	@GET 
    public Response recepcion() throws Exception {
		HubClient cliente = new HubClient();
		 //Envelope[] fito= cliente.pullAcknowledge();
		//String fito= cliente.pullAcknowledge();
		cliente.pullAcknowledge();
		return Response.ok("Datos",MediaType.APPLICATION_XML).build();   
    }
}
