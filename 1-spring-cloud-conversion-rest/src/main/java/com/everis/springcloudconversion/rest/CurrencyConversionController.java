package com.everis.springcloudconversion.rest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.everis.springcloudconversion.responses.CurrencyConversionResponse;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionResponse convert(@PathVariable String from,
			                                  @PathVariable String to,
			                                  @PathVariable BigDecimal quantity) {
		String url = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
	
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		//
		CurrencyConversionResponse response = new CurrencyConversionResponse();
		try {
		ResponseEntity<CurrencyConversionResponse> respuesta =
		             new RestTemplate().getForEntity(url,
		            		 CurrencyConversionResponse.class, uriVariables);
		
		response = respuesta.getBody();
		response.setTotal(quantity.multiply(response.getValue().getFactor()));
		response.setSuccessful(true);
		response.setMessage("Conversion exitosa");
		return response;
		} catch (Exception e) {
			response.setSuccessful(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
}
