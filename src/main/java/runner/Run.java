package runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plannerSpring.Planner;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Planner bean = (Planner) context.getBean("planner");
        bean.getReadTheBook().getFindTheBook().getDoTask3();
        bean.getFirstMessage();

        bean.getReadTheBook().getDoTask2();
        bean.getFirstMessage();

        bean.getDoHW().getDoTask();
        bean.getFirstMessage();

        bean.getFeedDog().getDoTask1();
        bean.getFirstMessage();

        bean.getLastMessage();
    }
}
