package com.everis.bancos.service;

import java.util.List;

import com.everis.bancos.Banco;
import com.everis.bancos.dao.BancoDAO;

public class BancoService {
	
	private BancoDAO bancoDAO = new BancoDAO();
	
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


