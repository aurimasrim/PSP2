/**
 * @(#) IPostContent.java
 */

package com.university.domain.news.entity;

import java.util.Date;

public abstract class IPostContent
{
	private Date created;
	private String text;

	public IPostContent(String text, Date created)
	{
		this.text = text;
		this.created = created;
	}

	public String getText()
	{
		return text;
	}

	public Date getCreated()
	{
		return created;
	}
}
