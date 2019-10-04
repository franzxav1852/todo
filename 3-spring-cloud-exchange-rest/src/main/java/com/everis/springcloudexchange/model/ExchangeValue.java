package com.everis.springcloudexchange.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private long id;
	
	@Column(name = "currency_from")
	private String from;

    @Column(name = "currency_to")    
	private String to;
    
    @Column(name = "conversion_multiple") //multiplo de conversion
    private BigDecimal factor;
    
    @Column //si tiene el mismo nombre en la base de datos no es necesaio especificar el nombre
    private int port;
		
	public BigDecimal getFactor() {
		return factor;
	}

	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	



}
