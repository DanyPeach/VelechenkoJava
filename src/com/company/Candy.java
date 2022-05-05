package com.company;

public abstract class Candy extends Sweet //Абстрактный класс "Конфета"
{
    public Candy()
    {
        super();
    }

    public Candy(String type, double weight, double sugar)
    {
        super(type, weight, sugar);
    }

    public abstract String toString();
}
