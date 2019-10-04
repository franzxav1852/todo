package com.everis.springbootjprexamen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjprexamen.model.Product;
import com.everis.springbootjprexamen.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> listar() {
		return productRepository.findAll();
		
	}
	
	public Product insertar(Product product) {
		return productRepository.save(product);
		
	}
	
	public Product actualizar(Product product) {
			return productRepository.save(product);
	}
	
	
	public boolean eliminar(int idProduct) {
		Product encontrado = productRepository.findById(idProduct).get();
		if (encontrado != null) {
			productRepository.delete(encontrado);
			return true;
		} else {
			return false;
		}
			
	}

}


