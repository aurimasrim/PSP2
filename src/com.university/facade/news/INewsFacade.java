/**
 * @(#) INewsFacade.java
 */

package com.university.facade.news;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.INewsFeedGenerator;
import com.university.domain.news.entity.IPost;
import com.university.repository.IPostRepository;

import java.util.Date;
import java.util.List;

public abstract class INewsFacade
{
	protected IPostRepository postRepository;
	protected IPostFactory postFactory;

	@Inject
	public INewsFacade(IPostRepository postRepository, IPostFactory postFactory)
	{
		this.postRepository = postRepository;
		this.postFactory = postFactory;
	}

	public abstract List<IPost> generateNewsFeed( );
	
	public void addPost(String title, String text)
	{
		IPost post = postFactory.createPost(title, postFactory.createPostContent(text, new Date()));
		this.postRepository.persist(post);
	}
	
	
}
