/**
 * @(#) ILecture.java
 */

package com.university.domain.timetable.entity;

public abstract class ILecture
{
	private String name;
	
	private ILectureTime lectureTime;
	
	private int group;
	
	private String description;
	
	public abstract String getGroup( );
	
	
}
