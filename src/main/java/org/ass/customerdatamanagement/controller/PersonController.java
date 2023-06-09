package org.ass.customerdatamanagement.controller;

import org.ass.customerdatamanagement.entity.Person;
import org.ass.customerdatamanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping(value = "/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return personService.save(person);
		
	}
}
