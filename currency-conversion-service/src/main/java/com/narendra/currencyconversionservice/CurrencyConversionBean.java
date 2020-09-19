package com.narendra.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private BigDecimal exchangeRate;
	
	private BigDecimal quantity;
	
	private BigDecimal totalCalculatedAmount;
	
	private Long portNumber;

	public CurrencyConversionBean(){
	}
	
	public CurrencyConversionBean(Long id, String currencyFrom, String currencyTo, BigDecimal exchangeRate,
			BigDecimal quantity, BigDecimal totalCalculatedAmount, Long portNumber) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.exchangeRate = exchangeRate;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.portNumber = portNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Long getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Long portNumber) {
		this.portNumber = portNumber;
	}
}
