package com.everis.equipo1frontendsemana2.controller;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

//Controlador del lado del front end --> jsf
@ManagedBean
public class RatingController {
	private int calificacion;
	
	public int getCalificacion() { //Aquí creamos gettes an setters, en el otro proyecto hibernate lo hacía por nosotros
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public void calificar(RateEvent evento) {
		System.out.println("Sí estoy calificando " + calificacion);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Calificacion", "Tu calificación fue: " + calificacion);
		FacesContext.getCurrentInstance().addMessage(null, message); //en null puede ir el id del objeto donde se quiere mostrar el mensaje
	}
}
