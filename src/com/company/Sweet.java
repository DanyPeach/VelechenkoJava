package com.company;

public abstract class Sweet //Абстрактный класс "Сладость"
{
    protected String type;
    protected double weight;
    protected double sugar;

    public Sweet()
    {
        type = "none";
        weight = 0; sugar = 0;
    }

    public Sweet(String type, double weight, double sugar)
    {
        this.type = type;
        this.weight = weight;
        this.sugar = sugar;
    }

    public double getSugar() { return sugar; }
    public double getWeight() { return weight; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public void setSugar(double sugar) { this.sugar = sugar; }
    public void setWeight(double weight) { this.weight = weight; }

    public abstract String toString();
}
