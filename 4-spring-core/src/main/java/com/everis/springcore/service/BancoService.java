package com.everis.springcore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springcore.model.Banco;
import com.everis.springcore.dao.BancoDAO;

@Service
public class BancoService {
	
	@Autowired
	private BancoDAO bancoDAO;
	
	public List<Banco> listar(){
		return bancoDAO.listar();
		
		
	}
	
public boolean insertar (Banco banco) {
		
		List<Banco> bancos = listar();
		for(Banco objBanco : bancos) {
			if (objBanco.getNombre().equals(banco.getNombre())) {
				return false;
			}
		}
		bancoDAO.insertar(banco);
		return false;
      }

public Banco buscar (int idbanco) {
	return bancoDAO.buscar(idbanco);
}

public boolean actualizar(Banco banco) {
	return bancoDAO.actualizar(banco);
}

public boolean eliminar (int idBanco) {
	return bancoDAO.eliminar(idBanco);
}

}


