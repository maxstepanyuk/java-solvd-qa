package com.maks.Classes;

public class Atm {
    private Employee responsibleEmployee;
    private Address address;
    private boolean iaAdressOfAjesindBuilding;

    public Atm() {
    }

    public Atm(Employee responsibleEmployee, Address address, boolean adressOfAjesindBuilding) {
        this.responsibleEmployee = responsibleEmployee;
        this.address = address;
        this.iaAdressOfAjesindBuilding = adressOfAjesindBuilding;
    }

    public Employee getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(Employee responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isIaAdressOfAjesindBuilding() {
        return iaAdressOfAjesindBuilding;
    }

    public void setIaAdressOfAjesindBuilding(boolean iaAdressOfAjesindBuilding) {
        this.iaAdressOfAjesindBuilding = iaAdressOfAjesindBuilding;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "responsibleEmployee=" + responsibleEmployee +
                ", address=" + address +
                ", adressOfAjesindBuilding=" + iaAdressOfAjesindBuilding +
                '}';
    }
}
