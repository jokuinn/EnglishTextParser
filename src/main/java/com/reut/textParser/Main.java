package com.reut.textParser;

import com.reut.textParser.data.DataAcquirer;
import com.reut.textParser.data.DataAcquirerFactory;
import com.reut.textParser.data.DataException;
import com.reut.textParser.logic.Calculator;
import com.reut.textParser.view.ConsoleResultPrinter;
import com.reut.textParser.view.ResultPrinter;

public class Main {
    public static void main(String[] args) throws DataException {
        //given
        DataAcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer acquirer = factory.createDataAcquirer();
        String text = acquirer.getData();

        //logic
        Calculator calculator = new Calculator();
        text = calculator.removeArticles(text);
        text = calculator.removeC(text);
        text = calculator.removeDoubleLetter(text);
        text = calculator.removeE(text);
        //print
        ResultPrinter resultPrinter = new ConsoleResultPrinter();
        resultPrinter.print(text);
    }
}
