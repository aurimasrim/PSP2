/**
 * @(#) TheoryLectureFactory.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public class TheoryLectureFactory implements ILectureFactory
{
	public ILectureTime createLectureTime(int weekDay, LocalTime startTime)
	{
		return new TheoryLectureTime(weekDay, startTime);
	}
	
	public ILecture createLecture(String name, int group, String description, ILectureTime lectureTime)
	{
		return new TheoryLecture(name, group, description, lectureTime);
	}
}
