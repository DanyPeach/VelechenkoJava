package com.company;

public class ChocolateChipCookie extends Cookie //Класс "Печенье с шоколадной крошкой"
{
    private String chocolatetype; //тип шоколада

    public ChocolateChipCookie()
    {
        super("шоколадная крошка", 0, 0);
        chocolatetype = "none";
    }

    public ChocolateChipCookie(String chocolatetype, double weight, double sugar)
    {
        super("шоколадная крошка",weight,sugar);
        this.chocolatetype = chocolatetype;
    }

    public void setChocolatetype(String chocolatetype) { this.chocolatetype = chocolatetype; }
    public String getChocolatetype() { return chocolatetype; }

    @Override
    public String toString()
    {
        return "печенье; " + type + " с " + chocolatetype + " шоколадом; " + weight + " г, " + sugar + "г сахара";
    }
}
