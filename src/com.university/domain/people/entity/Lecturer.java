/**
 * @(#) Lecturer.java
 */

package com.university.domain.people.entity;

public class Lecturer extends IPerson
{
	public Lecturer(String name, IPersonContacts contacts)
	{
		super(name, contacts);
	}

	public boolean canTeach( )
	{
		return true;
	}
}
