/**
 * @(#) IPersonRepository.java
 */

package com.university.repository;

import com.university.domain.people.entity.IPerson;

public interface IPersonRepository
{
	IPerson find( int personId );
	
	void persist( IPerson person );
	
	IPerson findAll( );
	
	
}
