package com.interview.test.controller;

import com.interview.test.model.Person;
import com.interview.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonControllerOneToOne {

    @Autowired
    private PersonService personService;
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/Person")
    public ResponseEntity<Person> createPersonDetailes(@RequestBody Person person) {
        return new ResponseEntity<>(personService.createPersonDetailes(person), HttpStatus.CREATED);
    }
    @PutMapping(consumes = "application/json", produces = "application/json", path = "/Person")
    public ResponseEntity<Person> updatePersonDetailes(@RequestBody Person person) {
        return new ResponseEntity<>(personService.updatePersonDetailes(person), HttpStatus.CREATED);
    }
    @DeleteMapping(produces = "application/json", path = "/Person/{personId}")
    public ResponseEntity<String> deletePersonDetailes(@PathVariable(name = "personId") Long personId) {
        personService.deletePersonDetailes(personId);
        return new ResponseEntity<>("Person with PersonId : " + personId + " deleted successfully", HttpStatus.OK);
    }
    @GetMapping(path = "/Person/{personId}", produces = "application/json")
    public ResponseEntity<Person> getPersonDetailes(@PathVariable(name = "personId") Long personId) {
        return new ResponseEntity<>(personService.getPersonDetailes(personId), HttpStatus.OK);
    }
    @GetMapping(path = "/Persons", produces = "application/json")
    public ResponseEntity<List<Person>> getAllPersonDetailes() {
        return new ResponseEntity<>(personService.getAllPersonDetailes(), HttpStatus.OK);
    }
}
