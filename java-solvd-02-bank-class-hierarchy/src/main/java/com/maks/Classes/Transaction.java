package com.maks.Classes;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public final class Transaction {

	private static final Logger LOGGER = Logger.getLogger(Transaction.class);

	private BankAccount fromAccount;
	private BankAccount toAccount;
	private float currentBalanceFrom;
	private float currentBalanceTo;
	private float amount;
	private LocalDateTime time;

	public Transaction() {
	}

	public Transaction(BankAccount fromAccount, BankAccount toAccount, float amount, float newBalanceFrom, float newBalanceTo,
	                   LocalDateTime date) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.currentBalanceFrom = newBalanceFrom;
		this.currentBalanceTo = newBalanceTo;
		this.time = date;
	}

	public BankAccount getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(BankAccount fromAccount) {
		this.fromAccount = fromAccount;
	}

	public BankAccount getToAccount() {
		return toAccount;
	}

	public void setToAccount(BankAccount toAccount) {
		this.toAccount = toAccount;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getCurrentBalanceFrom() {
		return currentBalanceFrom;
	}

	public void setCurrentBalanceFrom(float newBalance) {
		this.currentBalanceFrom = newBalance;
	}

	public float getCurrentBalanceTo() {
		return currentBalanceTo;
	}

	public void setCurrentBalanceTo(float newBalance) {
		this.currentBalanceTo = newBalance;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"fromAccount=" + fromAccount +
				", toAccount=" + toAccount +
				", currentBalanceFrom=" + currentBalanceFrom +
				", currentBalanceTo=" + currentBalanceTo +
				", amount=" + amount +
				", time=" + time +
				'}';
	}
}
