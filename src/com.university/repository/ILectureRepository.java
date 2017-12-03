/**
 * @(#) ILectureRepository.java
 */

package com.university.repository;

import com.university.domain.timetable.entity.ILecture;

import java.util.List;

public interface ILectureRepository
{
	ILecture find( int lectureId );
	
	void persist( ILecture lecture );
	
	List<ILecture> findAll( );
}
