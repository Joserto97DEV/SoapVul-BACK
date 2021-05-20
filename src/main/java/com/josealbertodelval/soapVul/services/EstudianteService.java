package com.josealbertodelval.soapVul.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josealbertodelval.estudiante.Student;
import com.josealbertodelval.soapVul.dao.EstudianteDao;



@Service
public class EstudianteService {

	@Autowired
	private EstudianteDao estudianteDao;
	
	public Student crear() {
		Student estudiante = new Student();
		estudiante.setAddress("Direccion jeje");
		estudiante.setName("JADELVAL");
		estudiante.setStandard(0);
		
		return estudiante;
	}
	
}
