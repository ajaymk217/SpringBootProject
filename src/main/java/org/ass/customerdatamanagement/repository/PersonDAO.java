package org.ass.customerdatamanagement.repository;

import org.ass.customerdatamanagement.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonDAO {

	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person) {
		return personRepository.save(person);
		
	}
	
}
