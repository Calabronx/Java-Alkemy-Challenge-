package com.university.University.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dni")
	private String dni;
	private String nombre;
	private String apellido;
	@Column(name = "legajo")
	private String legajo;
	
	public Alumno() {
	}
	public Alumno(String dni, String legajo) {
		this.dni = dni;
		this.legajo = legajo;
	}
	public Alumno(String dni, String nombre, String apellido, String legajo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
