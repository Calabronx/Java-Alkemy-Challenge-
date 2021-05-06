package com.university.University.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.University.interfaces.ISubject;
import com.university.University.interfazService.ISubjectService;
import com.university.University.modelo.Subject;

@Service
public class SubjectService implements ISubjectService{
	@Autowired
	private ISubject data;
	
	@Override
	public List<Subject> listarSubjects() {
		// TODO Auto-generated method stub
		return (List<Subject>)data.findAll();
	}

	@Override
	public int save(Subject s) {
		int res=0;
		Subject subject = data.save(s);
		if(!subject.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
}
