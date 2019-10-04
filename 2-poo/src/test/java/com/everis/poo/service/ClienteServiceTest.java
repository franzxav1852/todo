package com.everis.poo.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.everis.poo.model.Cliente;

public class ClienteServiceTest {
	
	private ClienteService servicio = new ClienteService();

	@Test
	public void testInsertarListar() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(1);
		cliente.setNombre("FRANCISCO");
		cliente.setApaterno("PEREZ");
		cliente.setAmaterno("BENITO");
		cliente.setRfc("PEBF");
		servicio.insertar(cliente);
		
		List<Cliente> clientes = servicio.listar();
		assertTrue(clientes.size() > 0);
		for(Cliente objCliente : clientes) {
			System.out.println(objCliente);
		}
	}

	@Test
	public void testBuscar() {
		testInsertarListar();
		Cliente encontrado = servicio.buscar(1);
		assertNotNull(encontrado);
		
		
	}

	@Test
	public void testActualizar() {
		testInsertarListar();
		Cliente objCliente = new Cliente();
		objCliente.setIdCliente(1);
		objCliente.setNombre("Actualizado");
		boolean exito = servicio.actualizar(objCliente);
		assertTrue(exito);
		
	}
		
		

	@Test
	public void testEliminar() {
		testInsertarListar();
		boolean exito = servicio.eliminar(1);
		assertTrue(exito);
	}

}
