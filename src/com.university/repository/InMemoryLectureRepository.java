/**
 * @(#) InMemoryLectureRepository.java
 */

package com.university.repository;

import com.google.inject.Singleton;
import com.university.domain.timetable.entity.ILecture;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class InMemoryLectureRepository implements ILectureRepository
{
	private List<ILecture> lectureList;

	public InMemoryLectureRepository()
	{
		this.lectureList = new ArrayList<ILecture>();
	}

	public void persist(ILecture lecture )
	{
		this.lectureList.add(lecture);
	}
	
	public List<ILecture> findAll( )
	{
		return lectureList;
	}
	
	public ILecture find( int lectureId )
	{
		return null;
	}
	
	
}
