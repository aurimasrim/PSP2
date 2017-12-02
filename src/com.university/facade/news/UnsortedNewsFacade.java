/**
 * @(#) UnsortedNewsFacade.java
 */

package com.university.facade.news;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.INewsFeedGenerator;
import com.university.repository.IPostRepository;

import java.util.List;

public class UnsortedNewsFacade extends INewsFacade
{
	@Inject
	public UnsortedNewsFacade(IPostRepository postRepository, IPostFactory postFactory)
	{
		super(postRepository, postFactory);
	}
	public List<IPost> generateNewsFeed( )
	{
		return postRepository.findAll();
	}
	
	
}
