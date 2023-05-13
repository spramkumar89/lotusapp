package com.ram.dev.lotusapp.transactions;

import java.sql.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Transaction {
	private Long id;
	private Date date;
	private String description = "";
	private String type = "";
	private String account = "";
	private float amount = 0L;
	private String currency= "";
	private String category = "";
	private String tags = "";
	private float amountInDefaultCurrency = 0L;
	private String monthYear = "";

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
