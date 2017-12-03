/**
 * @(#) ITimetableFacade.java
 */

package com.university.facade.timetable;

import com.university.domain.timetable.entity.ILecture;
import com.university.domain.timetable.entity.ILectureFactory;
import com.university.repository.IPersonRepository;
import com.university.repository.ILectureRepository;
import com.university.domain.timetable.services.ITimetableGenerator;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class ITimetableFacade
{
	protected IPersonRepository personRepository;
	
	protected ILectureRepository lectureRepository;

	protected ILectureFactory lectureFactory;
	
	private ITimetableGenerator timetableGenerator;

	public ITimetableFacade(IPersonRepository personRepository,
							ILectureRepository lectureRepository,
							ITimetableGenerator timetableGenerator,
							ILectureFactory lectureFactory)
	{
		this.personRepository = personRepository;
		this.lectureRepository = lectureRepository;
		this.timetableGenerator = timetableGenerator;
		this.lectureFactory = lectureFactory;
	}

	public abstract void addLecture(String name, int group, String description, int weekday, LocalTime startTime, int lecturerId) throws Exception;
	
	public List<List<String>> generateTimetable( )
	{
		List<ILecture> lectures = lectureRepository.findAll();
		return this.timetableGenerator.generateTimetable(lectures);
	}
	
	
}
