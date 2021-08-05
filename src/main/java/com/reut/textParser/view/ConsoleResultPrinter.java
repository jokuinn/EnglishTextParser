package com.reut.textParser.view;

public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
