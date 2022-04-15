package com.maks.Interfaces;

import com.maks.Classes.Credit;

import java.util.ArrayList;

public interface IKeepCredits {

	public void setCredits(ArrayList<Credit> credits);

	public ArrayList<Credit> getCredits();

	public void addCredit(Credit credit);

	public void removeCredit(Credit credit);

}
