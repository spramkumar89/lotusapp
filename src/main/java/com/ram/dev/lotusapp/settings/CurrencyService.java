package com.ram.dev.lotusapp.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	public void addCurrency(Currency currency) {
		currencyRepository.save(currency);
	}
	
	public void updateCurrency(Currency currency) {
		currencyRepository.save(currency);
	}
	
	public void removeCurrency(Currency currency) {
		currencyRepository.delete(currency);
	}
	
	public List<Currency> getCurrencies() {
		return currencyRepository.findAll();
	}
}
