package com.everis.equipouno.controller;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.everis.equipouno.model.Inscripcion;
import com.everis.equipouno.model.Pago;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PagoControllerTest extends BaseControllerTest {

	@Before
	public void setUp() {
		super.setUp(); //invoca al método setup de la clase padre
	}
	
	@Test
	public void testInsertar() throws Exception {
		Pago pago = new Pago();
		pago.setFechaPago(new Date());
		pago.setMonto(5000);
		
		Inscripcion inscripcion = new Inscripcion();
		inscripcion.setId(3);
		
		pago.setInscripcion(inscripcion);
		
		ObjectMapper mapper = new ObjectMapper();
		String pagoJson = mapper.writeValueAsString(pago);
		String url = "/pagos/";
		
		MvcResult resultado = mvc.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(pagoJson)).andReturn();
		
		int codigo = resultado.getResponse().getStatus();
		assertTrue(codigo == 200);
	}

}
