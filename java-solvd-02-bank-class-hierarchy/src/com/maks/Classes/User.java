package com.maks.Classes;

import java.time.LocalDate;

public class User extends Human {

    private String phone;
    private String email;
    private String login;
    private String password;
    private String passwordReminder;

    public User() {
    }

    public User(String name, String surname, String gender, LocalDate birthDate,
                String phone, String email, String login, String password, String passwordReminder) {
        super(name, surname, gender, birthDate);
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.passwordReminder = passwordReminder;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordReminder() {
        return passwordReminder;
    }

    public void setPasswordReminder(String passwordReminder) {
        this.passwordReminder = passwordReminder;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", passwordReminder='" + passwordReminder + '\'' +
                '}';
    }
}
