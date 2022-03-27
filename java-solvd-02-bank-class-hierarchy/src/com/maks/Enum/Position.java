package com.maks.Enum;

public enum Position {
    TELLER("Teller", 14, "helps members cash checks, withdraw money, move transactions " +
            "to different accounts, create checking and savings accounts, and provide checks to customers"),
    BANKER("Banker", 20, "meeting with bank members (both individuals or companies) " +
            "and helping them acquire loans through the bank"),
    LOAN_PROCESSOR("Loan processor", 24, "review loan applications and approve or deny " +
            "applicants for the loans they apply for."),
    MORTGAGE_CONSULTANT("Mortgage consultant", 26.5, "help companies or individuals " +
            "identify their mortgage needs, assess their financial history and determine the type of mortgage they could afford"),
    INVESTMENT_REPRESENTATIVE("", 28.8, "provide clients with financial advice regarding " +
            "investments, typically for a fee.");

    private String position;
    private double dollarsPerHour;
    private String responsibilities;

    Position(String position, double dollarsPerHour, String responsibilities) {
        this.position = position;
        this.dollarsPerHour = dollarsPerHour;
        this.responsibilities = responsibilities;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getDollarsPerHour() {
        return dollarsPerHour;
    }

    public void setDollarsPerHour(double dollarsPerHour) {
        this.dollarsPerHour = dollarsPerHour;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    @Override
    public String toString() {
        return "Position{" +
                "position='" + position + '\'' +
                ", dollarsPerHour=" + dollarsPerHour +
                ", responsibilities='" + responsibilities + '\'' +
                '}';
    }
}
