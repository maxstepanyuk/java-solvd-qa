package com.maks.Classes;

import com.maks.Enum.AccountType;
import com.maks.Enum.BankNetwork;

import java.time.LocalDate;

public class BankAccount {
	private float ballance;
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

	public BankAccount(float ballance, String number, LocalDate expireDate, LocalDate createdDate, String cvvCode,
					   String currency, AccountType accountType, Employee creator, float withdrawLimit, BankNetwork creditCardType) {
		this.ballance = ballance;
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

	public float getBallance() {
		return ballance;
	}

	public void setBallance(float ballance) {
		this.ballance = ballance;
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
				"ballance=" + ballance +
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

	public void withdraw(float amount){
		if (amount <= ballance){
			ballance = ballance - amount;
			System.out.println("withdrew " + amount + " " + currency);
		}else {
			System.out.println("unable to withdraw");
		}
	}

	public void add(float amount){
		this.ballance = this.ballance + amount;
	}

	public void transferTo(BankAccount toBankAccount, float amount){ //todo - toBankAccount як посилання
		if (amount <= this.ballance){
			this.ballance = this.ballance - amount;
			toBankAccount.add(amount);

			//todo create to transaction (and move to client or and a "wrapper" function?)
		}else {
			System.out.println("unable to transferTo");
		}
	}


}
