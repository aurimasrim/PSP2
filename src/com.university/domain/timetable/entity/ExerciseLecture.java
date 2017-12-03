/**
 * @(#) ExerciseLecture.java
 */

package com.university.domain.timetable.entity;

import javax.swing.text.html.parser.Entity;

public class ExerciseLecture extends ILecture
{
	public ExerciseLecture(String name, int group, String description, ILectureTime lectureTime)
	{
		super(name, group, description, lectureTime);
	}

	public String getGroup( )
	{
		return group + " group";
	}
}
