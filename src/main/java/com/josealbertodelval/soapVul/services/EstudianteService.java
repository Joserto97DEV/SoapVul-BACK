package com.josealbertodelval.soapVul.services;

import org.springframework.stereotype.Service;

import com.josealbertodelval.estudiante.Student;



@Service
public class EstudianteService {

	public Student crear() {
		Student estudiante = new Student();
		estudiante.setAddress("Direccion jeje");
		estudiante.setName("JADELVAL");
		estudiante.setStandard(0);
		
		return estudiante;
	}
	
}
