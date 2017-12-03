/**
 * @(#) GeneratedPost.java
 */

package com.university.domain.news.entity;

public class GeneratedPost extends IPost
{
    public GeneratedPost(String title, IPostContent content)
    {
        super(title, content);
    }

	public boolean isGenerated( )
	{
		return true;
	}
	
	
}
