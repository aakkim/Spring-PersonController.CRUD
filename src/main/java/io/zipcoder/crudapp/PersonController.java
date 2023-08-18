package io.zipcoder.crudapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class PersonController {
    @RequestMapping(value="/people", method=POST)
    public Person createPerson(@RequestBody Person p) {
        return p;
    }
    @RequestMapping(value="/people/{id}", method=GET)
    public Person getPerson(@PathVariable int id) { //look in the path, id is there
        return new Person("", "", 1L);
    }
    @RequestMapping(value="/people", method=GET)
    public List<Person> getPersonList() {
        return new ArrayList<>();
    }
    @RequestMapping(value="/people", method=PUT)
    public Person updatePerson(@RequestBody Person p) {
        return new Person("", "", 1L);
    }
    @RequestMapping(value="/people/{id}", method=DELETE)
    public void DeletePerson(@PathVariable int id) {

    }

    //./mvnw spring-boot:run
}
