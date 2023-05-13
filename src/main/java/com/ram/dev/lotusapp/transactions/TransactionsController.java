package com.ram.dev.lotusapp.transactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.dev.lotusapp.settings.Accounts;
import com.ram.dev.lotusapp.settings.Settings;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionsController {

	@GetMapping(path="/get")
	public Settings getTransaction(@RequestBody Settings settings) {
		//TODO
		return settings;
	}

	@PostMapping(path="/add")
	public Accounts addTransaction(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/update")
	public Accounts updateTransaction(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/remove")
	public Accounts removeTransaction(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/month/")
	public String getMonthlyTransaction(@RequestBody String currency) {
		//TODO
		return "";
	}
	
}
