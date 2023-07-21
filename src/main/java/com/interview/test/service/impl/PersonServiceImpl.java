package com.interview.test.service.impl;

import com.interview.test.model.Employee;
import com.interview.test.model.Person;
import com.interview.test.repository.PersonRepository;
import com.interview.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;


    @Override
    @Transactional
    public Person createPersonDetailes(Person person) {
        return personRepository.save(person);
    }

    @Override
    @Transactional
    public Person updatePersonDetailes(Person person) {
        return personRepository.save(person);
    }

    @Override
    @Transactional
    public Person getPersonDetailes(Long personId) {
        Optional<Person> optionalPerson = personRepository.findById(personId);
        if (optionalPerson.isPresent()) {
            return optionalPerson.get();
        }
        return null;
    }

    @Override
    @Transactional
    public void deletePersonDetailes(Long personId) {
      personRepository.deleteById(personId);


    }

    @Override
    public List<Person> getAllPersonDetailes() {
        return personRepository.findAll();
    }
}
