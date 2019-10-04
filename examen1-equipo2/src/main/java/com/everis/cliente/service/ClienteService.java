package com.everis.cliente.service;
import java.util.List;

import com.everis.cliente.dao.ClienteDAO;
import com.everis.cliente.model.Cliente;

public class ClienteService {
		
		private ClienteDAO clienteDAO = new ClienteDAO();
		
		public List<Cliente> listar(){
			return clienteDAO.listar();
		}
		
		public boolean insertar(Cliente cliente) {
			List<Cliente> listaActual = listar();
			for (Cliente cliente2 : listaActual) {
				if(cliente.getRfc().equals(cliente2.getRfc())) {
					return false;
				}
			}
			clienteDAO.insertar(cliente);
			return true;
			
		}

	}
	




