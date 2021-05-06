package com.university.University.interfazService;

import java.util.List;

import com.university.University.modelo.Alumno;

public interface IAlumnoService {
	public List<Alumno>listarAlumnos();
	public Alumno findByDni(String dni);
	public Alumno registrar(Alumno u);
	public List<Alumno>listarAlumno();
}
