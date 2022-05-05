package com.company;

public abstract class Cookie extends Sweet //Абстрактный класс "печенье"
{
    public Cookie()
    {
        super();
    } //Конструктор по умолчанию

    //Конструктор с параметрами
    public Cookie(String type, double weight, double sugar)
    {
        super(type, weight, sugar);
    }

    public abstract String toString();
}
