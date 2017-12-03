/**
 * @(#) NotifyingPeopleFacade.java
 */

package com.university.facade.people;

import com.google.inject.Inject;
import com.university.domain.people.entity.IPerson;
import com.university.domain.people.entity.IPersonFactory;
import com.university.integration.IEmailSender;
import com.university.repository.IPersonRepository;

public class NotifyingPeopleFacade extends IPeopleFacade
{
	private IEmailSender emailSender;

	@Inject
	public NotifyingPeopleFacade(IPersonFactory personFactory, IPersonRepository personRepository, IEmailSender emailSender)
	{
		super(personFactory, personRepository);
		this.emailSender = emailSender;
	}

	public void addPerson(String name, String email, String phone )
	{
		IPerson person = personFactory.createPerson(name, personFactory.createPersonContacts(email, phone));
		personRepository.persist(person);

		emailSender.send(email, "New account", "Welcome " + name);
	}
	
	
}
