package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.springbootjpa.model.Categoria;
import com.everis.springbootjpa.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	//Obtiene un objeto del contexto de Spring
	//Obtiene siempre la misma instancia (Singleton)
	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	public List<Categoria> listar() {
		return categoriaRepository.findAll(); //JpaRepository SELECT * categoria
	}
	
	public Categoria insertar(Categoria categoria) {
		return categoriaRepository.save(categoria); //INSERT INTO
	}
	
	public Categoria actualizar(Categoria categoria) {
		return categoriaRepository.save(categoria);
		
	}
	
	public boolean eliminar(int idCategoria) {
		Categoria encontrada = categoriaRepository.findById(idCategoria).get();
		if (encontrada != null) {
			categoriaRepository.delete(encontrada);
			return true;
		} else {
			return false;
		}
				
	}
	
}
