/**
 * @(#) ITimetableGenerator.java
 */

package com.university.domain.timetable.services;

import com.university.domain.timetable.entity.ILecture;

import java.util.ArrayList;
import java.util.List;

public interface ITimetableGenerator
{
	ArrayList<List<String>> generateTimetable(List<ILecture> lectures );
}
