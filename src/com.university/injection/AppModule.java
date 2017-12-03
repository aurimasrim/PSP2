package com.university.injection;

import com.google.inject.AbstractModule;
import com.university.controller.NewsController;
import com.university.domain.news.entity.CreatedPostFactory;
import com.university.domain.news.entity.IPostFactory;
import com.university.domain.news.services.IPostsSorter;
import com.university.domain.news.services.TitlePostsSorter;
import com.university.domain.people.entity.IPersonFactory;
import com.university.domain.people.entity.LecturerFactory;
import com.university.domain.timetable.entity.ExerciseLectureFactory;
import com.university.domain.timetable.entity.ILectureFactory;
import com.university.domain.timetable.services.ITimetableGenerator;
import com.university.domain.timetable.services.SimpleTimetableGenerator;
import com.university.facade.news.INewsFacade;
import com.university.facade.news.SortedNewsFacade;
import com.university.facade.people.IPeopleFacade;
import com.university.facade.people.SimplePeopleFacade;
import com.university.facade.timetable.ITimetableFacade;
import com.university.facade.timetable.SimpleTimetableFacade;
import com.university.repository.*;
import com.university.ui.NewsUI;

public class AppModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(IPersonFactory.class).to(LecturerFactory.class);
        bind(IPersonRepository.class).to(InMemoryPersonRepository.class);
        bind(IPeopleFacade.class).to(SimplePeopleFacade.class);

        bind(ILectureFactory.class).to(ExerciseLectureFactory.class);
        bind(ITimetableGenerator.class).to(SimpleTimetableGenerator.class);
        bind(ILectureRepository.class).to(InMemoryLectureRepository.class);
        bind(ITimetableFacade.class).to(SimpleTimetableFacade.class);


        bind(IPostsSorter.class).to(TitlePostsSorter.class);
        bind(IPostFactory.class).to(CreatedPostFactory.class);
        bind(IPostRepository.class).to(InMemoryPostRepository.class);
        bind(INewsFacade.class).to(SortedNewsFacade.class);
    }
}
