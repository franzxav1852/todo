package com.everis.springbootjprexamen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjprexamen.model.Description;
import com.everis.springbootjprexamen.repository.DescriptionRepository;


@Service
public class DescriptionService {
	
	@Autowired
	private DescriptionRepository descriptionRepository;
	
	public List<Description> listar() {
		return descriptionRepository.findAll();
		
	}
	
	public Description insertar(Description description) {
		return descriptionRepository.save(description);
		
	}
	
	public Description actualizar(Description description) {
			return descriptionRepository.save(description);
	}
	
	
	public boolean eliminar(int idDescription) {
		Description encontrado = descriptionRepository.findById(idDescription).get();
		if (encontrado != null) {
			descriptionRepository.delete(encontrado);
			return true;
		} else {
			return false;
		}
			
	}


}
