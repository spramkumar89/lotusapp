package com.ram.dev.lotusapp.settings;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_ACCOUNTS")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "type", nullable = false)
	private String type;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "starting_balance")
	private float startingBalance = 0L;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	@Column(name = "loan_amount")
	private float loanAmount = 0L;
	
	@Column(name = "credit_limit")
	private float creditLimit;
	
	@Column(name = "statement_date")
	private Date statementDate;
	
	@Column(name = "bill_date")
	private Date billDate;
	
	@Column(name = "updated_time")
	private Date updatedTime = new Date();

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description
				+ ", startingBalance=" + startingBalance + ", currency=" + currency + ", loanAmount=" + loanAmount
				+ ", creditLimit=" + creditLimit + ", statementDate=" + statementDate + ", billDate=" + billDate
				+ ", updatedTime=" + updatedTime + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

}
