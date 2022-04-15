package com.maks.Classes;

import com.maks.Enum.Gender;

import org.apache.log4j.Logger;

import java.time.LocalDate;

public abstract class Human {

    private static final Logger LOGGER = Logger.getLogger(Human.class);

    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDate;

    public Human() {}

    public Human(String name, String surname, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                '}';
    }
}
