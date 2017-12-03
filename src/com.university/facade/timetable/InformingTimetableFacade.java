/**
 * @(#) InformingTimetableFacade.java
 */

package com.university.facade.timetable;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.people.entity.IPerson;
import com.university.domain.timetable.entity.ILecture;
import com.university.domain.timetable.entity.ILectureFactory;
import com.university.domain.timetable.services.ITimetableGenerator;
import com.university.repository.ILectureRepository;
import com.university.repository.IPersonRepository;
import com.university.repository.IPostRepository;

import java.time.LocalTime;

public class InformingTimetableFacade extends ITimetableFacade
{
	private IPostRepository postRepository;
	private IPostFactory postFactory;

	@Inject
	public InformingTimetableFacade(IPersonRepository personRepository,
								 ILectureRepository lectureRepository,
								 ITimetableGenerator timetableGenerator,
								 ILectureFactory lectureFactory,
								 IPostRepository postRepository,
								 IPostFactory postFactory)
	{
		super(personRepository, lectureRepository, timetableGenerator, lectureFactory);
		this.postRepository = postRepository;
		this.postFactory = postFactory;
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
