package com.ram.dev.lotusapp.transactions;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.dev.lotusapp.settings.Accounts;
import com.ram.dev.lotusapp.settings.Settings;

@RestController
public class TransactionsDAO {

	@RequestMapping(path="/settings/get",method = RequestMethod.GET)
	public Settings getSettings(@RequestBody Settings settings) {
		//TODO
		return settings;
	}

	@RequestMapping(path="/account/add",method = RequestMethod.POST)
	public Accounts addAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@RequestMapping(path="/account/update",method = RequestMethod.POST)
	public Accounts updateAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@RequestMapping(path="/account/remove",method = RequestMethod.POST)
	public Accounts removeAccount(@RequestBody Accounts accounts) {
		//TODO
		return accounts;
	}
	
	@RequestMapping(path="/currency/add",method = RequestMethod.GET)
	public String addCurrency(@RequestBody String currency) {
		//TODO
		return "";
	}
	
	@RequestMapping(path="/currency/remove",method = RequestMethod.GET)
	public String removeCurrency(@RequestBody String currency) {
		//TODO
		return "";
	}
	
	@RequestMapping(path="/currency/get/all",method = RequestMethod.GET)
	public String getCurrencies() {
		//TODO
		return "";
	}

}
