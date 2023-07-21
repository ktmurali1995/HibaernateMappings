package com.interview.test.service;

import com.interview.test.model.Employee;
import com.interview.test.model.Person;

import java.util.List;

public interface PersonService {

    public Person createPersonDetailes(Person person);
    public Person updatePersonDetailes(Person person);
    public Person getPersonDetailes(Long personId);
    public void deletePersonDetailes(Long personId);
    public List<Person> getAllPersonDetailes();
}
