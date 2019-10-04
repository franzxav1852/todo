package com.everis.equipo1frontendsemana2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

@ManagedBean //Vincula la vista con código Java (controlador)
public class AutoCompleteController {
	
	String[] lenguajes = {"php", "java", "python", "c sharp", "go", "kotlin", "cobol"};
	
	public List<String> completar(String filtro){
		List<String> resultados = new ArrayList<String>();
		for(String lenguaje : lenguajes) {
			if(lenguaje.contains(filtro)) {
				resultados.add(lenguaje);
			}
		}
		return resultados;
	}
}
