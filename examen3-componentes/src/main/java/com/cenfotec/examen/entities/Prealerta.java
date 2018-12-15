package com.cenfotec.examen.entities;

public class Prealerta {
	long idCuenta;
	long idCourier;
	String nombreCourier;
	Factura factura;
	
	public Prealerta() {
		super();
	}
	public Prealerta(long idCuenta, long idCourier, String nombreCourier, Factura factura) {
		super();
		this.idCuenta = idCuenta;
		this.idCourier = idCourier;
		this.nombreCourier = nombreCourier;
		this.factura = factura;
	}
	/**
	 * @return the idCuenta
	 */
	public long getIdCuenta() {
		return idCuenta;
	}
	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(long idCuenta) {
		this.idCuenta = idCuenta;
	}
	/**
	 * @return the idCourier
	 */
	public long getIdCourier() {
		return idCourier;
	}
	/**
	 * @param idCourier the idCourier to set
	 */
	public void setIdCourier(long idCourier) {
		this.idCourier = idCourier;
	}
	/**
	 * @return the nombreCourier
	 */
	public String getNombreCourier() {
		return nombreCourier;
	}
	/**
	 * @param nombreCourier the nombreCourier to set
	 */
	public void setNombreCourier(String nombreCourier) {
		this.nombreCourier = nombreCourier;
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
