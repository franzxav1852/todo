package com.everis.springcloudconfigrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calcularTotal")
public class CalcularTotalRestController {
	
	@Value("${descuento}")
	private int descuento;
	
	@GetMapping("/{cantidad}")
	private int obtenerDescuento(@PathVariable int cantidad) {
		
	
		return cantidad - (cantidad * descuento/100);
		 
	
	}
	
	
	

}
