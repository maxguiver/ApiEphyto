package com.api.service;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.api.DAO.WsEnvioDao;
import com.api.entity.WsEnvios;

@Path("/wsenvio")

public class ServicesWsEnvios {
	WsEnvioDao  wsenvioDao =  new WsEnvioDao();
    String msg;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hola, Service is Runing";
    }
    
	@GET
	@Path("/json/{p}")
	@Produces({MediaType.APPLICATION_JSON})
	public WsEnvios wsenvioJsonP(@PathParam("p") String NroTalonario) {
		WsEnvios ev = new WsEnvios();
		ev.setNroTalonario("NroTalonario: " + NroTalonario);
		return ev;
	}
	
	 @GET
	 @Path("/get")
	 @Produces( {MediaType.APPLICATION_JSON} )
	 public WsEnvios readWsEnviosByNroTalonario(@QueryParam("nrotalonario") String nrotalonario) {
	 System.out.println(nrotalonario);
	 WsEnvios user = wsenvioDao.readWsEnviosByNroTalonario(nrotalonario);
	 System.out.println(user.getNroTalonario());
	 return user;
	 }
	 
	@POST
	@Path("/post/crearWsenvio")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response crearBienvenida(WsEnvios obj) {
			WsEnvios ev = new WsEnvios();
			ev.setServicio(ev.getServicio());
     		ev.setSolicitudNro(ev.getSolicitudNro());
     		ev.setSolicitudIdDistrital(ev.getSolicitudIdDistrital());
     		ev.setNroTalonario(ev.getNroTalonario());
     		ev.setEstado(ev.getEstado());
     		ev.setIntentos(ev.getIntentos());
     		ev.setRespuesta(ev.getRespuesta());
     		ev.setFechaEnvio(ev.getFechaEnvio());
     		ev.setRespuestaAnulado(ev.getRespuestaAnulado());
     		ev.setFechaAnulado(ev.getFechaAnulado());
     		ev.setFechaRegistro(ev.getFechaRegistro());
     		ev.setFechaRegistroCer(ev.getFechaRegistroCer());
     		ev.setFechaEnvioCer(ev.getFechaEnvioCer());
     		ev.setPaisDestino(ev.getPaisDestino());
     		ev.setCertificateType(ev.getCertificateType());
     		ev.setCertificateStatus(ev.getCertificateStatus());
     		ev.setNPPOCertificateNumber(ev.getNPPOCertificateNumber());
     		ev.setHubDeliveryNumber(ev.getHubDeliveryNumber());
			
			return Response.status(201).entity(ev).build();
		}
	
    @PUT
    @Path("/updateWsEnvio/{NroTalonario}/{paisdestino}/{CertificateType}/{CertificateStatus}/{NPPOCertificateNumber}/{hubDeliveryNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    //Modificar
    public String updateWsEnvio(@PathParam("NroTalonario") String NroTalonario, @PathParam("paisdestino") String paisdestino,@PathParam("CertificateType") String  CertificateType,
    		 @PathParam("CertificateStatus") int  CertificateStatus, @PathParam("NPPOCertificateNumber") String  NPPOCertificateNumber, @PathParam("hubDeliveryNumber") String hubDeliveryNumber) {
    	wsenvioDao.updateWsEnvio( NroTalonario,  paisdestino,   CertificateType, CertificateStatus,  NPPOCertificateNumber, hubDeliveryNumber );
       return "Update WsEnvio:" + NroTalonario+","+paisdestino+","+CertificateType+","+CertificateStatus+","+NPPOCertificateNumber+","+hubDeliveryNumber+", Run Sucessfully!";
    }
	
}
