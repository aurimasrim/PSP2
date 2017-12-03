/**
 * @(#) IPostRepository.java
 */

package com.university.repository;

import com.university.domain.news.entity.IPost;

import java.util.List;

public interface IPostRepository
{
	IPost find( int postId );

	void persist( IPost post );

	List<IPost> findAll( );


}
