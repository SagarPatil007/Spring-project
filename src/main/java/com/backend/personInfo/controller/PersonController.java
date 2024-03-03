package com.backend.personInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.personInfo.model.Person;
import com.backend.personInfo.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	public List<Person> person;
	
	@GetMapping("/getallpersons")
	public List<Person> getAllPersons(){
		return this.personService.getAllPerson();
	}
	
	@GetMapping("/getperson/{personAge}")
	public Person getPerson(@PathVariable String personAge) {
		return this.personService.getPerson(Long.parseLong(personAge));
	}
	
	@PostMapping("/addperson")
	public Person addPerosn(@RequestBody Person person) {
		return this.personService.addPerson(person);
	}
}
