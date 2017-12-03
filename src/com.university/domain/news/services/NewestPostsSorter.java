/**
 * @(#) NewestPostsSorter.java
 */

package com.university.domain.news.services;

import com.university.domain.news.entity.IPost;

import java.util.Comparator;
import java.util.List;

public class NewestPostsSorter implements IPostsSorter
{
	public void sort( List<IPost> postList )
	{
		postList.sort(Comparator.comparing(post -> post.getContent().getCreated()));
	}
}