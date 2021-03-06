package com.maks.Classes;

import com.maks.Enum.AccountType;
import com.maks.Enum.BankNetwork;
import com.maks.Exeptions.TransactionExeption;
import com.maks.Exeptions.ValueExeption;

import com.maks.Interfaces.IKeepMoney;

import org.apache.log4j.Logger;

import java.time.LocalDate;

public final class BankAccount implements IKeepMoney {

	private static final Logger LOGGER = Logger.getLogger(BankAccount.class);

	private float balance;
	private String number;
	private LocalDate expireDate;
	private LocalDate createdDate;
	private String cvvCode;
	private String currency;
	private AccountType accountType;
	private Employee creator;
	private float withdrawLimit;
	private BankNetwork network;

	public BankAccount() {
	}

	public BankAccount(float balance, String number, LocalDate expireDate, LocalDate createdDate, String cvvCode,
	                   String currency, AccountType accountType, Employee creator, float withdrawLimit, BankNetwork creditCardType) {
		this.balance = balance;
		this.number = number;
		this.expireDate = expireDate;
		this.createdDate = createdDate;
		this.cvvCode = cvvCode;
		this.currency = currency;
		this.accountType = accountType;
		this.creator = creator;
		this.withdrawLimit = withdrawLimit;
		this.network = creditCardType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Employee getCreator() {
		return creator;
	}

	public void setCreator(Employee creator) {
		this.creator = creator;
	}

	public float getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(float withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public BankNetwork getNetwork() {
		return network;
	}

	public void setNetwork(BankNetwork network) {
		this.network = network;
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"balance=" + balance +
				", number='" + number + '\'' +
				", expireDate=" + expireDate +
				", createdDate=" + createdDate +
				", cvvCode='" + cvvCode + '\'' +
				", currency='" + currency + '\'' +
				", accountType=" + accountType +
				", creator=" + creator +
				", withdrawLimit=" + withdrawLimit +
				", creditCardType=" + network +
				'}';
	}

	@Override
	public void withdrawMoney(float amount) {
		try {
			if (amount <= balance && amount < withdrawLimit) {
				balance = balance - amount;
				System.out.println("withdrew " + amount + " " + currency);
			} else {
				throw new TransactionExeption("unable to withdraw");
			}
		} catch (TransactionExeption e) {
			LOGGER.warn("Exception :" + e + "; " + e.getStackTrace());
		}
	}

	@Override
	public void addMoney(float amount) {
		balance = balance + amount;
	}

	public static final void trasfer(BankAccount bankAccountFrom, BankAccount bankAccountTo, float amount) {

		try {
			if (bankAccountFrom.getBalance() >= amount) {
				bankAccountFrom.withdrawMoney(amount);
				bankAccountTo.addMoney(amount);
			} else {
				throw new TransactionExeption("unable to transfer because unable to withdraw");
			}
		} catch (TransactionExeption e) {
			LOGGER.warn("Exception :" + e + "; " + e.getStackTrace());
		}
	}

}
