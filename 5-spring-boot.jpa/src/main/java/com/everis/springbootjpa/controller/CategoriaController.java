package com.everis.springbootjpa.controller;

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

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.repository.CategoriaRepository;
import com.everis.springbootjpa.service.CategoriaService;


@RestController
@RequestMapping("categorias")
public class CategoriaController {
	
	   @Autowired
	   private CategoriaService categoriaService;
	
	@GetMapping("/")
	   public List<Categoria> listar() {
		return categoriaService.listar();
	   }
	
	@PostMapping("/") //Verbos HTTP
	public Categoria insertar(@RequestBody Categoria categoria) {
		return categoriaService.insertar(categoria);
		
	}
	
    @PutMapping("/")
	public Categoria actualizar(@RequestBody Categoria categoria) {
    	return categoriaService.actualizar(categoria);
	
	}
    
    @DeleteMapping("/{idCategoria")
	public boolean eliminar(@PathVariable int idCategoria) {
    	return categoriaService.eliminar(idCategoria);
	}
}
