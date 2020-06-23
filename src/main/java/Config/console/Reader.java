package Config.console;

import org.springframework.stereotype.Component;

import java.util.Scanner;


public class Reader {
    public double readNum() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            return -1;
        }

    }

    public String readOp() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            return "null";
        }

    }
}
