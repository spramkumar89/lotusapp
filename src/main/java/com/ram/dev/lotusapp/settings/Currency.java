package com.ram.dev.lotusapp.settings;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CURRENCY")
public class Currency {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="symbol", nullable = false)
	private String symbol;
	
	@Column(name="is_default")
	private boolean is_default = false;
	
	@Column(name="exchange_rate")
	private float exchange_rate = 0L;
	
	@Column(name = "updated_time")
	private Date updated_time = new Date();

	@Override
	public String toString() {
		return "Currency [id=" + id + ", symbol=" + symbol + ", is_default=" + is_default + ", exchange_rate="
				+ exchange_rate + ", updated_time=" + updated_time + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public float getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(float exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public Date getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(Date updated_time) {
		this.updated_time = updated_time;
	}

}
