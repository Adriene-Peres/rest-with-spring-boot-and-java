package com.github.Adriene_Peres;

import com.github.Adriene_Peres.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Finding all People!");

        List<Person> people = new ArrayList<>();
        for (int i=0;i<8;i++){
            Person person = mockPerson(i);
            people.add(person);
        }
        return people;
    }

    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Adriene");
        person.setLastName("Peres");
        person.setAddress("Lavras - Minas Gerais - Brasil");
        person.setGender("Female");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one Person!");

        return person;
    }

    public Person update(Person person){
        logger.info("Updating one Person!");

        return person;
    }

    public void delete(String id){
        logger.info("Deleting one Person!");

    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Fistname " + i);
        person.setLastName("Lastname " + i);
        person.setAddress("Some address in Brazil");
        person.setGender("Female");
        return person;
    }

}
