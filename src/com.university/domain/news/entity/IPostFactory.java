/**
 * @(#) IPostFactory.java
 */

package com.university.domain.news.entity;

import java.util.Date;

public interface IPostFactory
{
	IPost createPost( String title, IPostContent content );
	
	IPostContent createPostContent( String text, Date created );
	
	
}
