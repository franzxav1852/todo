package com.everis.springcloudconversion.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.springcloudconversion.responses.CurrencyConversionResponse;

//@FeignClient(name="exchange-service", url="localhost:8000")
@FeignClient(name="SPRING-CLOUD-ZUUL-SERVER")
@RibbonClient(name="SPRING-CLOUD-EXCHANGE-REST")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("spring-cloud-exchange-rest/currency-exchange/from/{from}/to/{to}")   
	public CurrencyConversionResponse retrieveExchange(
			   @PathVariable String from, @PathVariable String to); 

}
