package com.maks.Enum;

public enum Position {
    TELLER("Teller"),
    BANKER("Banker"),
    LOAN_PROCESSOR("Loan processor"),
    MORTGAGE_CONSULTANT("Mortgage consultant");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
