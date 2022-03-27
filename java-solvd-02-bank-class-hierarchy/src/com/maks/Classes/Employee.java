package com.maks.Classes;

import com.maks.Classes.BankAccount;
import com.maks.Classes.Client;
import com.maks.Classes.User;
import com.maks.Enum.Position;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee extends User {

	private LocalDate hireDate;
	private LocalDate fireDate;
	private float workHours;
	private Position position;

	public Employee(String name, String surname, String gender, LocalDate birthDate, String phone, String email,
	                String login, String password, String passwordReminder, LocalDate hireDate, LocalDate fireDate,
	                float workHours, Position position) {
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
		return "Employee{" + "name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", gender='" + gender + '\'' +
				", birthDate=" + birthDate +
				", hireDate=" + hireDate +
				", fireDate=" + fireDate +
				", workHours=" + workHours +
				", position=" + position +
				'}';
	}
}
