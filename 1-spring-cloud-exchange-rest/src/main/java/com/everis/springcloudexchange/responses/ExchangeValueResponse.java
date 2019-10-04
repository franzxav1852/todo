package com.everis.springcloudexchange.responses;

import com.everis.springcloudexchange.model.ExchangeValue;

public class ExchangeValueResponse {
	
	private boolean successful;
	private String message;
	private ExchangeValue value;
	
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

}
