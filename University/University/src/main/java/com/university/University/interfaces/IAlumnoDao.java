package com.university.University.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.University.modelo.Alumno;
@Repository
public interface IAlumnoDao extends JpaRepository<Alumno, Long>{
	public Alumno findByDni(String dni);
	
}
