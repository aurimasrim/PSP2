/**
 * @(#) TheoryLecture.java
 */

package com.university.domain.timetable.entity;

public class TheoryLecture extends ILecture
{
	public TheoryLecture(String name, int group, String description, ILectureTime lectureTime)
	{
		super(name, group, description, lectureTime);
	}

	public String getGroup( )
	{
		return group + " course";
	}
}
