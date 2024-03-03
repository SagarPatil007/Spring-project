package com.backend.personInfo.service;

import java.util.List;

import com.backend.personInfo.model.Person;

public interface PersonService {

	public List<Person> getAllPerson();
	
	public Person getPerson(long personAges);
	
	public Person addPerson(Person person);
}
