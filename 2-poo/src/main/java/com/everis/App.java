package com.everis;

import com.everis.poo.model.Cliente;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String json = convertirClienteJson();
        System.out.println(json);
    }
    
    public static String convertirClienteJson() {
    	
    	Cliente cliente = new Cliente();
    	cliente.setIdCliente(1);
    	cliente.setNombre("FRANCISCO");
    	cliente.setApaterno("PEREZ");
    	cliente.setAmaterno("BENITO");
    	cliente.setRfc("PEBF");
    	
    	//CONVERTIR ESTE OBJETO A FORMATO JSON
    	Gson gson = new Gson();
    	String json = gson.toJson(cliente); // convertir el objeto a JSON
    	return json;
    	
    }
}
