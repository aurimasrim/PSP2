/**
 * @(#) IPeopleFacade.java
 */

package com.university.facade.people;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.domain.people.entity.IPerson;
import com.university.domain.people.entity.IPersonFactory;
import com.university.repository.IPersonRepository;

import java.util.List;

public abstract class IPeopleFacade
{
	protected IPersonFactory personFactory;
	protected IPersonRepository personRepository;

	@Inject
	public IPeopleFacade(IPersonFactory personFactory, IPersonRepository personRepository)
	{
		this.personFactory = personFactory;
		this.personRepository = personRepository;
	}

	public abstract void addPerson(String name, String email, String phone );
	
	public String[] generatePeopleList( )
	{
		List<IPerson> people = personRepository.findAll();
		String[] peopleArray = new String[people.size()];

		for (int i = 0; i < people.size(); i++)
		{
			IPerson person = people.get(i);
			peopleArray[i] = i + " "
					+ person.getName() + " "
					+ (person.canTeach() ? "Lecturer" : "Student") + " "
					+ person.getContacts().getEmail() + " "
					+ person.getContacts().getPhone() + '\n';
		}
		return peopleArray;
	}
	
	
}
