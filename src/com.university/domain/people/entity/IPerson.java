/**
 * @(#) IPerson.java
 */

package com.university.domain.people.entity;

public abstract class IPerson
{
	private String name;
	
	private IPersonContacts contacts;
	
	public boolean canTeach( )
	{
		return false;
	}
	
	
}
