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

import com.everis.springbootjpa.model.Cliente;
import com.everis.springbootjpa.service.ClienteService;


	@RestController
	@RequestMapping("clientes")
	public class ClienteController {
	
		@Autowired
		   private ClienteService clienteService;
		
		@GetMapping("/")
		   public List<Cliente> listar() {
			return clienteService.listar();
		   }
		
		@PostMapping("/") 
		public Cliente insertar(@RequestBody Cliente cliente) {
			return clienteService.insertar(cliente);
			
		}
		
	    @PutMapping("/")
		public Cliente actualizar(@RequestBody Cliente cliente) {
	    	return clienteService.actualizar(cliente);
		
		}
	    
	    @DeleteMapping("/{idBitacora")
		public boolean eliminar(@PathVariable int idCliente) {
	    	return clienteService.eliminar(idCliente);
		}

}
