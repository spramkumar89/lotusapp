package com.ram.dev.lotusapp.settings;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Accounts {
	private String name = "";
	private String description = "";
	private float startingBalance;
	private String currency = "";
	private float loanAmount;
	private float creditLimit;
	private Date statementDate = new Date();
	private Date billDate = new Date();
	@Override
	public String toString() {
		return "AccountsCardsBean [name=" + name + ", description=" + description + ", startingBalance="
				+ startingBalance + ", currency=" + currency + ", loanAmount=" + loanAmount + ", creditLimit="
				+ creditLimit + ", statementDate=" + statementDate + ", billDate=" + billDate + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getStartingBalance() {
		return startingBalance;
	}
	public void setStartingBalance(float startingBalance) {
		this.startingBalance = startingBalance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}
	public Date getStatementDate() {
		return statementDate;
	}
	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
}
