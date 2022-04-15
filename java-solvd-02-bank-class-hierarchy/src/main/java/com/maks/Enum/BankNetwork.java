package com.maks.Enum;

public enum BankNetwork {
	VISA( "Visa"),
	MASTERCARD("Mastercard");

	private final String value;

	BankNetwork(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
