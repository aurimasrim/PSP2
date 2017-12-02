/**
 * @(#) CreatedPostContent.java
 */

package com.university.domain.news.entity;

import java.util.Date;

public class CreatedPostContent extends IPostContent
{
	private String createdBy;

	public CreatedPostContent(String text, Date created, String createdBy)
	{
		super(text, created);
		this.createdBy = createdBy;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}
}
