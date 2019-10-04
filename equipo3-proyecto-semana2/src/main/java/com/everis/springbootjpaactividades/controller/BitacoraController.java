package com.everis.springbootjpaactividades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springbootjpaactividades.model.Bitacora;
import com.everis.springbootjpaactividades.service.BitacoraService;

@RestController
@RequestMapping("bitacoras")
public class BitacoraController {
	
	@Autowired
	private BitacoraService bitacoraService;
	
	@GetMapping("/")
	public List<Bitacora> listar() {
		return bitacoraService.listar();
	}
	
	@PostMapping("/")
	public Bitacora insertar(@RequestBody Bitacora bitacora) {
		return bitacoraService.insertar(bitacora);
	}
	
	@PutMapping("/")
	public Bitacora actualizar(@RequestBody Bitacora bitacora) {
	return bitacoraService.actualizar(bitacora);

    }

    @DeleteMapping("/{idBitacora")
    public boolean eliminar(@PathVariable int idbitacora) {
	return bitacoraService.eliminar(idbitacora);
    }

}
