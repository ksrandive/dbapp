package com.dbapp.controller;

import com.dbapp.model.Person;
import com.dbapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        try {
            return personRepository.save(person);
        } catch (Exception e) {
            return null;
        }
    }


    @GetMapping("/ok")
    public String health() {
        try {
            return "ok";
        } catch (Exception e) {
            return null;
        }
    }
}
