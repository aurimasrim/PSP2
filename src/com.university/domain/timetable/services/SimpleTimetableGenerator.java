/**
 * @(#) SimpleTimetableGenerator.java
 */

package com.university.domain.timetable.services;

import com.university.domain.timetable.entity.ILecture;

import java.util.ArrayList;
import java.util.List;

public class SimpleTimetableGenerator implements ITimetableGenerator
{
	public ArrayList<List<String>> generateTimetable(List<ILecture> lectures )
	{
		ArrayList<List<String>> timetable = new ArrayList<List<String>>();

		for (int i = 0; i < 5; i++) {
			List<String> list = new ArrayList<String>();
			timetable.add(list);
			for (ILecture lecture : lectures) {
				if (lecture.getLectureTime().getWeekDay() == i + 1) {
					String row = lecture.getName() + " "
							+ lecture.getGroup() + " "
							+ lecture.getLectureTime().getStartTime() + "-"
							+ lecture.getLectureTime().getEndTime();
					list.add(row);
				}
			}
		}
		return timetable;
	}
	
	
}
