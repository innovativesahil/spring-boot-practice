package com.posh.springbootpractice;

import com.posh.springbootpractice.model.Address;
import com.posh.springbootpractice.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class FakeDataProvider {

    List<Person> getPersons() {

        List<Person> personList = new ArrayList<>();

        Address address1 = new Address("House No 10, Parihaspora", "Shopian", "India", 191111);
        Person person1 = new Person("Raqib", 24, address1, LocalDate.now().minusYears(24).minusMonths(5).minusDays(4));

        Address address2 = new Address("Ward No 2, Aalochi Bagh", "Samba", "India", 191104);
        Person person2 = new Person("Sahil", 24, address2, LocalDate.now().minusYears(23).minusMonths(3).minusDays(21));

        Address address3 = new Address("Khan Villa, Rajbagh", "Budgam", "India", 191121);
        Person person3 = new Person("Shazia", 24, address3, LocalDate.now().minusYears(26).minusMonths(7).minusDays(13));

        Address address4 = new Address("House No 1248, Ompora Colony", "Srinagar", "India", 191231);
        Person person4 = new Person("Umair", 24, address4, LocalDate.now().minusYears(29).minusMonths(1).minusDays(10));

        Address address5 = new Address("Garden House, Airport Road", "Baramullah", "India", 194121);
        Person person5 = new Person("Basit", 24, address5, LocalDate.now().minusYears(21).minusMonths(10).minusDays(22));

        Address address6 = new Address("Village Pokharpora", "Ladakh", "India", 191100);
        Person person6 = new Person("Refath", 24, address6, LocalDate.now().minusYears(27).minusMonths(2).minusDays(9));

        Address address7 = new Address("Special Ward, Hiranagar", "Poonch", "India", 192312);
        Person person7 = new Person("Baiza", 24, address7, LocalDate.now().minusYears(25).minusMonths(9).minusDays(17));

        Address address8 = new Address("Village Khan Sahib", "Rajauri", "India", 193312);
        Person person8 = new Person("Sadaf", 24, address8, LocalDate.now().minusYears(23).minusMonths(3).minusDays(26));

        Address address9 = new Address("Village Beerwah", "Udhampur", "India", 190124);
        Person person9 = new Person("Maryam", 24, address9, LocalDate.now().minusYears(24).minusMonths(5).minusDays(23));

        Address address10 = new Address("Village Wakoora", "Ganderbal", "India", 190193);
        Person person10 = new Person("Zahoor", 24, address10, LocalDate.now().minusYears(25).minusMonths(1).minusDays(14));

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        return personList;
    }
}
