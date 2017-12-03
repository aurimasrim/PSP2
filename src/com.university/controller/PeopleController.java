/**
 * @(#) PeopleController.java
 */

package com.university.controller;

import com.google.inject.Inject;
import com.university.facade.people.IPeopleFacade;

public class PeopleController
{
	private IPeopleFacade peopleFacade;

	@Inject
	public PeopleController(IPeopleFacade peopleFacade)
	{
		this.peopleFacade = peopleFacade;
	}

	public String getPeople( )
	{
		return null;
	}
	
	public void addPerson( String name, String email, String phone )
	{
		peopleFacade.addPerson(name, email, phone);
	}
	
	
}
