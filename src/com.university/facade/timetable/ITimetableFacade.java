/**
 * @(#) ITimetableFacade.java
 */

package com.university.facade.timetable;

import com.university.repository.IPersonRepository;
import com.university.repository.ILectureRepository;
import com.university.domain.timetable.services.ITimetableGenerator;

public abstract class ITimetableFacade
{
	protected IPersonRepository personRepository;
	
	protected ILectureRepository lectureRepository;
	
	private ITimetableGenerator timetableGenerator;
	
	public abstract void addLecture( String name, int lecturerId );
	
	public String generateTimetable( )
	{
		return null;
	}
	
	
}
