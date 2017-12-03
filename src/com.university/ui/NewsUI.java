/**
 * @(#) NewsUI.java
 */

package com.university.ui;

import com.google.inject.Inject;
import com.university.controller.NewsController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewsUI
{
	private NewsController newsController;
	private BufferedReader consoleReader;

	@Inject
	public NewsUI (NewsController newsController) {
		this.newsController = newsController;
		this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void showNews( )
	{
		String[] newsFeed = newsController.getNewsFeed();
		for (String post : newsFeed) {
			System.out.println(post);
		}
	}
	
	public void addNewsPost( ) throws IOException
	{
		System.out.println("Enter title:");
		String title = this.consoleReader.readLine();
		System.out.println("Enter text:");
		String text = this.consoleReader.readLine();

		newsController.addNewsPost(title, text);
		System.out.println("Successfully added");
	}
	
	
}
