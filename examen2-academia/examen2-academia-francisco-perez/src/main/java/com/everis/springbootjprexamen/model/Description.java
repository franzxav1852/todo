package com.everis.springbootjprexamen.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Description implements java.io.Serializable{

		private Integer id;
		private int category;
			@JsonIgnore
		private Set<Product> descrition = new HashSet<Product>(0);
			private Set<Product> setProduct;
			
			public Description() {
			}

			public Description(int nombre) {
				this.category= category;
			}

			public Description(int category, Set<Product> product) {
				this.category = category;
		
			}
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)

			@Column(name = "id", unique = true, nullable = false)
			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			@Column(name = "category", nullable = false, length = 45)
			public int getCategory() {
				return this.category;
			}

			
			@OneToMany(fetch = FetchType.EAGER, mappedBy = "alumno")
			public Set<Product> getProduct() {
				return this.getProduct();
			}

			public void setProduct(Set<Product> product) {
				this.setProduct = product;
			}

}
