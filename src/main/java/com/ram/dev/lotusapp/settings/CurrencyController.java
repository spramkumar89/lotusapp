package com.ram.dev.lotusapp.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/currency")
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;

	@GetMapping(path="/get")
	public List<Currency> getCurrencies() {
		return currencyService.getCurrencies();
	}

	@PostMapping(path="/add")
	public void addCurrency(@RequestBody Currency currency) {
		System.out.println("Received Currency : " + currency.toString());
		currencyService.addCurrency(currency);
	}
	
	@PostMapping(path="/update")
	public void updateCurrency(@RequestBody Currency currency) {
		currencyService.updateCurrency(currency);
	}
	
	@PostMapping(path="/remove")
	public void removeCurrency(@RequestBody Currency currency) {
		currencyService.removeCurrency(currency);
	}
	
}
