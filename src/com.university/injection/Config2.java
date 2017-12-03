package com.university.injection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.university.domain.news.entity.*;
import com.university.domain.news.services.IPostsSorter;
import com.university.domain.news.services.NewestPostsSorter;
import com.university.domain.news.services.TitlePostsSorter;
import com.university.domain.people.entity.IPersonFactory;
import com.university.domain.people.entity.LecturerFactory;
import com.university.domain.timetable.entity.ExerciseLectureFactory;
import com.university.domain.timetable.entity.ILectureFactory;
import com.university.domain.timetable.entity.TheoryLectureFactory;
import com.university.domain.timetable.services.DetailedTimetableGenerator;
import com.university.domain.timetable.services.ITimetableGenerator;
import com.university.domain.timetable.services.SimpleTimetableGenerator;
import com.university.facade.news.INewsFacade;
import com.university.facade.news.SortedNewsFacade;
import com.university.facade.people.IPeopleFacade;
import com.university.facade.people.NotifyingPeopleFacade;
import com.university.facade.people.SimplePeopleFacade;
import com.university.facade.timetable.ITimetableFacade;
import com.university.facade.timetable.InformingTimetableFacade;
import com.university.facade.timetable.SimpleTimetableFacade;
import com.university.integration.EmailSender;
import com.university.integration.IEmailSender;
import com.university.repository.*;

public class Config2 extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(IEmailSender.class).to(EmailSender.class);

        bind(IPersonFactory.class).to(LecturerFactory.class);
        bind(IPersonRepository.class).to(InMemoryPersonRepository.class);
        bind(IPeopleFacade.class).to(NotifyingPeopleFacade.class);

        bind(ILectureFactory.class).to(TheoryLectureFactory.class);
        bind(ITimetableGenerator.class).to(DetailedTimetableGenerator.class);
        bind(ILectureRepository.class).to(InMemoryLectureRepository.class);
        bind(ITimetableFacade.class).to(InformingTimetableFacade.class);


        bind(IPostsSorter.class).to(NewestPostsSorter.class);
        bind(IPostFactory.class).annotatedWith(Names.named("Created")).to(CreatedPostFactory.class);
        bind(IPostFactory.class).annotatedWith(Names.named("Generated")).to(GeneratedPostFactory.class);
        bind(IPostRepository.class).to(InMemoryPostRepository.class);
        bind(INewsFacade.class).to(SortedNewsFacade.class);
    }
}
