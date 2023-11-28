package ru.netology.javadata_4_hibernate.service;

import ru.netology.javadata_4_hibernate.entity.Person;
import ru.netology.javadata_4_hibernate.repository.PersonRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);
    }
}
