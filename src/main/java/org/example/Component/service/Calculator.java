package org.example.Component.service;

import org.springframework.stereotype.Component;

import javax.naming.InvalidNameException;

@Component
public class Calculator {
    public double calculator(double a, double b, String op) throws IllegalArgumentException {
        switch (op) {
            case "plus":
                return a + b;
            case "minus":
                return a - b;
            case "pow":
                return a * b;
            case "div":
                return a / b;
        }
        throw new IllegalArgumentException("");
    }
}
