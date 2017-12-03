/**
 * @(#) IPersonRepository.java
 */

package com.university.repository;

import com.university.domain.people.entity.IPerson;

import java.util.List;

public interface IPersonRepository
{
	IPerson find( int personId );
	
	void persist( IPerson person );
	
	List<IPerson> findAll( );
	
	
}
