package com.company;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    by.Print printer = new by.Print();
    @BeforeTest
    public void beforeTest(){
        printer.print("Начало тестирования");
    }

    @AfterTest
    public void afterTest(){
        printer.print("Конец тестирования");
    }
}
