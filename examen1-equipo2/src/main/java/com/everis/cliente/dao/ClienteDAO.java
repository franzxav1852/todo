package com.everis.cliente.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.everis.cliente.model.Cliente;
import com.everis.cliente.util.ConexionMySQL;

public class ClienteDAO {
	private ConexionMySQL conexion =  new ConexionMySQL();
	
	public List<Cliente> listar(){
		String sql = "SELECT * FROM cliente";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		try {
			conexion.conectar();
			ResultSet rs = conexion.ejecutarConsulta(sql);
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idcliente"));
				cliente.setAmaterno(rs.getString("amaterno"));
				cliente.setApaterno(rs.getString("apaterno"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setRfc(rs.getString("rfc"));
				listaClientes.add(cliente);
			}
			conexion.desconectar();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return listaClientes;
	}
	
	public void insertar(Cliente cliente) {
		String sql = "INSERT INTO cliente(nombre, apaterno, amaterno, rfc, idbanco) VALUES ('"+cliente.getNombre()+"','"+cliente.getApaterno()+"','"+cliente.getAmaterno()+"','"+cliente.getRfc()+"',1)";
		try {
			conexion.conectar();
			conexion.ejecutar(sql);
			conexion.desconectar();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	

}
