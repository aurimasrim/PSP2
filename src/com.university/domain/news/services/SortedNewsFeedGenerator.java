/**
 * @(#) SortedNewsFeedGenerator.java
 */

package com.university.domain.news.services;

import com.university.domain.news.entity.IPost;

import java.util.List;

public class SortedNewsFeedGenerator implements INewsFeedGenerator
{
	private IPostsSorter postsSorter;
	
	public List<IPost> generateNewsFeed(List<IPost> posts )
	{
		return null;
	}
	
	
}
