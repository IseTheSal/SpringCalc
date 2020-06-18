package Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("Config");
        Action action = (Action) app.getBean("action");
        action.calc();
    }
}
