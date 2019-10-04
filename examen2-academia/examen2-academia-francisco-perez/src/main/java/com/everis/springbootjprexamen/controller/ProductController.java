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

import com.everis.springbootjprexamen.model.Product;
import com.everis.springbootjprexamen.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
		
		@Autowired
		public ProductService productService;
		
		@GetMapping("/")
		public List<Product> listar() {
			return productService.listar();
		}
		
		@PostMapping("/")
		public Product insertar(@RequestBody Product product) {
			return productService.insertar(product);
		}
		
		@PutMapping("/")
		public Product actualizar(@RequestBody Product product) {
			return productService.actualizar(product);
		} 
		
		@DeleteMapping("/{id]")
		public boolean eliminar(@PathVariable int id) {
			return productService.eliminar(id);

		}
		
		
}





