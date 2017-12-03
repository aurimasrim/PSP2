/**
 * @(#) TimetableUI.java
 */

package com.university.ui;

import com.google.inject.Inject;
import com.university.controller.TimetableController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TimetableUI
{
	private TimetableController timetableController;
	private BufferedReader consoleReader;

	@Inject
	public TimetableUI(TimetableController timetableController)
	{
		this.timetableController = timetableController;
		this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public void showTimetable( )
	{
		String[] timetable = this.timetableController.getTimetable();
		for (String lecture : timetable) {
			System.out.println(lecture);
		}
	}
	
	public void addLecture( ) throws IOException
	{
		try {
			System.out.println("Enter title:");
			String title = this.consoleReader.readLine();
			System.out.println("Enter group number:");
			int groupNumber = Integer.parseInt(this.consoleReader.readLine());
			System.out.println("Enter description:");
			String description = this.consoleReader.readLine();
			System.out.println("Enter week day:");
			int weekDay = Integer.parseInt(this.consoleReader.readLine());
			System.out.println("Enter start time:");
			LocalTime startTime = LocalTime.parse(this.consoleReader.readLine());
			System.out.println("Enter lecturer id:");
			int lecturerId = Integer.parseInt(this.consoleReader.readLine());
			timetableController.addLecture(title, groupNumber, description, weekDay, startTime, lecturerId);
			System.out.println("Successfully added\n");
		} catch (NumberFormatException ex) {
			System.out.println("Not a number\n");
		} catch(DateTimeParseException ex) {
			System.out.println("Bad time format\n");
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + '\n');
		}
	}
	
	
}
