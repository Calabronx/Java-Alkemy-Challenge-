package com.university.University.interfaces;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.university.University.modelo.Subject;

@Repository
public interface ISubject extends CrudRepository<Subject, Integer> {

}

