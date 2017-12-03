/**
 * @(#) ITimetableGenerator.java
 */

package com.university.domain.timetable.services;

import com.university.domain.timetable.entity.ILecture;

public interface ITimetableGenerator
{
	String generateTimetable( ILecture lectures );
	
	
}
