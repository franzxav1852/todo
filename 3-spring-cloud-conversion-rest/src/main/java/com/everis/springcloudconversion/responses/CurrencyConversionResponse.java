package com.everis.springcloudconversion.responses;

import java.math.BigDecimal;

import com.everis.springcloudconversion.model.ExchangeValue;

public class CurrencyConversionResponse {
	
	private boolean successful;
	private String message;
	private ExchangeValue value;
	private BigDecimal total;
	
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExchangeValue getValue() {
		return value;
	}
	public void setValue(ExchangeValue value) {
		this.value = value;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

}
