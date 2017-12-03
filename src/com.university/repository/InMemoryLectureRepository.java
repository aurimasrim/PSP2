/**
 * @(#) InMemoryLectureRepository.java
 */

package com.university.repository;

import com.google.inject.Singleton;
import com.university.domain.timetable.entity.ILecture;

@Singleton
public class InMemoryLectureRepository implements ILectureRepository
{
	public void persist( ILecture lecture )
	{
		
	}
	
	public ILecture findAll( )
	{
		return null;
	}
	
	public ILecture find( int lectureId )
	{
		return null;
	}
	
	
}
