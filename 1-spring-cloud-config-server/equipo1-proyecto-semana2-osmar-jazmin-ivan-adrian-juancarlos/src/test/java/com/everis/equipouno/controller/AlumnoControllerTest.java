package com.everis.equipouno.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.everis.equipouno.Application;
import com.everis.equipouno.model.Alumno;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//JUnit para Spring
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class AlumnoControllerTest {
	
	//Mock es un objeto de prueba (dummie) simulación de peticiones y respuestas http
	private MockMvc mvc; //simula request y response
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); 
	}

	@Test
	public void testListar() throws Exception {
		String url = "/alumnos/";
		MvcResult resultado = mvc.perform(MockMvcRequestBuilders.get(url)).andReturn(); //peticion get (.get(url)), simula el trabajo de postman
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200);
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		ObjectMapper mapper = new ObjectMapper();
		List<Alumno> alumnos = mapper.readValue(jsonRespuesta, new TypeReference<List<Alumno>>() {});//convierte json a lista
		assertNotNull(alumnos); //valida que se cree la lista
		assertTrue(alumnos.size()>0); //valida que haya al menos 1 objeto
		for(Alumno alumno: alumnos) {
			assertTrue(alumno.getNombre() != null);//valida que cada curso tenga nombre
		}
	}

	@Test
	public void testInsertar() throws Exception {
		String url = "/alumnos/";
		Alumno alumno = new Alumno();
		alumno.setNombre("Nombre Alejandro Junit");
		alumno.setApaterno("Apaterno Alejandro Junit");
		alumno.setAmaterno("Amaterno Alejandro Junit");
		//Usando Jackson
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(alumno);
		MvcResult resultado = mvc.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(json)).andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200); //Exitosa la peticion
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		Alumno alumnoInsertado = mapper.readValue(jsonRespuesta, Alumno.class); //Convierte json a objeto
		assertTrue(alumnoInsertado.getId()>0);
	}

	@Test
	public void testActualizar() throws Exception {
		String url = "/alumnos/";
		Alumno alumno = new Alumno();
		alumno.setId(5);
		alumno.setNombre("Nombre AlejandroAct Junit");
		alumno.setApaterno("Apaterno AlejandroAct Junit");
		alumno.setAmaterno("Amaterno AlejandroAct Junit");
		//Usando Jackson
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(alumno);
		MvcResult resultado = mvc.perform(MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON_VALUE).content(json)).andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200); //Exitosa la peticion
		String jsonRespuesta = resultado.getResponse().getContentAsString();
		Alumno alumnoActualizado = mapper.readValue(jsonRespuesta, Alumno.class); //Convierte json a objeto
		assertTrue(alumnoActualizado.getNombre().equals("Nombre AlejandroAct Junit"));
	}

	@Test
	public void testBorrar() throws Exception {
		String url = "/alumnos/6";
		MvcResult resultado = mvc.perform(MockMvcRequestBuilders.delete(url)).andReturn();
		int status = resultado.getResponse().getStatus();
		assertTrue(status == 200);
		String json = resultado.getResponse().getContentAsString();
		assertTrue(json.equals("true"));
	}

}
