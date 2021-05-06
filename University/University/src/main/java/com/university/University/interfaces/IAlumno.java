package com.university.University.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.university.University.modelo.Alumno;
import com.university.University.modelo.MyUserDetails;


@Repository
public interface IAlumno extends JpaRepository<Alumno, Integer>{ 
	public Alumno findByDni(String dni);
	
	
}
