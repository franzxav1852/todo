package com.everis.springcloudexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springcloudexchange.model.ExchangeValue;
import com.everis.springcloudexchange.repository.ExchangeValueRepository;

@Service
public class ExchangeValueService {
	
	@Autowired    
	private ExchangeValueRepository exchangeValueRepository;
	
	public ExchangeValue findByFromAndTo(String from, String to) {
		return exchangeValueRepository.findByFromAndTo(from, to);
	}
	

}
