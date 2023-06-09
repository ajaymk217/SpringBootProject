package org.ass.customerdatamanagement.service;

import org.ass.customerdatamanagement.entity.Person;
import org.ass.customerdatamanagement.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	public Person save(Person person) {
		return personDAO.save(person);
	}
}
