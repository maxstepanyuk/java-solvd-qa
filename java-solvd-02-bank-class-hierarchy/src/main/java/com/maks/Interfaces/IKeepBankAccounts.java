package com.maks.Interfaces;

import java.util.ArrayList;

import com.maks.Classes.BankAccount;

public interface IKeepBankAccounts {

	public ArrayList<BankAccount> getBankAccounts();

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts);

	public void addBankAccount(BankAccount bankAccount);

	public void removeBankAccount(BankAccount bankAccount);

}
