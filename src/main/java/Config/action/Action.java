package Config.action;

import Config.console.Writer;
import Config.console.Reader;
import Config.service.Calculator;
import Config.service.History;


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
            writer.WriteStr("(Config)Выберите операцию\n1. Калькулятор\n2. История\n3. Выход");
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
                    } catch (IllegalArgumentException ex) {
                        writer.WriteStr("Illegal Operation");
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
