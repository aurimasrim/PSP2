/**
 * @(#) NotifyingPeopleFacade.java
 */

package com.university.facade.people;

import com.university.domain.people.entity.IPersonFactory;
import com.university.integration.IEmailSender;
import com.university.repository.IPersonRepository;

public class NotifyingPeopleFacade extends IPeopleFacade
{
	private IEmailSender emailSender;

	public NotifyingPeopleFacade(IPersonFactory personFactory, IPersonRepository personRepository, IEmailSender emailSender)
	{
		super(personFactory, personRepository);
		this.emailSender = emailSender;
	}

	public void addPerson(String name, String email, String phone )
	{
		
	}
	
	
}
