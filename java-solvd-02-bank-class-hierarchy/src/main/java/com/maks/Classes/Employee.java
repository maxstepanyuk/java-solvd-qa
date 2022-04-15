package com.maks.Classes;

import com.maks.Enum.Gender;
import com.maks.Enum.Position;
import com.maks.Interfaces.IEmployee;

import org.apache.log4j.Logger;

import java.time.LocalDate;

public final class Employee extends User implements IEmployee {

	private static final Logger LOGGER = Logger.getLogger(Employee.class);

	private LocalDate hireDate;
	private LocalDate fireDate;
	private float workHours;
	private Position position;

	public Employee(String name, String surname, Gender gender, LocalDate birthDate, String phone,
	                String email, String login, String password, String passwordReminder, LocalDate hireDate,
	                LocalDate fireDate, float workHours, Position position) {
		super(name, surname, gender, birthDate, phone, email, login, password, passwordReminder);
		this.hireDate = hireDate;
		this.fireDate = fireDate;
		this.workHours = workHours;
		this.position = position;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDate getFireDate() {
		return fireDate;
	}

	public void setFireDate(LocalDate fireDate) {
		this.fireDate = fireDate;
	}

	public float getWorkHours() {
		return workHours;
	}

	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"hireDate=" + hireDate +
				", fireDate=" + fireDate +
				", workHours=" + workHours +
				", position=" + position +
				"} " + super.toString();
	}

	public void takeVacation(){
		LOGGER.info("Employee " + getName() +  " vent on a vacation");
	}

	public void returnToWork(){
		LOGGER.info("Employee " + getName() +  " returned from vacation");
	}
}
