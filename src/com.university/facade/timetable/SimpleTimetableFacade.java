/**
 * @(#) SimpleTimetableFacade.java
 */

package com.university.facade.timetable;

import com.google.inject.Inject;
import com.university.domain.people.entity.IPerson;
import com.university.domain.timetable.entity.ILecture;
import com.university.domain.timetable.entity.ILectureFactory;
import com.university.domain.timetable.services.ITimetableGenerator;
import com.university.repository.ILectureRepository;
import com.university.repository.IPersonRepository;

import java.time.LocalTime;

public class SimpleTimetableFacade extends ITimetableFacade
{
	@Inject
	public SimpleTimetableFacade(IPersonRepository personRepository,
								 ILectureRepository lectureRepository,
								 ITimetableGenerator timetableGenerator,
								 ILectureFactory lectureFactory)
	{
		super(personRepository, lectureRepository, timetableGenerator, lectureFactory);
	}

	public void addLecture(String name, int group, String description, int weekday, LocalTime startTime, int lecturerId) throws Exception
	{
		IPerson person = this.personRepository.find(lecturerId);

		if (person == null) {
			throw new Exception("Person with id " + lecturerId + " not found");
		}

		if (!person.canTeach()) {
			throw new Exception("Person with id " + lecturerId + " is not a lecturer");
		}
		ILecture lecture = this.lectureFactory.createLecture(name, group, description, lectureFactory.createLectureTime(weekday, startTime));
		this.lectureRepository.persist(lecture);
	}
	
}
