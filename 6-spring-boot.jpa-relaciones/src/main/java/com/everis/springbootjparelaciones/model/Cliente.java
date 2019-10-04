package com.everis.springbootjparelaciones.model;
// Generated 17/09/2019 04:38:12 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "cintegracion")
public class Cliente implements java.io.Serializable {

	private Integer idcliente;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private String rfc;
	//private Set<Compra> compras = new HashSet<Compra>(0);

	public Cliente() {
	}

	public Cliente(String nombre, String apaterno, String rfc) {
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.rfc = rfc;
	}

//	@JsonIgnore
//	public Cliente(String nombre, String apaterno, String amaterno, String rfc, Set<Compra> compras) {
//	this.nombre = nombre;
//	this.apaterno = apaterno;
//	this.amaterno = amaterno;
//	this.rfc = rfc;
//	this.compras = compras;
//	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcliente", unique = true, nullable = false)
	public Integer getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apaterno", nullable = false, length = 45)
	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	@Column(name = "amaterno", length = 45)
	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	@Column(name = "rfc", nullable = false, length = 45)
	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
//	public Set<Compra> getCompras() {
//		return this.compras;
//	}
//
//	public void setCompras(Set<Compra> compras) {
//		this.compras = compras;
//	}

}
