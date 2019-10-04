package com.everis.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.springbootjpa.model.Cliente;
import com.everis.springbootjpa.repository.ClienteRepository;

public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listar() {
		
		return clienteRepository.findAll();
	}
	
	public Cliente insertar(Cliente cliente) {
		return clienteRepository.save(cliente); 
	}
	
	public Cliente actualizar(Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	
	public boolean eliminar(int idCliente) {
		Cliente encontrada = clienteRepository.findById(idCliente).get();
		if (encontrada != null) {
			clienteRepository.delete(encontrada);
			return true;
		} else {
			return false;
		}
				
    }

}


