/**
 * @(#) NewsView.java
 */

package com.university.ui;

import com.university.domain.news.entity.IPost;

import java.util.List;

public class NewsView
{
	private List<IPost> newsFeed;

	public NewsView(List<IPost> newsFeed)
	{
		this.newsFeed = newsFeed;
	}

	public void showNews( )
	{
		for (IPost post : newsFeed) {
			System.out.println(
					post.getTitle() + '\n' + post.getContent().getText() + '\n' + post.getContent().getCreated() + '\n');
		}
	}
	
	
}
