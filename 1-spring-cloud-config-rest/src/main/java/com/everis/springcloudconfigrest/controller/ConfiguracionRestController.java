package com.everis.springcloudconfigrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcloudconfigrest.model.Configuracion;

@RestController
public class ConfiguracionRestController {
	
	    //Auto-Wired, pero trae 1 valor    
	    @Value("${config.usuario}")
	    private String usuario;
	    
	    @Autowired
	    private Configuracion configuracion;
	    
	    @GetMapping("/usuario")
	    public String obtenerUsuario() {
	    	return usuario;
	    }
	    
	    @GetMapping("/configuracion")
	    public String obtenerConfiguracion() {
	    	return configuracion.toString();
	    }
	

}
