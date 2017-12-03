/**
 * @(#) ILectureFactory.java
 */

package com.university.domain.timetable.entity;

public interface ILectureFactory
{
	ILectureTime createLecture( String name, int group, String description, ILectureTime lectureTime );
	
	ILectureTime createLectureTime( int weekDay, Time startTime );
	
	
}
