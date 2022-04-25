package com.oesia.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Persona {
	
	@Id
	private int idPersona;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
