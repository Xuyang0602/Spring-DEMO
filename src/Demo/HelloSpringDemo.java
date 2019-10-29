package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDemo {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // method for forturnes
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
