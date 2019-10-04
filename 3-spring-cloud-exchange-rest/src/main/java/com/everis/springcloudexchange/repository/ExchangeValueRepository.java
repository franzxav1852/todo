package com.everis.springcloudexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springcloudexchange.model.ExchangeValue;

@Repository
public interface ExchangeValueRepository  extends JpaRepository<ExchangeValue, Long>{
	     //filtra la consulta por 2 atributos (columnas) en esre 
	     ExchangeValue findByFromAndTo(String from, String to); //de que moneda hasta que moneda va a filtrar
	         

}
