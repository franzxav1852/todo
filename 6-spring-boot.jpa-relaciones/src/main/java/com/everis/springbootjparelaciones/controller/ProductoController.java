package com.everis.springbootjparelaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.everis.springbootjparelaciones.model.Producto;
import com.everis.springbootjparelaciones.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService; 
	
	@GetMapping("/")
	public List<Producto> listar() {
		return productoService.Listar();
		
	}
	


}
