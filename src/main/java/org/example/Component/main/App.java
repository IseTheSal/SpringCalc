package org.example.Component.main;

import org.example.Component.action.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext("org.example.Component");
        Action action = (Action) app.getBean("action");
        action.calc();
    }
}
