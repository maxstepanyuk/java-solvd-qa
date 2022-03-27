package com.maks.Classes;

import java.util.ArrayList;

public class BankBranch {

    private Address address;
    private String phone;
    private ArrayList<Employee> employeeList;

    public BankBranch() {
    }

    public BankBranch(Address address, String phone, ArrayList<Employee> employeeList) {
        this.address = address;
        this.phone = phone;
        this.employeeList = employeeList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BankBranch{");
        sb.append("address=").append(address);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", employeeList=").append(employeeList);
        sb.append('}');
        return sb.toString();
    }
}
