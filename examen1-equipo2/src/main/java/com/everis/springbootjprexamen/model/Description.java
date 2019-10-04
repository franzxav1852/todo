package com.everis.springbootjprexamen.model;
// Generated 20/09/2019 02:04:20 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description generated by hbm2java
 */
@Entity
@Table(name = "description", catalog = "examen2")
public class Description implements java.io.Serializable {

	private Integer idDescription;
	private String descripcion;
	private String category;
	private String precio;

	public Description() {
	}

	public Description(String descripcion, String category) {
		this.descripcion = descripcion;
		this.category = category;
	}

	public Description(String descripcion, String category, String precio) {
		this.descripcion = descripcion;
		this.category = category;
		this.precio = precio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDescription", unique = true, nullable = false)
	public Integer getIdDescription() {
		return this.idDescription;
	}

	public void setIdDescription(Integer idDescription) {
		this.idDescription = idDescription;
	}

	@Column(name = "descripcion", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "category", nullable = false, length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "precio", length = 45)
	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

}