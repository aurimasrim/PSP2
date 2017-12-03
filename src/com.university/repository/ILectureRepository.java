/**
 * @(#) ILectureRepository.java
 */

package com.university.repository;

import com.university.domain.timetable.entity.ILecture;

public interface ILectureRepository
{
	ILecture find( int lectureId );
	
	void persist( ILecture lecture );
	
	ILecture findAll( );
	
	
}
