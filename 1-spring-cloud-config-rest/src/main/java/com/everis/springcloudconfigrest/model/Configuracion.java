package com.everis.springcloudconfigrest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//joan telefono 5513562860
//joan correo jbaezjua@everis.com

@Component //cuando no sabes que tipo de clase es la esteorotipas de esta manera como una clase padre
//Especifico el prefijo de los valores del properties  (githup)
@ConfigurationProperties("config")//va enmapar con todos tus clases con todos los que digan config 
public class Configuracion {
	
	private String url;
	private String usuario;
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Configuracion [url=" + url + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	
}
