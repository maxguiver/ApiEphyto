package com.api.DAO;

import com.api.entity.WsEnvios;

public class WsEnvioDao {
	
 WsEnvios wsenvio;

public WsEnvioDao() {
	super();
	// TODO Auto-generated constructor stub
}
 
public WsEnvioDao(WsEnvios wsenvio) {
    this.wsenvio = wsenvio;
}
// consulta CRUD
public  WsEnvios  readWsEnviosByNroTalonario(String nrotalonario  ){
   return dbOptQuery(nrotalonario);
}
//Modificación CRUD
public void updateWsEnvio(String NroTalonario, String paisdestino, String CertificateType, int CertificateStatus,String NPPOCertificateNumber,String hubDeliveryNumber ){
             System.out.println ("CRUD Opt: Modificar un WsEnvio");
    wsenvio.setNroTalonario(NroTalonario);
    wsenvio.setPaisDestino(paisdestino);
    wsenvio.setCertificateType(CertificateType);
    wsenvio.setCertificateStatus(CertificateStatus);
    wsenvio.setNPPOCertificateNumber(NPPOCertificateNumber);
    wsenvio.setHubDeliveryNumber(hubDeliveryNumber);
    dbOptUpdate(wsenvio);

}
private  void dbOptUpdate( WsEnvios wsEnvio){
    System.out.println ("Operación de la base de datos, modificada correctamente");
}
// Simular operaciones de base de datos
private  WsEnvios dbOptQuery( String nrotalonario){

	WsEnvios envio= new WsEnvios();
    // Construye un dato de simulación
    envio.setNroTalonario(nrotalonario);
    System.out.println ("Operación de la base de datos, consulta exitosa");
    return   envio;
}
}
