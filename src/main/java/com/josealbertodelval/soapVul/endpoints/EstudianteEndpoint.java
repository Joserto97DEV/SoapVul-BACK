package com.josealbertodelval.soapVul.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.josealbertodelval.estudiante.StudentDetailsRequest;
import com.josealbertodelval.estudiante.StudentDetailsResponse;
import com.josealbertodelval.soapVul.services.EstudianteService;

@Endpoint
public class EstudianteEndpoint {
	private static final String NAMESPACE_URI = "http://www.josealbertodelval.com/estudiante";


	@Autowired
	private EstudianteService estudianteService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
		StudentDetailsResponse response = new StudentDetailsResponse();
		response.setStudent(estudianteService.crear());

		return response;
	}
	
}
