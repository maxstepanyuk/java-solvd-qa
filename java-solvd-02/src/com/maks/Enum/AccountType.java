package com.maks.Enum;

public enum AccountType {
    SAVINGS("Savings"),
    CHECKING("Checking"),
    MONEY_MARKET("Money market"),
    CERTIFICATES_OF_DEPOSIT("Certificates of deposit"),
    RETIREMENT("Retirement");

    private final String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
