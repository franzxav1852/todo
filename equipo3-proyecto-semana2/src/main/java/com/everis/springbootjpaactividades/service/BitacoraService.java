package com.everis.springbootjpaactividades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpaactividades.model.Bitacora;
import com.everis.springbootjpaactividades.model.Usuario;
import com.everis.springbootjpaactividades.repository.BitacoraRepository;

@Service
public class BitacoraService {
	
	@Autowired
	private BitacoraRepository bitacoraRepository;
	
	public List<Bitacora> listar() {
		return bitacoraRepository.findAll();
	}
	
	public Bitacora insertar(Bitacora bitacora) {
		return bitacoraRepository.save(bitacora);
	}
	
	public Bitacora actualizar(Bitacora bitacora) {
	return bitacoraRepository.save(bitacora);
	}
	
	public boolean eliminar(int idBitacora) {
		Bitacora encontrada = bitacoraRepository.findById(idBitacora).get();
		if (encontrada != null) {
			bitacoraRepository.delete(encontrada);
			return true;
		} else {
			return false;
		}
			
	}
	
}