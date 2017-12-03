/**
 * @(#) ExerciseLectureFactory.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public class ExerciseLectureFactory implements ILectureFactory
{
	public ILectureTime createLectureTime( int weekDay, LocalTime startTime )
	{
		return new ExerciseLectureTime(weekDay, startTime);
	}
	
	public ILecture createLecture( String name, int group, String description, ILectureTime lectureTime )
	{
		return new ExerciseLecture(name, group, description, lectureTime);
	}
	
	
}
