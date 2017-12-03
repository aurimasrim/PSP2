/**
 * @(#) IPersonContacts.java
 */

package com.university.domain.people.entity;

public abstract class IPersonContacts
{
	private String email;
	private String phone;

	public IPersonContacts(String email, String phone)
	{
		this.email = email;
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPhone()
	{
		return phone;
	}
}
