package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
	}
	
	private Person mockPerson(int i) {
		logger.info("Finding all people...");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brasil " + 1);
		if (i%2 == 0)
			person.setGender("male");
		else
			person.setGender("female");
		
		return person;
	}


	public Person findById(String id) {
		logger.info("Finding one person...");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Renato");
		person.setLastName("Fonseca");
		person.setAddress("Osasco / SP - Brasil");
		person.setGender("male");
		return person;
	}
	
	public Person create(Person person) {
		logger.info("Creating one person...");
		
		
		return person;
	}
	
	public Person update(Person person) {
		logger.info("Updating one person...");
		
		
		return person;
	}
	
	public void delete(String id) {
		
		logger.info("Updating one person...");
		
		
		
	}
	
}
