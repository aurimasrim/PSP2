/**
 * @(#) IPeopleFacade.java
 */

package com.university.facade.people;

import com.university.domain.people.entity.IPersonFactory;

public abstract class IPeopleFacade
{
	private IPersonFactory personFactory;
	
	public abstract void addPerson( String name, String email, String phone );
	
	public String generatePeopleList( )
	{
		return null;
	}
	
	
}
