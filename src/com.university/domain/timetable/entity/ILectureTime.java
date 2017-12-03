/**
 * @(#) ILectureTime.java
 */

package com.university.domain.timetable.entity;

import java.time.LocalTime;

public abstract class ILectureTime
{
	private int weekDay;
	
	private LocalTime startTime;

	public ILectureTime(int weekDay, LocalTime startTime)
	{
		this.weekDay = weekDay;
		this.startTime = startTime;
	}

	public int getWeekDay()
	{
		return weekDay;
	}

	public LocalTime getStartTime()
	{
		return startTime;
	}

	public abstract LocalTime getEndTime();
}
