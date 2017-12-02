/**
 * @(#) INewsFeedGenerator.java
 */

package com.university.domain.news.services;

import com.university.domain.news.entity.IPost;

import java.util.List;

public interface INewsFeedGenerator
{
	List<IPost> generateNewsFeed(List<IPost> postList);
	
	
}
