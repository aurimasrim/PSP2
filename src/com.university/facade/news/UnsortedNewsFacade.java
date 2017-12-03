/**
 * @(#) UnsortedNewsFacade.java
 */

package com.university.facade.news;

import com.google.inject.Inject;
import com.university.domain.news.entity.IPost;
import com.university.domain.news.entity.IPostFactory;
import com.university.repository.IPostRepository;

import java.util.List;

public class UnsortedNewsFacade extends INewsFacade
{
	@Inject
	public UnsortedNewsFacade(IPostRepository postRepository, IPostFactory postFactory)
	{
		super(postRepository, postFactory);
	}

	public String[] generateNewsFeed( )
	{
		List<IPost> postList = postRepository.findAll();
		String[] newsFeed = new String[postList.size()];

		for (int i = 0; i < postList.size(); i++)
		{
			IPost post = postList.get(i);
			newsFeed[i] = post.getTitle() + '\n'
					+ post.getContent().getText() + '\n'
					+ post.getContent().getCreated() + '\n'
					+ (post.isGenerated() ? "*Generated automatically*" : "") + '\n';
		}

		return newsFeed;
	}


}
