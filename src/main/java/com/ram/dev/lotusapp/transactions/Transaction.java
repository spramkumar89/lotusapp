package com.ram.dev.lotusapp.transactions;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_TRANSACTION")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="description")
	private String description;
	
	@Column(name="type",nullable = false)
	private String type;
	
	@Column(name="account")
	private String account;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="category")
	private String category;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="amountInDefaultCurrency")
	private float amountInDefaultCurrency;
	
	@Column(name="monthYear")
	private String monthYear;

	public Transaction(Long id, Date date, String description, String type, String account, float amount,
			String currency, String category, String tags, float amountInDefaultCurrency, String monthYear) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.type = type;
		this.account = account;
		this.amount = amount;
		this.currency = currency;
		this.category = category;
		this.tags = tags;
		this.amountInDefaultCurrency = amountInDefaultCurrency;
		this.monthYear = monthYear;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", description=" + description + ", type=" + type
				+ ", account=" + account + ", amount=" + amount + ", currency=" + currency + ", category=" + category
				+ ", tags=" + tags + ", amountInDefaultCurrency=" + amountInDefaultCurrency + ", monthYear=" + monthYear
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public float getAmountInDefaultCurrency() {
		return amountInDefaultCurrency;
	}

	public void setAmountInDefaultCurrency(float amountInDefaultCurrency) {
		this.amountInDefaultCurrency = amountInDefaultCurrency;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

}
