package com.josealbertodelval.soapVul.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.josealbertodelval.beans.student.GetStudentDetailsRequest;
import com.josealbertodelval.beans.student.GetStudentDetailsResponse;
import com.josealbertodelval.beans.student.PostStudentDetailsRequest;
import com.josealbertodelval.beans.student.PostStudentDetailsResponse;
import com.josealbertodelval.beans.student.Student;
import com.josealbertodelval.soapVul.services.EstudianteService;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

@Endpoint
public class EstudianteEndpoint {
	private static final String NAMESPACE_URI = "http://www.josealbertodelval.com/beans/student";


	@Autowired
	private EstudianteService estudianteService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetStudentDetailsRequest")
	@ResponsePayload
	public GetStudentDetailsResponse getStudent(@RequestPayload GetStudentDetailsRequest request) {
		GetStudentDetailsResponse response = new GetStudentDetailsResponse();
		Student student = new Student();
		student.setAddress("hola");
		response.setStudent(student);
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PostStudentDetailsRequest")
	@ResponsePayload
	public PostStudentDetailsResponse postStudent(@RequestPayload PostStudentDetailsRequest request) {
		PostStudentDetailsResponse response = new PostStudentDetailsResponse();
		response.setStudent(estudianteService.crear(request.getStudent()));

		return response;
	}
	
	
}
