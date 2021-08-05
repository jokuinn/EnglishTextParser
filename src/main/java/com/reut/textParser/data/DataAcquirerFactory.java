package com.reut.textParser.data;

public class DataAcquirerFactory {
    public DataAcquirer createDataAcquirer(){
        return new ConsoleDataAcquirer();
    }
}
