package com.everis.bancos.dao;

import java.util.ArrayList;
import java.util.List;

import com.everis.bancos.Banco;

public class BancoDAO {
	

	
	private List<Banco> bancos = new ArrayList<>();
	public List <Banco> listar() {
	
		return bancos;
	}
	
	public void insertar(Banco banco) { 
		bancos.add(banco);
	}
	
	public Banco buscar(int idBanco) {
		
		for (Banco banco: bancos) {
			if(banco.getIdBanco() == idBanco) {
				return banco;
			}
		}
		
		return null;
		
		
	}
	
	public boolean actualizar(Banco banco) {
		Banco  localizado = buscar(banco.getIdBanco());
		if(localizado !=null) {
			localizado.setNombre(banco.getNombre());
			localizado.setDireccion(banco.getDireccion());
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean eliminar (int idBanco) {
		Banco encontrado = buscar (idBanco);
		if(encontrado != null) {
			bancos.remove(encontrado);
			return true;
		} else {
			return false;
		}
	}
	

}
