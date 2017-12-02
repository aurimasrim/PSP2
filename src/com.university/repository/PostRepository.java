/**
 * @(#) PostRepository.java
 */

package com.university.repository;

import com.university.domain.news.entity.IPost;

import java.util.ArrayList;
import java.util.List;

public class PostRepository implements IPostRepository
{
	private List<IPost> postList;

	public PostRepository()
	{
		postList = new ArrayList<IPost>();
	}
	
	public IPost find( int postId )
	{
		return null;
	}
	
	public void persist( IPost post )
	{
		postList.add(post);
	}
	
	public List<IPost> findAll( )
	{
		return postList;
	}
	
	
}
