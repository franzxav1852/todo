package com.everis.springcore.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springcore.dao.ClienteDAO;
import com.everis.springcore.model.Cliente;

/**
 * Regla de negocio relacionada a clientes.
 * @author Dell5458
 *
 */
@Service //SErvicio de negocio, agrega un objeto al contexto de sprinng
public class ClienteService {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	public List<Cliente> listar() {
		return clienteDAO.listar();
	}
	
	//public void insertar(Cliente cliente) {
		
	public boolean insertar (Cliente cliente) {
		//validar el rfc que no permita duplicados
		
		List<Cliente> clientes = listar();
		for(Cliente objCliente : clientes) {
			if (objCliente.getRfc().equals(cliente.getRfc())) {
				return false;
			}
		}
		
	clienteDAO.insertar(cliente);
	return false;
	}
	
	public boolean exportarXLSX(String rutaArchivo) {
		XSSFWorkbook  libro= new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet("Mis Clientes");
		String [] header= new String[]{"IdCliente", "Nombre","aPpaterno","aMaterno", "RFC"};
		//Crea la fila del encabezado
		XSSFRow row=hoja1.createRow(0);
		for(int i=0; i < header.length; i++) {
			XSSFCell celda = row.createCell(i);
			celda.setCellValue(header[i]);
		}
		
		List<Cliente> clientes = listar();
		for(int i=1; i<= clientes.size(); i++) {
			XSSFRow fila = hoja1.createRow(i);
			Cliente cliente = clientes.get(i - 1);
			
			XSSFCell celdaIdCliente = fila.createCell(0);
			celdaIdCliente.setCellValue(cliente.getIdCliente());
			
			XSSFCell celdaNombre = fila.createCell(1);
			celdaNombre.setCellValue(cliente.getNombre());
			
			XSSFCell celdaApaterno = fila.createCell(2);
			celdaApaterno.setCellValue(cliente.getApaterno());
			
			XSSFCell celdaAmaterno = fila.createCell(3);
			celdaAmaterno.setCellValue(cliente.getAmaterno());
			
			XSSFCell celdaRfc = fila.createCell(4);
			celdaRfc.setCellValue(cliente.getRfc());				
					
		}
		
		try {
			File archivo = new File(rutaArchivo);
			FileOutputStream fileOut = new FileOutputStream(archivo);
			if(archivo.exists()) {
				archivo.delete();	
				} else {
					libro.write(fileOut);
					fileOut.flush();
					fileOut.close();
				}
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public Cliente buscar (int idCliente) {
		return clienteDAO.buscar(idCliente);
	}
	
	public boolean actualizar(Cliente cliente) {
		return clienteDAO.actualizar(cliente);
	}
	
	public boolean eliminar (int idCliente) {
		return clienteDAO.eliminar(idCliente);
	
	}
	

}
