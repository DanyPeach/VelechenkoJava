package com.company;

public class GingerCookie extends Cookie //Класс "имбирное печенье
{
    private String icing; //глазурь

    public GingerCookie()
    {
        super("имбирное", 0, 0);
        icing = "none";
    }

    public GingerCookie(String icing, double weight, double sugar)
    {
        super("имбирное",weight,sugar);
        this.icing = icing;
    }

    //Геттеры и сеттеры
    public void setIcing(String icing) { this.icing = icing; }
    public String getIcing() { return icing; }

    @Override
    public String toString()
    {
        return "печенье; " + type + " с " + icing + " глазурью; " + weight + "г, " + sugar + "г сахара";
    }
}
