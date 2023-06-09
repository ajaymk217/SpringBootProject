package org.ass.customerdatamanagement.repository;

import org.ass.customerdatamanagement.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer>{
	

}
