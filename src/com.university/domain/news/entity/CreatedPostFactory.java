/**
 * @(#) CreatedPostFactory.java
 */

package com.university.domain.news.entity;

import java.util.Date;

public class CreatedPostFactory implements IPostFactory
{
	public IPost createPost( String title, IPostContent content )
	{
		return new CreatedPost(title, content);
	}
	
	public IPostContent createPostContent( String text, Date created )
	{
		return new CreatedPostContent(text, created);
	}
	
}
