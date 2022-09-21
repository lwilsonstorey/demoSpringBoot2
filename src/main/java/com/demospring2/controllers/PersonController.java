package com.demospring2.controllers;

import com.demospring2.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("people")
public class PersonController {

    ArrayList<Person> people;

    PersonController() {
        this.people = new ArrayList<>();
    }

    @PostMapping("new")
    public void createPerson(@RequestParam String firstName, @RequestParam String lastName, @RequestParam byte age) {
        Person newPerson = new Person(firstName, lastName, age);
        people.add(newPerson);
    }

    @ResponseBody
    @GetMapping(value = "/all", produces = "application/json")
    public ArrayList<Person> getPeople() {
        return people;
    }


}
