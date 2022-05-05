package com.company;

public class ChocolateCandy extends Candy
{
    private String decoration;

    public ChocolateCandy()
    {
        super("шоколад", 0, 0);
        decoration = "none";
    }

    public ChocolateCandy(String decoration, double weight, double sugar)
    {
        super("шоколад",weight,sugar);
        this.decoration = decoration;
    }

    public void setDecoration(String decoration) { this.decoration = decoration; }
    public String getDecoration() { return decoration; }

    @Override
    public String toString()
    {
        return "конфета; " + type + " с " + decoration + " украшением; " + weight + " г, " + sugar + "г сахара";
    }
}
