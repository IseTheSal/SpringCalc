package org.example.Component;

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

    public void calc() {
        writer.WriteStr("Введите операцию");
        String op = reader.readOp();
        writer.WriteStr("Введите число");
        double num1 = reader.readNum();
        writer.WriteStr("Введите число");
        double num2 = reader.readNum();
        double res = this.calculator.calculator(num1, num2, op);
        writer.WriteDouble(res);


    }
}
