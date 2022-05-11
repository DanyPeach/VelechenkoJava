package flower;

import exception.BouquetException;

import java.io.Serializable;

public class Sweets implements Serializable {
    private String name;
    private int price;
    private int sugar;
    private int kiloc;


    public Sweets(String name, int price, int sugar, int kiloc)  throws BouquetException{
        if(name == "" || price < 0 || kiloc < 0 || sugar < 0){
            throw new BouquetException("Один из параметров введен неверно!");
        }
        this.name = name;
        this.price = price;
        this.sugar = sugar;
        this.kiloc =kiloc;
    }

    public Sweets() {

    }
    @Override
    public String toString() {
        String FlowerInfo = "Конфетка: " + this.name + ", Цена: руб." + this.price + ", Содержание сахара: " + this.sugar + " Каллории: " + this.kiloc;
        return FlowerInfo;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getLenght() {
        return this.sugar;
    }

    public void setLenght(int sugar) {
        this.sugar = sugar;
    }

    public int getDay() {
        return this.kiloc;
    }

    public void setDay(int kiloc) {
        this.kiloc = kiloc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

