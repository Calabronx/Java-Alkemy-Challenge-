package com.university.University.interfazService;
import java.util.List;


import com.university.University.modelo.Subject;

public interface ISubjectService {
	public List<Subject>listarSubjects();
	public int save(Subject s);
	public void delete(String name);
	
}
