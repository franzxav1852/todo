package com.everis.springcore.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springcore.model.Producto;

@RestController // cumple con la funcion de un servlet sin necesidad de realizarlo manualmente
public class HolaMundoController {

	@GetMapping("/saludar") // es el equivalente a un DoGet
	public String saludar() {
		return "Hola Spring Boot";
	}

	@PostMapping("/sumar/{x}/{y}")
	public double sumar(@PathVariable double x, @PathVariable double y) {
		return x + y;
	}

	@PutMapping("/validar")
	public String validar(@RequestBody Producto producto) {
		return producto.toString();

	}

	@DeleteMapping("/eliminar/{idProducto}")
	public void eliminar(@PathVariable("idProducto") int id) {
		System.out.println("Eliminando producto: " + id);
	}

	@GetMapping("/enviar")
	public String enviar(@RequestParam String mensaje) {
		return "El mensaje fue: " + mensaje;
	}

	@GetMapping("/descargar") // Regresar respuesta especifica
	public ResponseEntity<Object> descargar() throws FileNotFoundException {
		String imagen = "c:/temp/imagen.jpg";
		File archivo = new File(imagen);
		InputStreamResource resourse = new InputStreamResource(new FileInputStream(archivo));

		ResponseEntity<Object> respuesta = ResponseEntity.ok().contentLength(archivo.length())
				.contentType(MediaType.IMAGE_JPEG).body(resourse);
		return respuesta;
	}
	
	

}
