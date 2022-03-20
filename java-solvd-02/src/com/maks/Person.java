package com.maks;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {

	private String name;
	private String surname;
	private String gender;
	private LocalDate birthDate;
	private LocalDate regDate;

	private String phone;
	private String email;
	private String login;
	private String password;
	private String passwordReminder;

	private ArrayList<BankAccount> bankAccounts;



	public Person() {}

	public Person(String name, String surname, String gender, LocalDate birthDate, LocalDate regDate, String phone, String email, String login, String password, String passwordReminder, ArrayList<BankAccount> bankAccounts) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthDate = birthDate;
		this.regDate = regDate;
		this.phone = phone;
		this.email = email;
		this.login = login;
		this.password = password;
		this.passwordReminder = passwordReminder;
		this.bankAccounts = bankAccounts;
	}

	public void addBankAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}

	public void removeBankAccount(BankAccount bankAccount) {
		bankAccounts.remove(bankAccount);
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", gender='" + gender + '\'' +
				", birthDate=" + birthDate +
				", regDate=" + regDate +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", passwordReminder='" + passwordReminder + '\'' +
				", bankAccounts=" + bankAccounts +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordReminder() {
		return passwordReminder;
	}

	public void setPasswordReminder(String passwordReminder) {
		this.passwordReminder = passwordReminder;
	}

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}


}
