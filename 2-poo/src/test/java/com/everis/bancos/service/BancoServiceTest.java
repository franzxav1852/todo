package com.everis.bancos.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.everis.bancos.Banco;
import com.everis.poo.service.ClienteService;


public class BancoServiceTest {
	
	BancoService servicio = new BancoService();

	@Test
	public void testInsertarListar() {
		Banco banco  = new Banco();
		banco.setIdBanco(1);
		banco.setNombre("");
		banco.setDireccion("");
		
		List<Banco> bancos = servicio.listar();
		assertTrue(bancos.size() > 0);
		for(Banco objBanco : bancos) {
			System.out.println(objBanco);
		}
	}

}
