package Config.service;

import java.util.ArrayList;
import java.util.Collections;

public class History {

    private ArrayList<String> list = new ArrayList<>();

    public void addToHistory(double num1, String op, double num2, double res) {
        switch (op) {
            case "plus":
                list.add(num1 + " + " + num2 + " = " + res);
                break;
            case "minus":
                list.add(num1 + " - " + num2 + " = " + res);
                break;
            case "pow":
                list.add(num1 + " * " + num2 + " = " + res);
                break;
            case "div":
                list.add(num1 + " / " + num2 + " = " + res);
                break;
        }
    }

    public void showHistory() {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
