package com.ram.dev.lotusapp.settings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Settings {
	private List<Accounts> bankAccounts = new ArrayList<Accounts>();
	private List<Accounts> loanAccounts = new ArrayList<Accounts>();
	private List<Accounts> creditCards = new ArrayList<Accounts>();
	private List<String> availableCurrencies = new ArrayList<String>();
	
	public List<Accounts> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<Accounts> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public List<Accounts> getLoanAccounts() {
		return loanAccounts;
	}
	public void setLoanAccounts(List<Accounts> loanAccounts) {
		this.loanAccounts = loanAccounts;
	}
	public List<Accounts> getCreditCards() {
		return creditCards;
	}
	public void setCreditCards(List<Accounts> creditCards) {
		this.creditCards = creditCards;
	}
	public List<String> getAvailableCurrencies() {
		return availableCurrencies;
	}
	public void setAvailableCurrencies(List<String> availableCurrencies) {
		this.availableCurrencies = availableCurrencies;
	}
	
}
