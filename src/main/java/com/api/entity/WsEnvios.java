package com.api.entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "WsEnvio")
public class WsEnvios {
	private String Servicio;
	private String SolicitudNro;
	private String SolicitudIdDistrital;
	private String NroTalonario;
	private int Estado;
	private int Intentos;
	private String Respuesta;
	private String FechaEnvio;
	private String RespuestaAnulado;
	private String FechaAnulado;
	private String FechaRegistro;
	private String FechaRegistroCer;
	private String FechaEnvioCer;
	private String PaisDestino;
	private String CertificateType;
	private int CertificateStatus;
	private String NPPOCertificateNumber;
	private String hubDeliveryNumber;
	public WsEnvios() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name = "Servicio")
	public String getServicio() {
		return Servicio;
	}
	public void setServicio(String servicio) {
		Servicio = servicio;
	}
	@XmlElement(name = "SolicitudNro")
	public String getSolicitudNro() {
		return SolicitudNro;
	}
	public void setSolicitudNro(String solicidNro) {
		SolicitudNro = solicidNro;
	}
	@XmlElement(name = "SolicitudIdDistrital")
	public String getSolicitudIdDistrital() {
		return SolicitudIdDistrital;
	}
	public void setSolicitudIdDistrital(String solicitudIdDistrital) {
		SolicitudIdDistrital = solicitudIdDistrital;
	}
	@XmlElement(name = "NroTalonario")
	public String getNroTalonario() {
		return NroTalonario;
	}
	public void setNroTalonario(String nroTalonario) {
		NroTalonario = nroTalonario;
	}
	@XmlElement(name = "Estado")
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	@XmlElement(name = "Intentos")
	public int getIntentos() {
		return Intentos;
	}
	public void setIntentos(int intentos) {
		Intentos = intentos;
	}
	@XmlElement(name = "Respuesta")
	public String getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	@XmlElement(name = "FechaEnvio")
	public String getFechaEnvio() {
		return FechaEnvio;
	}
	public void setFechaEnvio(String fechaEnvio) {
		FechaEnvio = fechaEnvio;
	}
	@XmlElement(name = "RespuestaAnulado")
	public String getRespuestaAnulado() {
		return RespuestaAnulado;
	}
	public void setRespuestaAnulado(String respuestaAnulado) {
		RespuestaAnulado = respuestaAnulado;
	}
	@XmlElement(name = "FechaAnulado")
	public String getFechaAnulado() {
		return FechaAnulado;
	}

	public void setFechaAnulado(String fechaAnulado) {
		FechaAnulado = fechaAnulado;
	}
	@XmlElement(name = "FechaRegistro")
	public String getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	@XmlElement(name = "FechaRegistroCer")
	public String getFechaRegistroCer() {
		return FechaRegistroCer;
	}
	public void setFechaRegistroCer(String fechaRegistroCer) {
		FechaRegistroCer = fechaRegistroCer;
	}
	@XmlElement(name = "FechaEnvioCer")
	public String getFechaEnvioCer() {
		return FechaEnvioCer;
	}
	public void setFechaEnvioCer(String fechaEnvioCer) {
		FechaEnvioCer = fechaEnvioCer;
	}
	@XmlElement(name = "PaisDestino")
	public String getPaisDestino() {
		return PaisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		PaisDestino = paisDestino;
	}
	@XmlElement(name = "CertificateType")
	public String getCertificateType() {
		return CertificateType;
	}
	public void setCertificateType(String certificateType) {
		CertificateType = certificateType;
	}
	@XmlElement(name = "CertificateStatus")
	public int getCertificateStatus() {
		return CertificateStatus;
	}
	public void setCertificateStatus(int certificateStatus) {
		CertificateStatus = certificateStatus;
	}
	@XmlElement(name = "NPPOCertificateNumber")
	public String getNPPOCertificateNumber() {
		return NPPOCertificateNumber;
	}
	public void setNPPOCertificateNumber(String nPPOCertificateNumber) {
		NPPOCertificateNumber = nPPOCertificateNumber;
	}
	@XmlElement(name = "HubDeliveryNumber")
	public String getHubDeliveryNumber() {
		return hubDeliveryNumber;
	}
	public void setHubDeliveryNumber(String hubDeliveryNumber) {
		this.hubDeliveryNumber = hubDeliveryNumber;
	}
	@Override
	public String toString() {
		return "WsEnvios [Servicio=" + Servicio + ", SolicidNro=" + SolicitudNro + ", SolicitudIdDistrital="
				+ SolicitudIdDistrital + ", NroTalonario=" + NroTalonario + ", Estado=" + Estado + ", Intentos="
				+ Intentos + ", Respuesta=" + Respuesta + ", FechaEnvio=" + FechaEnvio + ", RespuestaAnulado="
				+ RespuestaAnulado + ", FechaAnulado=" + FechaAnulado + ", FechaRegistro=" + FechaRegistro
				+ ", FechaRegistroCer=" + FechaRegistroCer + ", FechaEnvioCer=" + FechaEnvioCer + ", PaisDestino="
				+ PaisDestino + ", CertificateType=" + CertificateType + ", CertificateStatus=" + CertificateStatus
				+ ", NPPOCertificateNumber=" + NPPOCertificateNumber + ", hubDeliveryNumber=" + hubDeliveryNumber + "]";
	}

}
