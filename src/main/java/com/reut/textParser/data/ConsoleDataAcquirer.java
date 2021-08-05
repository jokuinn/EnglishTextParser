package com.reut.textParser.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer{

    @Override
    public String getData() throws DataException {
        System.out.println("Input English text: ");
        String text = null;
        try(Scanner in = new Scanner(System.in)) {
            text = in.nextLine();
        }
        return text;
    }
}
