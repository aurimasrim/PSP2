
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.university.domain.news.entity.IPost;
import com.university.injection.Config1;
import com.university.injection.Config2;
import com.university.ui.NewsUI;
import com.university.ui.PeopleUI;
import com.university.ui.TimetableUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Injector injector = Guice.createInjector(new Config1());
        Injector injector = Guice.createInjector(new Config2());

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        NewsUI newsUI = injector.getInstance(NewsUI.class);
        TimetableUI timetableUI = injector.getInstance(TimetableUI.class);
        PeopleUI peopleUI = injector.getInstance(PeopleUI.class);

        boolean run = true;
        while (run) {
            System.out.println("1. Show news\n" +
                    "2. Add news post\n" +
                    "3. Show timetable\n" +
                    "4. Add new lecture\n" +
                    "5. List people\n" +
                    "6. Add person\n" +
                    "0. Exit\n"
            );
            String option = consoleReader.readLine();
            switch (option) {
                case "1":
                    newsUI.showNews();
                    break;
                case "2":
                    newsUI.addNewsPost();
                    break;
                case "3":
                    timetableUI.showTimetable();
                    break;
                case "4":
                    timetableUI.addLecture();
                    break;
                case "5":
                    peopleUI.listPeople();
                    break;
                case "6":
                    peopleUI.addPerson();
                    break;
                case "0":
                    run = false;
                default:
                    System.out.println("No such command: " + option);
            }
        }




    }
}
