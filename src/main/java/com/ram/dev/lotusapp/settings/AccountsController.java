package com.ram.dev.lotusapp.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/accounts")
public class AccountsController {
	
	@Autowired
	private AccountsService accountsService;

	@GetMapping(path="/get")
	public List<Account> getSettings() {
		return accountsService.getAccounts();
	}

	@PostMapping(path="/add")
	public void addAccount(@RequestBody Account account) {
		accountsService.addAccount(account);
	}
	
	@PostMapping(path="/update")
	public void updateAccount(@RequestBody Account account) {
		accountsService.updateAccount(account);
	}
	
	@PostMapping(path="/remove")
	public void removeAccount(@RequestBody Account account) {
		accountsService.removeAccount(account);
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
