package com.api.service;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.entity.VOUsuario;
@Path("/aprendec")
public class ServicesLogin {
	 @POST
	 @Path("/validaUsuario")
	 @Consumes({ MediaType.APPLICATION_JSON })
	 @Produces({ MediaType.APPLICATION_JSON })
	 public VOUsuario validaUsuario(VOUsuario vo) {
	  vo.setUserValido(false);
	  if (vo.getUsuario().equals("aprendec") && vo.getPassword().equals("123")) {
	   vo.setUserValido(true);
	  }
	  return vo;
	 }
}
