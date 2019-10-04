package com.everis.springbootjpaactividades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjpaactividades.model.Usuario;
import com.everis.springbootjpaactividades.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	public Usuario insertar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario actualizar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
//	public boolean eliminar(int id) {
//		usuarioRepository
//	}

}
