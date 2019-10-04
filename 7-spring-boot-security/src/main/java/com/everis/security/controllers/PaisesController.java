package com.everis.security.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaisesController {

	private static List<String> paises = new ArrayList<>();
	
	@GetMapping("/paises")
	public List<String> consultar() {
		return paises;
	}
	
	@PostMapping("/paises/{pais}")
	public void insertar(@PathVariable String pais) {
		paises.add(pais);
	}
	
	@DeleteMapping("/paises/{pais}")
	public void eliminar(@PathVariable String pais) {
		paises.add(pais);
    }
	
	
}
