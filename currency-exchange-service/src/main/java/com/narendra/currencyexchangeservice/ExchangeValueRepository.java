package com.narendra.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValues, Long> {

	ExchangeValues findByCurrencyFromAndCurrencyTo(String currency_from, String currency_to);
}
