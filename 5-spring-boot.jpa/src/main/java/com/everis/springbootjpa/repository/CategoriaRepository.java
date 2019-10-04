package com.everis.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjpa.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	     //Al heredar de JpaRepository CRUD hecho.
	
	//@Repository
	//public int 
	

}
