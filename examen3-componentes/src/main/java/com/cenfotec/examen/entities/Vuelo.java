package com.cenfotec.examen.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Vuelo {
	@Id
	String fechaVuelo;
	ArrayList<Paquete> listaPaquetes;
	public Vuelo() {
		super();
		listaPaquetes = new ArrayList<Paquete>();
	}
	public Vuelo(String fechaVuelo, ArrayList<Paquete> listaPaquetes) {
		super();
		this.fechaVuelo = fechaVuelo;
		this.listaPaquetes = listaPaquetes;
	}
	/**
	 * @return the fechaVuelo
	 */
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	/**
	 * @param fechaVuelo the fechaVuelo to set
	 */
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	/**
	 * @return the listaPaquetes
	 */
	public ArrayList<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}
	/**
	 * @param listaPaquetes the listaPaquetes to set
	 */
	public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}
	
	

}
