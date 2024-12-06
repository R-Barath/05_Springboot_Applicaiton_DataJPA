package in.barath.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.barath.entity.Person;
import in.barath.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired // it is going to perform field injection
	private PersonRepository personRepository;

	public void getPersonSort() {
		Sort sort = Sort.by("age").descending(); // crud will not support for sorting where Jpa will support for sorting

		List<Person> getPersonSort = personRepository.findAll(sort);
		getPersonSort.forEach(System.out::println);
	}

	public void getPersonPagination() // pagination function for split the pages as per the record we need to retieve
										// in the list
	{
		int pageSize = 3, pageNo = 3;
		PageRequest.of(pageNo, pageSize);

		PageRequest of = PageRequest.of(pageNo - 1, pageSize);
		Page<Person> all = personRepository.findAll(of);
		List<Person> content = all.getContent();

		content.forEach(System.out::println);
	}

	public void getPerson() // retrieve all the methods
	{

		List<Person> getPerson = personRepository.findAll();
		getPerson.forEach(System.out::println);

	}

	public void savePerson() {

		Person person1 = new Person(1, "Barath", 26, "Male", "India");
		Person person2 = new Person(2, "Udit", 23, "Male", "India");
		Person person3 = new Person(3, "Anshuman", 25, "Male", "USA");
		Person person4 = new Person(4, "Raji", 27, "Male", "UAE");
		Person person5 = new Person(5, "Alphonse", 20, "Fe-Male", "EURO");
		Person person6 = new Person(6, "Mary", 22, "Fe-Male", "ARAB");
		Person person7 = new Person(7, "Juneed", 24, "Fe-Male", "Dubai");
		Person person8 = new Person(8, "Francy", 25, "Fe-Male", "India");

		List<Person> listOfPersons = Arrays.asList(person1, person2, person3, person4, person5, person6, person7,
				person8);
		personRepository.saveAll(listOfPersons);
	}
}
