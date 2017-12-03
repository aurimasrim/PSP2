/**
 * @(#) INewsFacade.java
 */

package com.university.facade.news;

import com.university.domain.news.entity.IPostFactory;

import java.util.Date;
import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.repository.IPostRepository;

public abstract class INewsFacade
{
	protected IPostRepository postRepository;
	private IPostFactory postFactory;

	@Inject
	public INewsFacade(IPostRepository postRepository, IPostFactory postFactory)
	{
		this.postRepository = postRepository;
		this.postFactory = postFactory;
	}

	public abstract String[] generateNewsFeed( );
	
	public void addPost(String title, String text)
	{
		IPost post = postFactory.createPost(title, postFactory.createPostContent(text, new Date()));
		this.postRepository.persist(post);
	}
}
