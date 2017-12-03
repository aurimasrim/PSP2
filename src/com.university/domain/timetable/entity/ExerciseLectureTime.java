/**
 * @(#) ExerciseLectureTime.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public class ExerciseLectureTime extends ILectureTime
{
	public ExerciseLectureTime(int weekDay, LocalTime startTime)
	{
		super(weekDay, startTime);
	}

	public LocalTime getEndTime( )
	{
		return getStartTime().plusMinutes(60);
	}
}
