/**
 * @(#) SortedNewsFacade.java
 */

package com.university.facade.news;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.IPostsSorter;
import com.university.repository.IPostRepository;

import java.util.List;

public class SortedNewsFacade extends INewsFacade
{
	private IPostsSorter postsSorter;

	@Inject
	public SortedNewsFacade(IPostsSorter postsSorter, IPostRepository postRepository, IPostFactory postFactory)
	{
		super(postRepository, postFactory);
		this.postsSorter = postsSorter;
	}

	public List<IPost> generateNewsFeed( )
	{
		List<IPost> postList = postRepository.findAll();
		postsSorter.sort(postList);
		return postList;
	}


}
