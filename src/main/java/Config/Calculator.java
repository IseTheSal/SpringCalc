package Config;

import org.springframework.stereotype.Component;


public class Calculator {
    public double calculator(double a, double b, String op) {
        switch (op) {
            case "plus":
                return a + b;
            case "minus":
                return a - b;
            case "pow":
                return a * b;
            case "div":
                return a / b;
            default:
                return 0;
        }
    }
}
