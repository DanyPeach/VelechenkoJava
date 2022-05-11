package flower;
import exception.BouquetException;

public class Snickers extends flower.Sweets {

    public Snickers(String name, int price, int lenght, int day) throws BouquetException {
        super(name,price, lenght, day);
        if(name == "" || price < 0 || lenght < 0){
            throw new BouquetException("Один из параметров введен неверно!");
        }
    }
    @Override
    public String toString() {
        String PionInfo =  super.toString();
        return PionInfo;
    }
}



