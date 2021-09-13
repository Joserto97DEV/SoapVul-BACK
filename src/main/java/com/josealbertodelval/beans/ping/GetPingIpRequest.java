//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.13 a las 06:46:13 PM CEST 
//


package com.josealbertodelval.beans.ping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isSafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ipNumber",
    "isSafe"
})
@XmlRootElement(name = "GetPingIpRequest")
public class GetPingIpRequest {

    @XmlElement(required = true)
    protected String ipNumber;
    protected boolean isSafe;

    /**
     * Obtiene el valor de la propiedad ipNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpNumber() {
        return ipNumber;
    }

    /**
     * Define el valor de la propiedad ipNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpNumber(String value) {
        this.ipNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad isSafe.
     * 
     */
    public boolean isIsSafe() {
        return isSafe;
    }

    /**
     * Define el valor de la propiedad isSafe.
     * 
     */
    public void setIsSafe(boolean value) {
        this.isSafe = value;
    }

}
