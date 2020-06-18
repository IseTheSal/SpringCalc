package Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Action {

    private Writer writer;
    private Reader reader;
    private Calculator calculator;


    public Action(Writer writer, Reader reader, Calculator calculator) {
        this.writer = writer;
        this.reader = reader;
        this.calculator = calculator;
    }

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
