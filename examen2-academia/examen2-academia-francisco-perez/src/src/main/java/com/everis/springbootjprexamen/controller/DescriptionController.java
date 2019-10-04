package com.everis.springbootjprexamen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjprexamen.model.Description;
import com.everis.springbootjprexamen.service.DescriptionService;


@RestController
@RequestMapping("descriptions")
public class DescriptionController {
	
	@Autowired
	public DescriptionService descriptionService;
	
	@GetMapping("/")
	public List<Description> listar() {
		return descriptionService.listar();
	}
	
	@PostMapping("/")
	public Description insertar(@RequestBody Description description) {
		return descriptionService.insertar(description);
	}
	
	@PutMapping("/")
	public Description actualizar(@RequestBody Description description) {
		return descriptionService.actualizar(description);
	} 
	
	@DeleteMapping("/{id]")
	public boolean eliminar(@PathVariable int id) {
		return descriptionService.eliminar(id);

	}
	
	

}
