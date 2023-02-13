import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        for (String arg : args
        ) {


            if (arg.equals("hello")) {
                Greeter greet = (Greeter) context.getBean("Command");
                greet.execute();
            } else if (arg.equals("timer")) {
                Timer timer = (Timer) context.getBean("Command2");
                timer.execute();

            }

        }
    }
}