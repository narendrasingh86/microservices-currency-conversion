package com.narendra.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeControler {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValues getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValues exchangeValues = repository.findByCurrencyFromAndCurrencyTo(from, to);
		exchangeValues.setPortNumber(Integer.parseInt(environment.getProperty("server.port")));
		return exchangeValues;
	}
}
