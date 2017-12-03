/**
 * @(#) IPerson.java
 */

package com.university.domain.people.entity;

public abstract class IPerson
{
	private String name;
	private IPersonContacts contacts;

	public IPerson(String name, IPersonContacts contacts)
	{
		this.name = name;
		this.contacts = contacts;
	}

	public String getName()
	{
		return name;
	}

	public IPersonContacts getContacts()
	{
		return contacts;
	}

	public abstract boolean canTeach( );
}
