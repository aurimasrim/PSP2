/**
 * @(#) Student.java
 */

package com.university.domain.people.entity;

public class Student extends IPerson
{
	public Student(String name, IPersonContacts contacts)
	{
		super(name, contacts);
	}

	public boolean canTeach( )
	{
		return false;
	}
}
