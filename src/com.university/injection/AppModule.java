package com.university.injection;

import com.google.inject.AbstractModule;
import com.university.domain.news.entity.CreatedPostFactory;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.IPostsSorter;
import com.university.domain.news.services.TitlePostsSorter;
import com.university.facade.news.INewsFacade;
import com.university.facade.news.SortedNewsFacade;
import com.university.repository.IPostRepository;

public class AppModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(IPostsSorter.class).to(TitlePostsSorter.class);
        bind(IPostFactory.class).to(CreatedPostFactory.class);
        bind(IViewFactory.class).to(ViewFactory.class);
        bind(IPostRepository.class).to(PostRepository.class);
        bind(INewsFacade.class).to(SortedNewsFacade.class);
    }
}
