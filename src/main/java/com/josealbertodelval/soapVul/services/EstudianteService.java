package com.josealbertodelval.soapVul.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josealbertodelval.beans.student.Student;
import com.josealbertodelval.soapVul.dao.EstudianteDao;



@Service
public class EstudianteService {

	@Autowired
	private EstudianteDao estudianteDao;
	
	public Student crear(Student student) {
		
		return estudianteDao.create(student);
		
	}
	
}
