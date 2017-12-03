/**
 * @(#) CreatedPost.java
 */

package com.university.domain.news.entity;

public class CreatedPost extends IPost
{
    public CreatedPost(String title, IPostContent content)
    {
        super(title, content);
    }

	public boolean isGenerated( )
	{
		return false;
	}
	
	
}
