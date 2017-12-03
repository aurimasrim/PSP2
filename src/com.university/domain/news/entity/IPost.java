/**
 * @(#) IPost.java
 */

package com.university.domain.news.entity;

public abstract class IPost
{
	private String title;
	private IPostContent content;

	public IPost(String title, IPostContent content)
	{
		this.title = title;
		this.content = content;
	}

	public String getTitle()
	{
		return title;
	}

	public IPostContent getContent()
	{
		return content;
	}

	public abstract boolean isGenerated( );
	
	
}
