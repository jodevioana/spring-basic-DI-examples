package componentScan;

import componentScan.configuration.Context;
import componentScan.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("Duplicates")

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Context.class);

        Controller controller = context.getBean(Controller.class);

        controller.makeAllAnimalSpeak();
        System.out.println("---------------");
        controller.validateAnimals();
    }

}
