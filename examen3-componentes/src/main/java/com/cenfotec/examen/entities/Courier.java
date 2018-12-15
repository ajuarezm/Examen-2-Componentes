package com.cenfotec.examen.entities;

import org.springframework.data.annotation.Id;

public class Courier {
	@Id
	long idCourier;
	String nombreCourier;
	
	public Courier() {
		super();
	}
	public Courier(long idCourier, String nombreCourier) {
		super();
		this.idCourier = idCourier;
		this.nombreCourier = nombreCourier;
	}
	public long getIdCourier() {
		return idCourier;
	}
	public void setIdCourier(long idCourier) {
		this.idCourier = idCourier;
	}
	public String getNombreCourier() {
		return nombreCourier;
	}
	public void setNombreCourier(String nombreCourier) {
		this.nombreCourier = nombreCourier;
	}
	
	
}
