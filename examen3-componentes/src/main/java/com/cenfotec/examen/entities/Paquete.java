package com.cenfotec.examen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;


public class Paquete {
	@Id
	String paqueteId;
	Cuenta cuenta;
	Date fecha;
	Courier courier;
	Boolean prealerta;
	Factura factura;
	
	
	public Paquete(Cuenta cuenta, Date fecha, Courier courier, Factura factura) {
		super();
		this.cuenta = cuenta;
		this.fecha = fecha;
		this.courier = courier;
		this.factura = factura;
		this.prealerta = false;		
	}

	public Paquete() {
		super();
	}

	public Paquete(String paqueteId, Cuenta cuenta, Date fecha, Courier courier, Factura factura) {
		super();
		this.paqueteId = paqueteId;
		this.cuenta = cuenta;
		this.fecha = fecha;
		this.courier = courier;
		this.factura = factura;
		this.prealerta = false;
	}
	
	/**
	 * @return the prealerta
	 */
	public Boolean getPrealerta() {
		return prealerta;
	}

	/**
	 * @param prealerta the prealerta to set
	 */
	public void setPrealerta(boolean prealerta) {
		this.prealerta = prealerta;
	}

	/**
	 * @return the paqueteId
	 */
	public String getPaqueteId() {
		return paqueteId;
	}
	/**
	 * @param paqueteId the paqueteId to set
	 */
	public void setPaqueteId(String paqueteId) {
		this.paqueteId = paqueteId;
	}
	/**
	 * @return the cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the courier
	 */
	public Courier getCourier() {
		return courier;
	}
	/**
	 * @param courier the courier to set
	 */
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	/**
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}
	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}


}
