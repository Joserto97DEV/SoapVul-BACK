//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.12 a las 07:06:11 PM CEST 
//


package com.josealbertodelval.beans.student;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.josealbertodelval.beans.student package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.josealbertodelval.beans.student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentDetailsResponse }
     * 
     */
    public GetStudentDetailsResponse createGetStudentDetailsResponse() {
        return new GetStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link PostStudentDetailsRequest }
     * 
     */
    public PostStudentDetailsRequest createPostStudentDetailsRequest() {
        return new PostStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link PostStudentDetailsResponse }
     * 
     */
    public PostStudentDetailsResponse createPostStudentDetailsResponse() {
        return new PostStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link GetStudentDetailsRequest }
     * 
     */
    public GetStudentDetailsRequest createGetStudentDetailsRequest() {
        return new GetStudentDetailsRequest();
    }

}
