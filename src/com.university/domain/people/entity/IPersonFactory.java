/**
 * @(#) IPersonFactory.java
 */

package com.university.domain.people.entity;

public interface IPersonFactory
{
	IPerson createPerson( String name );
	
	IPersonContacts createPersonContacts( String email, String phone );
	
	
}
