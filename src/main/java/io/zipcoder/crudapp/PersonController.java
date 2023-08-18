package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class PersonController {

    private final PersonRepository personRepository;
    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(value="/people", method=POST)
    public Person createPerson(@RequestBody Person p) {
        return personRepository.save(p);
    }
    @RequestMapping(value="/people/{id}", method=GET)
    public Person getPerson(@PathVariable Long id) { //look in the path, id is there
        return personRepository.findById(id);
    }
    @RequestMapping(value="/people", method=GET)
    public List<Person> getPersonList() {
        return personRepository.findAll();
    }
    @RequestMapping(value="/people", method=PUT)
    public Person updatePerson(@RequestBody Person p) {
        return personRepository.save(p);
    }
    @RequestMapping(value="/people/{id}", method=DELETE)
    public void deletePerson(@PathVariable Long id) {
        Person personToDelete = personRepository.findById(id);
        personRepository.delete(personToDelete);
    }

    //./mvnw spring-boot:run
}
