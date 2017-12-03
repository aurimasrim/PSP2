/**
 * @(#) ILecture.java
 */

package com.university.domain.timetable.entity;

public abstract class ILecture
{
	private String name;
	
	protected int group;
	
	private String description;

	private ILectureTime lectureTime;

	public ILecture(String name, int group, String description, ILectureTime lectureTime)
	{
		this.name = name;
		this.lectureTime = lectureTime;
		this.group = group;
		this.description = description;
	}

	public String getName()
	{
		return name;
	}

	public ILectureTime getLectureTime()
	{
		return lectureTime;
	}

	public String getDescription()
	{
		return description;
	}

	public abstract String getGroup( );
	
	
}
