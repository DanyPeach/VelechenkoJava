package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CaramelCandy extends Candy //Класс "Карамельная конфета"
{
    private String filling; //тип начинки

    public CaramelCandy()
    {
        super("карамель", 0, 0);
        filling = "none";
    }

    public CaramelCandy(String filling, double weight, double sugar)
    {
        super("карамель",weight,sugar);
        this.filling = filling;
    }

    public String getFilling() { return filling; }
    public void setFilling(String filling) { this.filling = filling; }

    @Override
    public String toString()
    {
        return "конфета; " + type + " с " + filling + " начинкой; " + weight + " г, " + sugar + "г сахар";
    }

}
