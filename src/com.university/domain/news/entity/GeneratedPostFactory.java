/**
 * @(#) GeneratedPostFactory.java
 */

package com.university.domain.news.entity;

import java.util.Date;

public class GeneratedPostFactory implements IPostFactory
{
	public IPost createPost( String title, IPostContent content )
	{
		return new GeneratedPost(title, content);
	}
	
	public IPostContent createPostContent( String text, Date created )
	{
		return new GeneratedPostContent(text, created);
	}
}
