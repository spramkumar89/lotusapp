package com.ram.dev.lotusapp.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	public void addAccount(Account account) {
		accountsRepository.save(account);
	}
	
	public void updateAccount(Account account) {
		accountsRepository.save(account);
	}
	
	public void removeAccount(Account account) {
		accountsRepository.delete(account);
	}
	
	public List<Account> getAccounts() {
		return accountsRepository.findAll();
	}
}
