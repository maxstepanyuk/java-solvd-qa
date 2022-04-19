package com.maks.Classes;

import org.apache.log4j.Logger;

public final class Atm {

	private static final Logger LOGGER = Logger.getLogger(Atm.class);

	private Employee responsibleEmployee;
	private Address address;

	public Atm() {
	}

	public Atm(Employee responsibleEmployee, Address address) {
		this.responsibleEmployee = responsibleEmployee;
		this.address = address;
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

	@Override
	public String toString() {
		return "Atm{" +
				"responsibleEmployee=" + responsibleEmployee +
				", address=" + address +
				'}';
	}
}
