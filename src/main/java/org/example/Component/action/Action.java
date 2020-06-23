package org.example.Component.action;

import org.example.Component.service.History;
import org.example.Component.console.Reader;
import org.example.Component.console.Writer;
import org.example.Component.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Action {

    @Autowired
    private Writer writer;
    @Autowired
    private Reader reader;
    @Autowired
    private Calculator calculator;
    @Autowired
    private History history;


    public void calc() {
        boolean fg = true;
        while (fg) {
            writer.WriteStr("(Component)Выберите операцию\n1. Калькулятор\n2. История\n3. Выход");
            System.out.flush();
            int choice = (int) reader.readNum();
            switch (choice) {
                case 1:
                    writer.WriteStr("Введите операцию");
                    String op = reader.readOp();
                    writer.WriteStr("Введите число");
                    double num1 = reader.readNum();
                    writer.WriteStr("Введите число");
                    double num2 = reader.readNum();
                    try {
                        double res = this.calculator.calculator(num1, num2, op);
                        history.addToHistory(num1, op, num2, res);
                        writer.WriteDouble(res);
                    } catch (IllegalArgumentException ex){
                        writer.WriteStr("You can use only plus/minus/pow/div");
                    }
                    break;
                case 2:
                    history.showHistory();
                    break;
                case 3:
                    fg = false;
                    break;
            }
        }
    }
}