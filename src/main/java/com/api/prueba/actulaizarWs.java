package com.api.prueba;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ephyto.client.UpdateData;

@Path("/actualizar") 
@Produces(MediaType.APPLICATION_JSON) 
@Consumes(MediaType.APPLICATION_JSON)
public class actulaizarWs {
	@GET 
    public Response actualizarWs() throws Exception {
		UpdateData ud = new UpdateData();
	  	return Response.ok(ud.UpdateWS(),MediaType.APPLICATION_JSON).build();   
    }
}
