package com.everis.jee.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.poo.model.Cliente;
import com.everis.poo.service.ClienteService;
import com.google.gson.Gson;

/**
 * Servlet implementation class JSONRestController
 */
public class JSONRestController extends HttpServlet {
	    // se debe de implementar por que la clase httpServlet implementa la interfaz Serializacion
	    //Identificador para el tipo de objeto HttpServlet
	private static final long serialVersionUID = 1L;
	
	static ClienteService servicio = new ClienteService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONRestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Cliente> clientes = servicio.listar();
		Gson gson = new Gson();
    	String json = gson.toJson(clientes); 
    	response.getWriter().append(json);
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idEliminar = request.getParameter("idEliminar");
		if (idEliminar != null) {
			int idEliminarEntero = Integer.parseInt(idEliminar);
			boolean exito = servicio.eliminar(idEliminarEntero);
			response.getWriter().append(exito + "");
			return;
		}
		/**
		 * Leer el request body de la peticion
		 * payload (json)
		 */
		
		StringBuilder sb = new StringBuilder();
		//Flujo de entrada que llega por la peticion http
		BufferedReader reader =  request.getReader();
		String linea;
		while((linea = reader.readLine()) != null) {
			sb.append(linea);
		}
		
		String json = sb.toString();
		Gson gson = new Gson();
		Cliente cliente = gson.fromJson(json, Cliente.class);
		
		// TODO Auto-generated method stub
//		String nombre = request.getParameter("nombre");
//		String apaterno = request.getParameter("apaterno");
//		String amaterno = request.getParameter("amaterno");
//		String rfc = request.getParameter("rfc");
//		
//		Cliente cliente = new Cliente();
//		cliente.setNombre(nombre);
//		cliente.setApaterno(apaterno);
//		cliente.setAmaterno(amaterno);
//		cliente.setRfc(rfc);
		
		if (cliente.getIdCliente()<=0) {
			boolean exito = servicio.insertar(cliente);
			response.getWriter().append(exito + "");
		} else {
		boolean exito = servicio.actualizar(cliente);
		response.getWriter().append(exito + "");
		   }
				
	}		

}
