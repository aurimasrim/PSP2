/**
 * @(#) TimetableController.java
 */

package com.university.controller;

import com.google.inject.Inject;
import com.university.facade.timetable.ITimetableFacade;

import java.time.LocalTime;
import java.util.List;

public class TimetableController
{
	private ITimetableFacade timetableFacade;

	@Inject
	public TimetableController(ITimetableFacade timetableFacade)
	{
		this.timetableFacade = timetableFacade;
	}

	public List<List<String>> getTimetable( )
	{
		return this.timetableFacade.generateTimetable();
	}
	
	public void addLecture(String name, int group, String description, int weekDay, LocalTime startTime, int lecturerId ) throws Exception
	{
		this.timetableFacade.addLecture(name, group, description, weekDay, startTime, lecturerId);
	}
	
	
}
