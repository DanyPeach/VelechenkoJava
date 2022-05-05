package com.company;

public class Present //Класс "подарок"
{
    private Sweet[] sweets; //Сладости
    private String message; //Сообщение к подарку

    public Present() //Конструктор по умолчанию
    {
        sweets = null;
        message = "none";
    }

    public Present(Sweet[] sweets, String message) //Конструктор с параметрами
    {
        this.sweets = sweets.clone();
        this.message = message;
    }


    public String getMessage() { return message; }
    public Sweet[] getSweets() { return sweets; }
    public void setMessage(String message) { this.message = message; }
    public void setSweets(Sweet[] sweets) { this.sweets = sweets; }

    public void show()
    {
        System.out.println("Сообщение: " + message);
        System.out.println("Сладости: ");
        for(int i = 0; i<sweets.length; i++)
        {
            System.out.println((i+1) + ". " + sweets[i].toString());
        }
    }

    public double getWeight() //Вес подарка
    {
        double res = 0;
        for(int i = 0; i<sweets.length; i++)
        {
            res += sweets[i].getWeight();
        }
        return res;
    }

    public void sortByWeight() //Сортировка сладостей по весу
    {
        Sweet temp;
        int i, j; boolean swapped;

        for (i = 0; i < sweets.length-1; i++) //Берем элемент массива
        {
            swapped = false;
            for (j = 0; j < sweets.length-i-1; j++) //Затем проходимся с этого элемента по всем оставшимся элементам
            {
                if (sweets[j].getWeight() > sweets[j+1].getWeight())
                {
                    temp = sweets[j];
                    sweets[j] = sweets[j + 1];
                    sweets[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; //Если элементы не поменялись местами, выходим из цикла
        }
    }

    public void findSweets(double from, double to) //Вывод сладостей с заданным содержанием сахара
    {
        boolean found = false; int j = 1;
        for(int i = 0; i<sweets.length; i++)
        {
            if(sweets[i].getSugar() >= from && sweets[i].getSugar() <= to)
            {
                System.out.println(j + ". " + sweets[i]);
                found = true; //Указываем что нашли
                j++;
            }
        }
        if(!found) System.out.println("Таких сладостей не нашлось"); //Если не нашлось, выводим сообщение
    }
}
