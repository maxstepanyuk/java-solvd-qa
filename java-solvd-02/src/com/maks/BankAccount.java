package com.maks;

import java.time.LocalDate;

public class BankAccount {
	private float ballance;
	private String number;
	private LocalDate expireDate;
	private LocalDate createdDate;
	private String cvvCode;
	private String currency;
	private String accountType;
	private Employee creator;
//	private Employee owner;
	private float withdrawLimit;

	//todo? - перевірки та перевід валют

	public void withdraw(float amount){
		if (amount <= ballance){
			ballance = ballance - amount;
			System.out.println("withdrew " + amount +" "+ currency);
		}else {
			System.out.println("unable to withdraw");
		}
	}

	public void add(float amount){
		ballance = ballance + amount;
	}

	public void transferTo(BankAccount toBankAccount, float amount){ //todo - toBankAccount як посилання
		if (amount <= ballance){
			ballance = ballance - amount;
			toBankAccount.add(amount);
		}else {
			System.out.println("unable to transferTo");
		}
	}

	public String getNetwork(){

		int firstDigit = (int)number.charAt(0);
		String network;

		//todo? - networks to enum
		//todo? (but how) 1st(w 2nd) and length - with enum?
		/*Visa cards – Begin with a 4 and have 13 or 16 digits
		Mastercard cards – Begin with a 5 and has 16 digits
		American Express cards – Begin with a 3, followed by a 4 or a 7  has 15 digits
		Discover cards – Begin with a 6 and have 16 digits
		Diners Club and Carte Blanche cards – Begin with a 3, followed by a 0, 6, or 8 and have 14 digits*/

		switch (firstDigit){
			case 4:
				network = "Visa";
				break;
			case 5:
				network = "Master Card";
				break;
			default:
				network = "Other";
				break;
		}
		return network;
	}

	public BankAccount() {
	}

	public BankAccount(float ballance, String number, LocalDate expireDate, LocalDate createdDate, String cvvCode, String currency, String accountType, Employee creator, float withdrawLimit) {
		this.ballance = ballance;
		this.number = number;
		this.expireDate = expireDate;
		this.createdDate = createdDate;
		this.cvvCode = cvvCode;
		this.currency = currency;
		this.accountType = accountType;
		this.creator = creator;
		this.withdrawLimit = withdrawLimit;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
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
}
