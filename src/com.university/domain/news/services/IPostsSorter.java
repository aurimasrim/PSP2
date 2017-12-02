/**
 * @(#) IPostsSorter.java
 */

package com.university.domain.news.services;

import com.university.domain.news.entity.IPost;

import java.util.List;

public interface IPostsSorter
{
	void sort(List<IPost> posts );
}
