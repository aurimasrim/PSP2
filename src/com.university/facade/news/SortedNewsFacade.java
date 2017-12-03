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

	public String[] generateNewsFeed( )
	{
		List<IPost> postList = postRepository.findAll();
		postsSorter.sort(postList);
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
