package com.maks.Enum;

public enum BankNetwork {
	VISA( "Visa", 4, 16),
	MASTERCARD("Mastercard", 5, 16);

	private final String name;
	private final int firstDigit;
	private final int maxLenghth;

	BankNetwork(String name, int firstDigit, int maxLenghth) {
		this.name = name;
		this.firstDigit = firstDigit;
		this.maxLenghth = maxLenghth;
	}

	public String getName() {
		return name;
	}

	public int getFirstDigit() {
		return firstDigit;
	}

	public int getMaxLenghth() {
		return maxLenghth;
	}

	@Override
	public String toString() {
		return "BankNetwork{" +
				"name='" + name + '\'' +
				", firstDigit=" + firstDigit +
				", maxLenghth=" + maxLenghth +
				'}';
	}
}
