package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)
    {
        by.Print printer = new by.Print();
	    try
        {
            CaramelCandy carcandy = new CaramelCandy("шоколад", 7.2, 4.5);
            ChocolateCandy choccandy = new ChocolateCandy("карамель", 8.5,3.1);
            MarmaladeCandy marcandy = new MarmaladeCandy("клубника", 10, 2.5);
            ChocolateChipCookie chopchipcookie = new ChocolateChipCookie("молочный", 13, 6);
            GingerCookie gingcookie = new GingerCookie("ваниль", 9, 2.5);

            String message;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            printer.print("Введите сообщение к подарку: ");
            message = br.readLine();

            Present present = new Present(
                    new Sweet[]{carcandy, choccandy, marcandy, chopchipcookie, gingcookie},
                    message
            );

            printer.print("-- Подарок --");
            present.show();

            printer.print("\nВес подарка - " + present.getWeight());

            double from, to;
            printer.print("\nВведите начальное значение сахара: ");
            from = Double.parseDouble(br.readLine().trim());

            printer.print("Введите конечное значение сахара: ");
            to = Double.parseDouble(br.readLine().trim());

            printer.print("\nСладости с содержанием сахара от " + from + " до " + to + ": ");
            present.findSweets(from, to);

            printer.print("\n");

            printer.print("-- Подарок со сладостями, отсортированными по весу --");
            present.sortByWeight();
            present.show();
        }
	    catch (IOException  ex)
        {
            printer.print("Супер внутрення Ошибка: " + ex.getMessage());
        }

        catch (NumberFormatException ex){
            printer.print("Конфеток таких нет! ");
        }
    }
}
