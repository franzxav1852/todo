package com.everis.springbootjpaactividades.model;
// Generated 18/09/2019 12:41:08 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Actividad generated by hbm2java
 */
@Entity
@Table(name = "actividad", catalog = "actividadesdb")
public class Actividad implements java.io.Serializable {

	private int idactividad;
	private String nombre;
	private String descripcion;
	private int horas;
	private Set<Actividadasignada> actividadasignadas = new HashSet<Actividadasignada>(0);

	public Actividad() {
	}

	public Actividad(int idactividad, String nombre, String descripcion, int horas) {
		this.idactividad = idactividad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas = horas;
	}

	public Actividad(int idactividad, String nombre, String descripcion, int horas,
			Set<Actividadasignada> actividadasignadas) {
		this.idactividad = idactividad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horas = horas;
		this.actividadasignadas = actividadasignadas;
	}

	@Id

	@Column(name = "idactividad", unique = true, nullable = false)
	public int getIdactividad() {
		return this.idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "horas", nullable = false)
	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actividad")
	public Set<Actividadasignada> getActividadasignadas() {
		return this.actividadasignadas;
	}

	public void setActividadasignadas(Set<Actividadasignada> actividadasignadas) {
		this.actividadasignadas = actividadasignadas;
	}

}
