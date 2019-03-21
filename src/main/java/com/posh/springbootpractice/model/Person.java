package com.posh.springbootpractice.model;
import com.posh.springbootpractice.model.Address;

import java.time.LocalDate;

public class Person {
    private String personName;
    private Integer personAge;
    private Address personAddress;
    private LocalDate personBirthday;

    public LocalDate getPersonBirthday() {
        return personBirthday;
    }

    public void setPersonBirthday(LocalDate personBirthday) {
        this.personBirthday = personBirthday;
    }

    public Person(String personName, Integer personAge, Address personAddress, LocalDate personBirthday) {
        this.personName = personName;
        this.personAge = personAge;
        this.personAddress = personAddress;
        this.personBirthday = personBirthday;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }
}
