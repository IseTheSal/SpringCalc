package Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;


public class Action {

    private Writer writer;
    private Reader reader;
    private Calculator calculator;
    private History history;


    public Action(Writer writer, Reader reader, Calculator calculator, History history) {
        this.writer = writer;
        this.reader = reader;
        this.calculator = calculator;
        this.history = history;
    }

    public void calc() {
        boolean fg = true;
        while (fg) {
            writer.WriteStr("(Config)Выберите операцию");
            int choice = (int) reader.readNum();
            switch (choice) {
                case 1:
                    writer.WriteStr("Введите операцию");
                    String op = reader.readOp();
                    writer.WriteStr("Введите число");
                    double num1 = reader.readNum();
                    writer.WriteStr("Введите число");
                    double num2 = reader.readNum();
                    double res = this.calculator.calculator(num1, num2, op);
                    history.addToHistory(num1, op, num2, res);
                    writer.WriteDouble(res);
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
