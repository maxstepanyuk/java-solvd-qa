package com.maks.Classes;

import java.util.ArrayList;

//todo - bank
public class Bank {

	private String name;
	private ArrayList<BankBranch> branches;
	private ArrayList<Client> clients;
	private ArrayList<Transaction> transactions;
	private ArrayList<Employee> employees;
	private ArrayList<Credit> credits;
	private ArrayList<BankAccount> accounts;

	public Bank() {
	}

	public Bank(String name, ArrayList<BankBranch> branches, ArrayList<Client> clients,
	            ArrayList<Transaction> transactions, ArrayList<Employee> employees, ArrayList<Credit> credits, ArrayList<BankAccount> accounts) {
		this.name = name;
		this.branches = branches;
		this.clients = clients;
		this.transactions = transactions;
		this.employees = employees;
		this.credits = credits;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BankBranch> getBranches() {
		return branches;
	}

	public void setBranches(ArrayList<BankBranch> branches) {
		this.branches = branches;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}

	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<BankAccount> accounts) {
		this.accounts = accounts;
	}

	public void addBranch(BankBranch bankBranch){
		branches.add(bankBranch);
	}

	public void removeBranch(BankBranch bankBranch){
		branches.remove(bankBranch);
	}

	public void addClent(Client client){
		clients.add(client);
	}

	public void removeClient(Client client){
		clients.remove(client);
	}

	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
	}

	public void removeTransaction(Transaction transaction){
		transactions.remove(transaction);
	}

	public void addEmployee(Employee employee){
		employees.add(employee);
	}

	public void removeEmployee(Employee employee){
		employees.remove(employee);
	}

	public void addCredit(Credit credit){
		credits.add(credit);
	}

	public void removeCredit(Credit credit){
		credits.remove(credit);
	}

	public void addBankAccount (BankAccount account){
		accounts.add(account);
	}

	public void removeBankAccount (BankAccount account){
		accounts.remove(account);
	}

	@Override
	public String toString() {
		return "Bank{" +
				"name='" + name + '\'' +
				", branches=" + branches +
				", clients=" + clients +
				", transactions=" + transactions +
				", employees=" + employees +
				", credits=" + credits +
				", accounts=" + accounts +
				'}';
	}
}
