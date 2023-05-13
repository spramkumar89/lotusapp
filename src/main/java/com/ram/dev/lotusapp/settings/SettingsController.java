package com.ram.dev.lotusapp.settings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/settings")
public class SettingsController {

	@GetMapping(path="/get")
	public Settings getSettings(@RequestBody Settings settings) {
		//TODO
		return settings;
	}

	@PostMapping(path="/account/add")
	public Accounts addAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/account/update")
	public Accounts updateAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/account/remove")
	public Accounts removeAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@PostMapping(path="/currency/add")
	public String addCurrency(@RequestBody String currency) {
		//TODO
		return "";
	}
	
	@PostMapping(path="/currency/remove")
	public String removeCurrency(@RequestBody String currency) {
		//TODO
		return "";
	}
	
	@GetMapping(path="/currency/get/all")
	public String getCurrencies() {
		//TODO
		return "";
	}

}
