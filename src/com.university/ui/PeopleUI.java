/**
 * @(#) PeopleUI.java
 */

package com.university.ui;

import com.google.inject.Inject;
import com.university.controller.PeopleController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeopleUI
{
	private PeopleController peopleController;
	private BufferedReader consoleReader;

	@Inject
	public PeopleUI(PeopleController peopleController)
	{
		this.peopleController = peopleController;
		this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public void addPerson( ) throws IOException
	{
		System.out.println("Enter name:");
		String name = this.consoleReader.readLine();
		System.out.println("Enter email:");
		String email = this.consoleReader.readLine();
		System.out.println("Enter phone number:");
		String phone = this.consoleReader.readLine();
		peopleController.addPerson(name, email, phone);
		System.out.println("Successfully added");
	}
	
	public void listPeople( )
	{
		String[] peopleList = peopleController.getPeople();
		for (String person : peopleList) {
			System.out.println(person);
		}
	}
	
	
}
