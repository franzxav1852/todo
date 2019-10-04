package com.everis.springcloudconversion.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.springcloudconversion.responses.CurrencyConversionResponse;

//@FeignClient(name="exchange-service", url="localhost:8000")
@FeignClient(name="exchange-service")
@RibbonClient(name="exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")   
	public CurrencyConversionResponse retrieveExchange(
			   @PathVariable String from, @PathVariable String to); 

}
