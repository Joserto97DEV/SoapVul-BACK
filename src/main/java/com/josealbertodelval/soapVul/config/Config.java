package com.josealbertodelval.soapVul.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/services/*");
	}

	@Bean(name = "student")
	public DefaultWsdl11Definition defaultWsdl11Definition() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DetallePuertoEstudiante");
		wsdl11Definition.setLocationUri("/services/student");
		wsdl11Definition.setTargetNamespace("http://www.josealbertodelval.com/estudiante");
		wsdl11Definition.setSchema(studentSchema());
		return wsdl11Definition;
	}
	
	@Bean(name = "film")
	public DefaultWsdl11Definition defaultWsdl11Definition2() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("FilmDetailsPort");
		wsdl11Definition.setLocationUri("/services/film");
		wsdl11Definition.setTargetNamespace("http://www.josealbertodelval.com/film");
		wsdl11Definition.setSchema(filmSchema());
		return wsdl11Definition;
	}
	
	@Bean(name = "ping")
	public DefaultWsdl11Definition defaultWsdl11Definition3() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("PingDetailsPort");
		wsdl11Definition.setLocationUri("/services/ping");
		wsdl11Definition.setTargetNamespace("http://www.josealbertodelval.com/ping");
		wsdl11Definition.setSchema(pingSchema());
		return wsdl11Definition;
	}

	@Bean(name = "studentSchema")
	public XsdSchema studentSchema() {
		return new SimpleXsdSchema(new ClassPathResource("estudiante.xsd"));
	}
	
	@Bean(name = "filmSchema")
	public XsdSchema filmSchema() {
		return new SimpleXsdSchema(new ClassPathResource("film.xsd"));
	}
	
	@Bean(name = "pingSchema")
	public XsdSchema pingSchema() {
		return new SimpleXsdSchema(new ClassPathResource("ping.xsd"));
	}
	
	
	
	
}
