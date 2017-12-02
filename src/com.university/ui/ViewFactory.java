/**
 * @(#) ViewFactory.java
 */

package com.university.ui;

import com.university.domain.news.entity.IPost;

import java.util.List;

public class ViewFactory implements IViewFactory
{
	public NewsView createNewsView( List<IPost> newsFeed )
	{
		return new NewsView(newsFeed);
	}
	
	public void createTimetableView( )
	{
		
	}
	
	public void createStudentListView( )
	{
		
	}
	
	
}
