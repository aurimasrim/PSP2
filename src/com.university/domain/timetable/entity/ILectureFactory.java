/**
 * @(#) ILectureFactory.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public interface ILectureFactory
{
	ILecture createLecture( String name, int group, String description, ILectureTime lectureTime );
	
	ILectureTime createLectureTime( int weekDay, LocalTime startTime );
	
	
}
