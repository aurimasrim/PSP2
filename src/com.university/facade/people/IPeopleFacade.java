/**
 * @(#) IPeopleFacade.java
 */

package com.university.facade.people;

import com.google.inject.Inject;
import com.university.domain.people.entity.IPersonFactory;
import com.university.repository.IPersonRepository;

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
	
	public String generatePeopleList( )
	{
		return null;
	}
	
	
}
