package com.ram.dev.lotusapp.settings;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_ACCOUNTS")
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startingBalance")
	private float startingBalance;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	@Column(name = "loanAmount")
	private float loanAmount;
	
	@Column(name = "creditLimit")
	private float creditLimit;
	
	@Column(name = "statementDate")
	private Date statementDate;
	
	@Column(name = "billDate")
	private Date billDate;
	
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
