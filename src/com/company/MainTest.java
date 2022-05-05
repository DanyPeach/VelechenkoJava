package com.company;

import org.testng.annotations.Test;

public class MainTest extends com.company.Test {
    CaramelCandy caramelCandy1 = new CaramelCandy("lol", 12.3, 12.1);
    private final double FIRST_SHUGAR = caramelCandy1.getSugar();
    private final double SECOND_SHUGAR = 0;

    by.Print printer = new by.Print();
    @Test
    public void checkShugar(){
        printer.print("Тестирование в процессе");
        if(FIRST_SHUGAR<SECOND_SHUGAR){

            printer.print("Неверное значение сахара");
        }else printer.print("Все оки");
    }
}
