package com.university.University.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Table(name = "subject_inscript")
public class MateriaInscripta extends Subject{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Subject subject;
	private String horario;
	public String comprobarHorario() {
		if(subject.getHorario().equalsIgnoreCase(getHorario())) {
			return "Ya esta inscripto a otro horario";
		}
		return horario;
	}

}
