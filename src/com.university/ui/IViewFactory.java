/**
 * @(#) IViewFactory.java
 */

package com.university.ui;

import com.university.domain.news.entity.IPost;

import java.util.List;

public interface IViewFactory
{
	NewsView createNewsView( List<IPost> posts );
	
	void createTimetableView( );
	
	void createStudentListView( );
	
	
}
