package com.university.University.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String descripcion;
	private String horario;
	private boolean disponible = true;
	private int cuposInscripcion;
	private static int MAX_CUPOS = 50;
	
	public Subject() {
	}

	public Subject(String name, String descripcion, boolean disponible) {
		this.name = name;
		this.descripcion = descripcion;
		this.disponible = disponible;
	}

	public Subject(int id, String name, String descripcion, String horario, boolean disponible) {
		super();
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.horario = horario;
		this.disponible = disponible;
	}

	public Subject(String name, String descripcion, String horario, boolean disponible) {
		
		this.name = name;
		this.descripcion = descripcion;
		this.horario = horario;
		this.disponible = disponible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isDisponible() {
		
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCuposInscripcion() {
		return cuposInscripcion;
	}

	public void setCuposInscripcion(int cuposInscripcion) {
		this.cuposInscripcion = cuposInscripcion;
	}
	
}
