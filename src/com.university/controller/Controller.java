/**
 * @(#) Controller.java
 */

package com.university.controller;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.facade.news.INewsFacade;
import com.university.ui.IViewFactory;
import com.university.ui.NewsView;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Controller
{
	private BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	private INewsFacade newsFacade;
	private IViewFactory viewFactory;

	@Inject
	public Controller(INewsFacade newsFacade, IViewFactory viewFactory)
	{
		this.newsFacade = newsFacade;
		this.viewFactory = viewFactory;
	}

	public boolean showMenu( ) throws IOException
	{
		System.out.println("1. Show news\n" +
				"2. Add news post\n" +
				"0. Exit\n");

		String option = consoleReader.readLine();

		switch (option) {
			case "1":
				showNews();
				break;
			case "2":
				addNewsPost();
				break;
			case "3":

			case "4":

			case "0":
				return false;
			default:
				System.out.println("No such command: " + option);
		}

		return true;
	}
	
	private void showNews( )
	{
		List<IPost> newsFeed = newsFacade.generateNewsFeed();
		NewsView newsView = viewFactory.createNewsView(newsFeed);
		newsView.showNews();
	}
	
	private void addNewsPost( ) throws IOException
	{
		System.out.println("Enter title:");
		String title = consoleReader.readLine();
		System.out.println("Enter text:");
		String text = consoleReader.readLine();

		newsFacade.addPost(title, text);
		System.out.println("Successfully added");
	}
	
	private void showTimetable( )
	{
		
	}
	
	private void addSubject( )
	{
		
	}
	
	private void addStudent( )
	{
		
	}
	
	private void listStudents( )
	{
		
	}
	
	
}
