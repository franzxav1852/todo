
package com.everis.poo.dao;

import java.util.ArrayList;
/**
 * Repositorios (repository)
 * Buscar simepre hacerlo lo menor acoplado posible
 */
import java.util.List;

import com.everis.poo.model.Cliente;

public class ClienteDAO {
	
	private List<Cliente> clientes = new ArrayList<>();
	
	public List<Cliente> listar() { //
		return clientes;
	}
	
	public void insertar(Cliente cliente) { 
		clientes.add(cliente);
	}
	
	public Cliente buscar(int idCliente) {
		
		for (Cliente cliente : clientes) {
			if(cliente.getIdCliente() == idCliente) {
				return cliente;
			}
		}
		
		return null;
		
		
	}
	
	public boolean actualizar(Cliente cliente) {
		Cliente encontrado = buscar(cliente.getIdCliente());
		if(encontrado !=null) {
			encontrado.setNombre(cliente.getNombre());
			encontrado.setApaterno(cliente.getApaterno());
			encontrado.setAmaterno(cliente.getAmaterno());
			encontrado.setRfc(cliente.getRfc());
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean eliminar (int idCliente) {
		Cliente encontrado = buscar (idCliente);
		if(encontrado != null) {
			clientes.remove(encontrado);
			return true;
		} else {
			return false;
		}
	}
	

}
