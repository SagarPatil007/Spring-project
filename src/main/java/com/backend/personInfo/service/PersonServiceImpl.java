package com.backend.personInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.personInfo.model.Person;

@Service
public class PersonServiceImpl implements PersonService{
List<Person> list;
	
	public PersonServiceImpl() {
		list = new ArrayList<>();
		list.add(new Person("Sagar Patil",22,17000,"23-11-2001","6355947852"));
		list.add(new Person("Bharat Patil",45,50000,"15-08-1978","9662216451"));
		list.add(new Person("Bhumika Patil",23,45000,"08-09-2000","7984576548"));
	}
	

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Person getPerson(long personAge) {
		Person p = null;
		
		for (Person person : list) {
			if(person.getAge() == personAge) {
				p = person;
				break;
			}
		}
		
		return p;
	}


	@Override
	public Person addPerson(Person person) {
		list.add(person);
		return person;
	}
}
