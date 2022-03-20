package com.maks.NotUsed;

public enum BankNetwork {
	AmericanExpress(3),
	VISA(4),
	MASTERCARD(5);

	private final int firstDigit;

	BankNetwork(int firstDigit) {
		this.firstDigit = firstDigit;
	}

}
