package com.ram.dev.lotusapp.reports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.dev.lotusapp.settings.Account;
import com.ram.dev.lotusapp.settings.Currency;

@RestController
@RequestMapping(path = "reports")
public class ReportsDAO {

	@GetMapping(path="/get")
	public Currency getTransaction(@RequestBody Currency settings) {
		//TODO
		return settings;
	}

	@PostMapping(path="/add")
	public Account addTransaction(@RequestBody Account accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/update")
	public Account updateTransaction(@RequestBody Account accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/remove")
	public Account removeTransaction(@RequestBody Account accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/month/")
	public String getMonthlyTransaction(@RequestBody String currency) {
		//TODO
		return "";
	}
	
}
