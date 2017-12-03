
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.university.domain.news.entity.IPost;
import com.university.injection.AppModule;
import com.university.ui.NewsUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Injector injector = Guice.createInjector(new AppModule());

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        NewsUI newsUI = injector.getInstance(NewsUI.class);

        boolean run = true;
        while (run) {
            System.out.println("1. Show news\n" +
                    "2. Add news post\n" +
                    "0. Exit\n");
            String option = consoleReader.readLine();
            switch (option) {
                case "1":
                    newsUI.showNews();
                    break;
                case "2":
                    newsUI.addNewsPost();
                    break;
                case "3":

                case "4":

                case "0":
                    run = false;
                default:
                    System.out.println("No such command: " + option);
            }
        }




    }
}