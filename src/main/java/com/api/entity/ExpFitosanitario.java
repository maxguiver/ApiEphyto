package com.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "expfitosanitario")

public class ExpFitosanitario {
	//@primary
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "solicitudnro", nullable = false)
		private Long solicitudNro;
		//@Id
		@Column(name = "solicitudiddistrital", nullable = false)
		private String solicitudIdDistrital;
		
		@Column(name = "solicitudestado", nullable = false)
		private String solicitudEstado;
		
		@Column(name = "solicitudmotivorechazo", nullable = false)
		private String solicitudMotivoRechazo;

	    @Column(name = "solicitudfecha", nullable = false)
	    @Temporal(TemporalType.TIMESTAMP)
		private Date solicitudFecha;
	    
	    @Column(name = "solicitudsupervisadapor", length = 20)
		private String solicitudSupervisadaPor;
	    
	    @Column(name = "solicitudfechasupervision", length = 20)
		@Temporal(TemporalType.TIMESTAMP)
	   	private Date solicitudFechaSupervision;
	    
	    @Column(name = "solicitudsolicitadapor", length = 20)
		private String solicitudSolicitadaPor;
	    
	    @Column(name = "exporidpadron", length = 15)
		private String exporIdPadron;
	    
	    @Column(name = "exporrazonsocial", length = 120, nullable = false)
		private String exporRazonSocial;
	    
	    @Column(name = "expordireccion", length = 120, nullable = false)
		private String exporDireccion;
	    
	    @Column(name = "exporintermediario", length = 120)
		private String exporIntermediario;
	    
	    @Column(name = "exporsolicitante", length = 55, nullable = false)
		private String exporSolicitante;
	    
	    @Column(name = "exporcarnet", length = 15, nullable = false)
		private String exporCarnet;
	    
	    @Column(name = "exporcargo", length = 60)
		private String exporCargo;
	    
	    @Column(name = "destinatarionombre", length = 100, nullable = false)
		private String destinatarioNombre;
	    
	    @Column(name = "destinatariodireccion", length = 300, nullable = false)
		private String destinatarioDireccion;
	    
	    @Column(name = "destinatariopais", length = 35, nullable = false)
		private String destinatarioPais;
	    
	    @Column(name = "transporteorigen", length = 30, nullable = false)
		private String transporteOrigen;
	    
	    @Column(name = "transportepuertosalida", length = 150, nullable = false)
		private String transportePuertoSalida;
	    
	    @Column(name = "transportepuertodestino", length = 150, nullable = false)
		private String transportePuertoDestino;
	    
	    @Column(name = "transportemedio", length = 30, nullable = false)
		private String transporteMedio;
	    
	    @Column(name = "requerimientos")
		private String requerimientos;
	    
	    @Column(name = "observaciones")
		private String observaciones;
	    
	    @Column(name = "pruebasfecha")
	    @Temporal(TemporalType.TIMESTAMP)
		private Date pruebasFecha;
	    
	    @Column(name = "pruebastratamiento", length = 150)
		private String pruebasTratamiento;
	    
	    @Column(name = "pruebasquimico", length = 150)
		private String pruebasQuimico;
	    
	    @Column(name = "pruebasduracion", length = 150)
		private String pruebasDuracion;
	    
	    @Column(name = "pruebasconcentracion", length = 150)
		private String pruebasConcentracion;
	    
	    @Column(name = "pruebasinfoadicional", length = 300)
		private String pruebasInfoAdicional;
	    
	    @Column(name = "productomercaderia", length = 2)
		private String productoMercaderia;
	    
	    @Column(name = "productouo", length = 2)
		private String productoUo;
	    
	    @Column(name = "productoservicio", length = 3)
		private String productoServicio;
	    
	    @Column(name = "producto", length = 100)
		private String producto;
	    
	    @Column(name = "productocantidad")
		private Double productoCantidad;
	    
	    @Column(name = "productomedida")
		private String productoMedida;
	    
	    @Column(name = "productonombrebotanico", length = 140)
		private String productoNombreBotanico;
	    
	    @Column(name = "productomarcadistintiva", length = 50)
		private String productoMarcaDistintiva;
	    
	    @Column(name = "productobultos", length = 100)
		private String productoBultos;
	    
	    @Column(name = "productodesglose", length = 140)
		private String productoDesglose;
	    
	    @Column(name = "productomuestra")
		private String productoMuestra;
	    
	    @Column(name = "productoimportebs")
		private Double productoImporteBs;
	    
	    @Column(name = "productoimportefob")
		private Double productoImporteFob;
	    
	    @Column(name = "productomonedafob")
		private String productoMonedaFob;
	    
	    @Column(name = "productofacturafob", length = 30)
		private String productoFacturaFob;
	    
	    @Column(name = "productonroafidi", length = 30)
		private String productoNroAfidi;
	    
	    @Column(name = "productonrocfo", length = 30)
		private String productoNroCfo;
	    
	    @Column(name = "anulado")
		private boolean anulado;
	    
	    @Column(name = "anuladofecha")
	    @Temporal(TemporalType.TIMESTAMP)
		private Date anuladoFecha;
	    
	    @Column(name = "anuladopor", length = 20)
		private String anuladoPor;
	    
	    @Column(name = "anuladomotivo", length = 50)
		private String anuladoMotivo;
	    
	    @Column(name = "tipolinea")
		private int tipoLinea;
	    
	    @Column(name = "nrotalonario")
		private int nroTalonario;
	    
	    @Column(name = "solicitudidoficina", length = 3)
		private String solicitudIdOficina;
	    
	    @Column(name = "productoecologicoorganico", length = 2)
		private String productoEcologicoOrganico;
	    
	    @Column(name = "productoembalajemadera", length = 2)
		private String productoEmbalajeMadera;
	    
	    @Column(name = "productolote", length = 250)
		private String productoLote;
	    
	    @Column(name = "productolugarproduccion", length = 150)
		private String productoLugarProduccion;
	    
	    @Column(name = "productofacturafobfecha")
	    @Temporal(TemporalType.TIMESTAMP)
		private Date productoFacturaFobFecha;
	    
		@Column(name = "requisitospaisdestino", length = 2)
		private String requisitosPaisDestino;
		
		@Column(name = "reemplazo", length = 250)
		private String reemplazo;
		
		@Column(name = "nroliquidacion")
		private Long nroLiquidacion;
		@Column(name = "gruporeemp")
		private int gruporeemp;
		
		public Date getSolicitudFechaSupervision() {
			return solicitudFechaSupervision;
		}
		public void setSolicitudFechaSupervision(Date solicitudFechaSupervision) {
			this.solicitudFechaSupervision = solicitudFechaSupervision;
		}
		public Long getSolicitudNro() {
			return solicitudNro;
		}
		public void setSolicitudNro(Long solicitudNro) {
			this.solicitudNro = solicitudNro;
		}
		public String getSolicitudIdDistrital() {
			return solicitudIdDistrital;
		}
		public void setSolicitudIdDistrital(String solicitudIdDistrital) {
			this.solicitudIdDistrital = solicitudIdDistrital;
		}
		public String getSolicitudEstado() {
			return solicitudEstado;
		}
		public void setSolicitudEstado(String solicitudEstado) {
			this.solicitudEstado = solicitudEstado;
		}
		public String getSolicitudMotivoRechazo() {
			return solicitudMotivoRechazo;
		}
		public void setSolicitudMotivoRechazo(String solicitudMotivoRechazo) {
			this.solicitudMotivoRechazo = solicitudMotivoRechazo;
		}
		public Date getSolicitudFecha() {
			return solicitudFecha;
		}
		public void setSolicitudFecha(Date solicitudFecha) {
			this.solicitudFecha = solicitudFecha;
		}
		public String getSolicitudSupervisadaPor() {
			return solicitudSupervisadaPor;
		}
		public void setSolicitudSupervisadaPor(String solicitudSupervisadaPor) {
			this.solicitudSupervisadaPor = solicitudSupervisadaPor;
		}
		public String getSolicitudSolicitadaPor() {
			return solicitudSolicitadaPor;
		}
		public void setSolicitudSolicitadaPor(String solicitudSolicitadaPor) {
			this.solicitudSolicitadaPor = solicitudSolicitadaPor;
		}
		public String getExporIdPadron() {
			return exporIdPadron;
		}
		public void setExporIdPadron(String exporIdPadron) {
			this.exporIdPadron = exporIdPadron;
		}
		public String getExporRazonSocial() {
			return exporRazonSocial;
		}
		public void setExporRazonSocial(String exporRazonSocial) {
			this.exporRazonSocial = exporRazonSocial;
		}
		public String getExporDireccion() {
			return exporDireccion;
		}
		public void setExporDireccion(String exporDireccion) {
			this.exporDireccion = exporDireccion;
		}
		public String getExporIntermediario() {
			return exporIntermediario;
		}
		public void setExporIntermediario(String exporIntermediario) {
			this.exporIntermediario = exporIntermediario;
		}
		public String getExporSolicitante() {
			return exporSolicitante;
		}
		public void setExporSolicitante(String exporSolicitante) {
			this.exporSolicitante = exporSolicitante;
		}
		public String getExporCarnet() {
			return exporCarnet;
		}
		public void setExporCarnet(String exporCarnet) {
			this.exporCarnet = exporCarnet;
		}
		public String getExporCargo() {
			return exporCargo;
		}
		public void setExporCargo(String exporCargo) {
			this.exporCargo = exporCargo;
		}
		public String getDestinatarioNombre() {
			return destinatarioNombre;
		}
		public void setDestinatarioNombre(String destinatarioNombre) {
			this.destinatarioNombre = destinatarioNombre;
		}
		public String getDestinatarioDireccion() {
			return destinatarioDireccion;
		}
		public void setDestinatarioDireccion(String destinatarioDireccion) {
			this.destinatarioDireccion = destinatarioDireccion;
		}
		public String getDestinatarioPais() {
			return destinatarioPais;
		}
		public void setDestinatarioPais(String destinatarioPais) {
			this.destinatarioPais = destinatarioPais;
		}
		public String getTransporteOrigen() {
			return transporteOrigen;
		}
		public void setTransporteOrigen(String transporteOrigen) {
			this.transporteOrigen = transporteOrigen;
		}
		public String getTransportePuertoSalida() {
			return transportePuertoSalida;
		}
		public void setTransportePuertoSalida(String transportePuertoSalida) {
			this.transportePuertoSalida = transportePuertoSalida;
		}
		public String getTransportePuertoDestino() {
			return transportePuertoDestino;
		}
		public void setTransportePuertoDestino(String transportePuertoDestino) {
			this.transportePuertoDestino = transportePuertoDestino;
		}
		public String getTransporteMedio() {
			return transporteMedio;
		}
		public void setTransporteMedio(String transporteMedio) {
			this.transporteMedio = transporteMedio;
		}
		public String getRequerimientos() {
			return requerimientos;
		}
		public void setRequerimientos(String requerimientos) {
			this.requerimientos = requerimientos;
		}
		public String getObservaciones() {
			return observaciones;
		}
		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}
		public Date getPruebasFecha() {
			return pruebasFecha;
		}
		public void setPruebasFecha(Date pruebasFecha) {
			this.pruebasFecha = pruebasFecha;
		}
		public String getPruebasTratamiento() {
			return pruebasTratamiento;
		}
		public void setPruebasTratamiento(String pruebasTratamiento) {
			this.pruebasTratamiento = pruebasTratamiento;
		}
		public String getPruebasQuimico() {
			return pruebasQuimico;
		}
		public void setPruebasQuimico(String pruebasQuimico) {
			this.pruebasQuimico = pruebasQuimico;
		}
		public String getPruebasDuracion() {
			return pruebasDuracion;
		}
		public void setPruebasDuracion(String pruebasDuracion) {
			this.pruebasDuracion = pruebasDuracion;
		}
		public String getPruebasConcentracion() {
			return pruebasConcentracion;
		}
		public void setPruebasConcentracion(String pruebasConcentracion) {
			this.pruebasConcentracion = pruebasConcentracion;
		}
		public String getPruebasInfoAdicional() {
			return pruebasInfoAdicional;
		}
		public void setPruebasInfoAdicional(String pruebasInfoAdicional) {
			this.pruebasInfoAdicional = pruebasInfoAdicional;
		}
		public String getProductoMercaderia() {
			return productoMercaderia;
		}
		public void setProductoMercaderia(String productoMercaderia) {
			this.productoMercaderia = productoMercaderia;
		}
		public String getProductoUo() {
			return productoUo;
		}
		public void setProductoUo(String productoUo) {
			this.productoUo = productoUo;
		}
		public String getProductoServicio() {
			return productoServicio;
		}
		public void setProductoServicio(String productoServicio) {
			this.productoServicio = productoServicio;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public Double getProductoCantidad() {
			return productoCantidad;
		}
		public void setProductoCantidad(Double productoCantidad) {
			this.productoCantidad = productoCantidad;
		}
		public String getProductoMedida() {
			return productoMedida;
		}
		public void setProductoMedida(String productoMedida) {
			this.productoMedida = productoMedida;
		}
		public String getProductoNombreBotanico() {
			return productoNombreBotanico;
		}
		public void setProductoNombreBotanico(String productoNombreBotanico) {
			this.productoNombreBotanico = productoNombreBotanico;
		}
		public String getProductoMarcaDistintiva() {
			return productoMarcaDistintiva;
		}
		public void setProductoMarcaDistintiva(String productoMarcaDistintiva) {
			this.productoMarcaDistintiva = productoMarcaDistintiva;
		}
		public String getProductoBultos() {
			return productoBultos;
		}
		public void setProductoBultos(String productoBultos) {
			this.productoBultos = productoBultos;
		}
		public String getProductoDesglose() {
			return productoDesglose;
		}
		public void setProductoDesglose(String productoDesglose) {
			this.productoDesglose = productoDesglose;
		}
		public String getProductoMuestra() {
			return productoMuestra;
		}
		public void setProductoMuestra(String productoMuestra) {
			this.productoMuestra = productoMuestra;
		}
		public Double getProductoImporteBs() {
			return productoImporteBs;
		}
		public void setProductoImporteBs(Double productoImporteBs) {
			this.productoImporteBs = productoImporteBs;
		}
		public Double getProductoImporteFob() {
			return productoImporteFob;
		}
		public void setProductoImporteFob(Double productoImporteFob) {
			this.productoImporteFob = productoImporteFob;
		}
		public String getProductoMonedaFob() {
			return productoMonedaFob;
		}
		public void setProductoMonedaFob(String productoMonedaFob) {
			this.productoMonedaFob = productoMonedaFob;
		}
		public String getProductoFacturaFob() {
			return productoFacturaFob;
		}
		public void setProductoFacturaFob(String productoFacturaFob) {
			this.productoFacturaFob = productoFacturaFob;
		}
		public String getProductoNroAfidi() {
			return productoNroAfidi;
		}
		public void setProductoNroAfidi(String productoNroAfidi) {
			this.productoNroAfidi = productoNroAfidi;
		}
		public String getProductoNroCfo() {
			return productoNroCfo;
		}
		public void setProductoNroCfo(String productoNroCfo) {
			this.productoNroCfo = productoNroCfo;
		}
		public boolean isAnulado() {
			return anulado;
		}
		public void setAnulado(boolean anulado) {
			this.anulado = anulado;
		}
		public Date getAnuladoFecha() {
			return anuladoFecha;
		}
		public void setAnuladoFecha(Date anuladoFecha) {
			this.anuladoFecha = anuladoFecha;
		}
		public String getAnuladoPor() {
			return anuladoPor;
		}
		public void setAnuladoPor(String anuladoPor) {
			this.anuladoPor = anuladoPor;
		}
		public String getAnuladoMotivo() {
			return anuladoMotivo;
		}
		public void setAnuladoMotivo(String anuladoMotivo) {
			this.anuladoMotivo = anuladoMotivo;
		}
		public int getTipoLinea() {
			return tipoLinea;
		}
		public void setTipoLinea(int tipoLinea) {
			this.tipoLinea = tipoLinea;
		}
		public int getNroTalonario() {
			return nroTalonario;
		}
		public void setNroTalonario(int nroTalonario) {
			this.nroTalonario = nroTalonario;
		}
		public String getSolicitudIdOficina() {
			return solicitudIdOficina;
		}
		public void setSolicitudIdOficina(String solicitudIdOficina) {
			this.solicitudIdOficina = solicitudIdOficina;
		}
		public String getProductoEcologicoOrganico() {
			return productoEcologicoOrganico;
		}
		public void setProductoEcologicoOrganico(String productoEcologicoOrganico) {
			this.productoEcologicoOrganico = productoEcologicoOrganico;
		}
		public String getProductoEmbalajeMadera() {
			return productoEmbalajeMadera;
		}
		public void setProductoEmbalajeMadera(String productoEmbalajeMadera) {
			this.productoEmbalajeMadera = productoEmbalajeMadera;
		}
		public String getProductoLote() {
			return productoLote;
		}
		public void setProductoLote(String productoLote) {
			this.productoLote = productoLote;
		}
		public String getProductoLugarProduccion() {
			return productoLugarProduccion;
		}
		public void setProductoLugarProduccion(String productoLugarProduccion) {
			this.productoLugarProduccion = productoLugarProduccion;
		}
		public Date getProductoFacturaFobFecha() {
			return productoFacturaFobFecha;
		}
		public void setProductoFacturaFobFecha(Date productoFacturaFobFecha) {
			this.productoFacturaFobFecha = productoFacturaFobFecha;
		}
		public String getRequisitosPaisDestino() {
			return requisitosPaisDestino;
		}
		public void setRequisitosPaisDestino(String requisitosPaisDestino) {
			this.requisitosPaisDestino = requisitosPaisDestino;
		}
		public String getReemplazo() {
			return reemplazo;
		}
		public void setReemplazo(String reemplazo) {
			this.reemplazo = reemplazo;
		}
		public Long getNroLiquidacion() {
			return nroLiquidacion;
		}
		public void setNroLiquidacion(Long nroLiquidacion) {
			this.nroLiquidacion = nroLiquidacion;
		}
		public int getGruporeemp() {
			return gruporeemp;
		}
		public void setGruporeemp(int gruporeemp) {
			this.gruporeemp = gruporeemp;
		}
}
