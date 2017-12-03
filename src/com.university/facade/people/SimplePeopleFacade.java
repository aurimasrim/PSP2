/**
 * @(#) SimplePeopleFacade.java
 */

package com.university.facade.people;

import com.google.inject.Inject;
import com.university.domain.people.entity.IPerson;
import com.university.domain.people.entity.IPersonFactory;
import com.university.repository.IPersonRepository;

public class SimplePeopleFacade extends IPeopleFacade
{
	@Inject
	public SimplePeopleFacade(IPersonFactory personFactory, IPersonRepository personRepository)
	{
		super(personFactory, personRepository);
	}

	public void addPerson(String name, String email, String phone )
	{
		IPerson person = personFactory.createPerson(name, personFactory.createPersonContacts(email, phone));
		personRepository.persist(person);
	}

}
