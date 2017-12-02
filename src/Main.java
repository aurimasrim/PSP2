
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.university.controller.Controller;
import com.university.injection.AppModule;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Injector injector = Guice.createInjector(new AppModule());
        Controller controller = injector.getInstance(Controller.class);

        while (controller.showMenu());

    }
}
