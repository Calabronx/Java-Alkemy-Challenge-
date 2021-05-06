package com.university.University.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.university.University.interfaces.IAlumno;
import com.university.University.interfazService.IAlumnoService;

import com.university.University.modelo.Alumno;

@Service
public class AlumnoService implements IAlumnoService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private List<Alumno> getAlumnos;
	
	@Autowired
	private IAlumno data;
	

	@Override
	public List<Alumno> listarAlumnos() {
		// TODO Auto-generated method stub
		return (List<Alumno>)data.findAll();
	}


	public Alumno findByDni(String dni) {
		// TODO Auto-generated method stub
		return data.findByDni(dni);
	}


	@Override
	public Alumno registrar(Alumno u) {
		
		return data.save(u);
	}


	@Override
	public List<Alumno> listarAlumno() {
		// TODO Auto-generated method stub
		Alumno alumno = new Alumno();
		return (List<Alumno>)data.findByDni(alumno.getDni());
	}


	
	
	
	
}
