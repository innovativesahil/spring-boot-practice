package com.posh.springbootpractice;

import com.posh.springbootpractice.com.posh.springbootpractice.FakeDataProvider;
import com.posh.springbootpractice.model.Address;
import com.posh.springbootpractice.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "I love you Sahil";
    }

    @RequestMapping("/person")
    public Person person(){
        Address address = new Address("Ward No 10", "Srinagar","India", 190001);
        Person person = new Person("Sahil Verma", 23, address, LocalDate.now().minusYears(24));
        return  person;
    }

    @RequestMapping("/persons")
    public List<Person> getAllPersons(){
        FakeDataProvider dataProvider = new FakeDataProvider();
        return dataProvider.getPersons();
    }
}
