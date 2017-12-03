/**
 * @(#) NewsController.java
 */

package com.university.controller;

import com.google.inject.Inject;
import com.university.facade.news.INewsFacade;

public class NewsController
{
	private INewsFacade newsFacade;

	@Inject
	public NewsController(INewsFacade newsFacade)
	{
		this.newsFacade = newsFacade;
	}

	public String[] getNewsFeed( )
	{
		return newsFacade.generateNewsFeed();
	}
	
	public void addNewsPost( String title, String text )
	{
		newsFacade.addPost(title, text);
	}
	
	
}
