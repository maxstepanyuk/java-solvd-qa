package com.maks.Classes;

import com.maks.Enum.Gender;
import com.maks.Interfaces.IKeepBankAccounts;
import com.maks.Interfaces.IKeepCredits;

import java.time.LocalDate;
import java.util.ArrayList;

public final class Client extends User implements IKeepBankAccounts, IKeepCredits {

	private LocalDate regDate;
	private ArrayList<BankAccount> bankAccounts;
	private ArrayList<Credit> credits;

	public Client() {
	}

	public Client(String name, String surname, Gender gender, LocalDate birthDate, String phone,
	              String email, String login, String password, String passwordReminder, LocalDate regDate,
	              ArrayList<BankAccount> bankAccounts, ArrayList<Credit> credits) {
		super(name, surname, gender, birthDate, phone, email, login, password, passwordReminder);
		this.regDate = regDate;
		this.bankAccounts = bankAccounts;
		this.credits = credits;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public void addBankAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}

	public void removeBankAccount(BankAccount bankAccount) {
		bankAccounts.remove(bankAccount);
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void addCredit(Credit credit) {
		credits.add(credit);
	}

	public void removeCredit(Credit credit) {
		credits.remove(credit);
	}

	@Override
	public String toString() {
		return "Client{" +
				"regDate=" + regDate +
				", bankAccounts=" + bankAccounts +
				", credits=" + credits +
				"} " + super.toString();
	}
}
