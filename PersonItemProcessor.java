package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.infrastructure.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.CommandService;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
    
	@Autowired
	CommandService myservice;
	
	
	@Override
	public Person process(final Person person) {
		final String firstName = person.firstName().toUpperCase();
		final String lastName = person.lastName().toUpperCase();

		final Person transformedPerson = new Person(firstName, lastName);

		log.info("Converting ({}) into ({})", person, transformedPerson);

		myservice.display01();
		
		return transformedPerson;
	}

}
