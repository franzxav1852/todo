package com.everis.bancos;

public class Banco {
	
	
	public String toString(){
		return "Banco [idBanco=" + idBanco + ", nombre =" + nombre +",direccion"+ direccion + "";
		
		
	}
	
	private int idBanco;
	private String nombre;
	private String direccion;


	//public Banco ();
	
	
	private int IdBanco;
	public int getIdBanco() {
		return IdBanco;
	}
	public void setIdBanco(int idBanco) {
		IdBanco = idBanco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
