package com.university.injection;

import com.google.inject.AbstractModule;
import com.university.domain.news.entity.CreatedPostFactory;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.INewsFeedGenerator;
import com.university.domain.news.services.IPostsSorter;
import com.university.domain.news.services.SortedNewsFeedGenerator;
import com.university.domain.news.services.TitlePostsSorter;
import com.university.facade.news.INewsFacade;
import com.university.facade.news.SortedNewsFacade;
import com.university.repository.IPostRepository;
import com.university.facade.news.UnsortedNewsFacade;
import com.university.repository.PostRepository;
import com.university.ui.IViewFactory;
import com.university.ui.ViewFactory;

public class AppModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(IPostsSorter.class).to(TitlePostsSorter.class);
        bind(IPostFactory.class).to(CreatedPostFactory.class);
        bind(IViewFactory.class).to(ViewFactory.class);
        bind(IPostRepository.class).to(PostRepository.class);
        bind(INewsFeedGenerator.class).to(SortedNewsFeedGenerator.class);
        bind(INewsFacade.class).to(SortedNewsFacade.class);
    }
}
