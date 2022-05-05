package com.company;

public class MarmaladeCandy extends Candy //Класс "Мармеладная конфета"
{
    private String flavor;

    public MarmaladeCandy()
    {
        super("мармелад", 0, 0);
        flavor = "none";
    }

    public MarmaladeCandy(String flavor, double weight, double sugar)
    {
        super("мармелад",weight,sugar);
        this.flavor = flavor;
    }

    public void setFlavor(String flavor) { this.flavor = flavor; }
    public String getFlavor() { return flavor; }

    @Override
    public String toString()
    {
        return "конфета; " + type + " с " + flavor + " вкусом; " + weight + " г, " + sugar + "г сахара";
    }
}
