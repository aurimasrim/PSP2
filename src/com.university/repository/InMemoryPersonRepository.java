/**
 * @(#) InMemoryPersonRepository.java
 */

package com.university.repository;

import com.university.domain.people.entity.IPerson;
import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonRepository implements IPersonRepository
{
	private List<IPerson> personList;

	public InMemoryPersonRepository()
	{
		personList = new ArrayList<IPerson>();
	}
	
	public IPerson find( int personId )
	{
		try {
			return personList.get(personId);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
	}
	
	public List<IPerson> findAll( )
	{
		return personList;
	}
	
	public void persist( IPerson person )
	{
		personList.add(person);
	}
	
	
}
