/**
 * @(#) TheoryLectureTime.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public class TheoryLectureTime extends ILectureTime
{
	public TheoryLectureTime(int weekDay, LocalTime startTime)
	{
		super(weekDay, startTime);
	}

	public LocalTime getEndTime( )
	{
		return getStartTime().plusMinutes(90);
	}
}
