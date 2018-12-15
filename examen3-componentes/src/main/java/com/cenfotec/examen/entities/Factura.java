package com.cenfotec.examen.entities;

public class Factura {
	int monto;
	String nombreTienda;
	
	public Factura() {
		super();
	}
	public Factura(int monto, String nombreTienda) {
		super();
		this.monto = monto;
		this.nombreTienda = nombreTienda;
	}
	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	/**
	 * @return the nombreTienda
	 */
	public String getNombreTienda() {
		return nombreTienda;
	}
	/**
	 * @param nombreTienda the nombreTienda to set
	 */
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	
}
