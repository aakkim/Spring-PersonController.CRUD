package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();

    Person findById(Long id);

    Person save(Person p);

    void delete(Person p);

}
