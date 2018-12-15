package com.cenfotec.examen.entities;

import org.springframework.data.annotation.Id;

public class Cuenta {
	@Id
	long idCuenta;
	String nombreCuenta;
	
	public Cuenta() {
		super();
	}
	public Cuenta(long idCuenta, String nombreCuenta) {
		super();
		this.idCuenta = idCuenta;
		this.nombreCuenta = nombreCuenta;
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
	 * @return the nombreCuenta
	 */
	public String getNombreCuenta() {
		return nombreCuenta;
	}
	/**
	 * @param nombreCuenta the nombreCuenta to set
	 */
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	
}
