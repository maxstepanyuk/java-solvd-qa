package com.maks.Classes;

import org.apache.log4j.Logger;

import java.time.LocalDate;

public final class Credit {

	private static final Logger LOGGER = Logger.getLogger(Credit.class);

	private float amount;
	private float present;
	private LocalDate createdDate;
	private String currency;

	public Credit() {
	}

	public Credit(float amount, float present, LocalDate createdDate, String currency) {
		this.amount = amount;
		this.present = present;
		this.createdDate = createdDate;
		this.currency = currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getPresent() {
		return present;
	}

	public void setPresent(float present) {
		this.present = present;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Credit{" + "amount=" + amount +
				", present=" + present +
				", createdDate=" + createdDate +
				", currency='" + currency + '\'' +
				'}';
	}
}
