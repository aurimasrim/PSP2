/**
 * @(#) ILectureTime.java
 */

package com.university.domain.timetable.entity;

public abstract class ILectureTime
{
	private int weekDay;
	
	private Time startTime;
	
	public abstract Time getEndTime( );
	
	
}
