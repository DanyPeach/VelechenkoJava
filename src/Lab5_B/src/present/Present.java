package bouquet;


import exception.BouquetException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Present {
    public static long calculateCost(ArrayList<flower.Sweets> sweets) throws BouquetException {
            try {
                if (sweets.size() == 0) {
                    throw new BouquetException("В подарке нет конфет!!!");
                }
                long sum = 0;

                for (flower.Sweets flower : sweets) {
                    sum += flower.getPrice();
                }
                return sum;
        } catch(BouquetException e){
            e.printStackTrace();
        }
        return 0;
    }

    public static ArrayList<flower.Sweets> searchLeangt(ArrayList<flower.Sweets> flowers, int min, int max) throws BouquetException {
        ArrayList<flower.Sweets> selectedFlowers = new ArrayList();
        try {
            if (flowers.size() == 0) {
                throw new BouquetException("Конфет!");
            }
            for (flower.Sweets flower : flowers) {
                if (flower.getLenght() >= min && flower.getLenght() <= max) {
                    selectedFlowers.add(flower);
                }
            }
            return selectedFlowers;
        } catch (BouquetException e){
            e.printStackTrace();
        }
        return selectedFlowers;
    }

    public static ArrayList<flower.Sweets> sortByDay(ArrayList<flower.Sweets> flowers) throws BouquetException{
        try{

        if (flowers.size() == 0) {
            throw new BouquetException("Конфет нет!");
        }
        Collections.sort(flowers, new Comparator<flower.Sweets>() {
            public int compare(flower.Sweets o1, flower.Sweets o2) {
                return o1.getDay() - o2.getDay();
            }
        });
        ArrayList<flower.Sweets> sortedFlowers = new ArrayList();
        sortedFlowers.addAll(flowers);
        return sortedFlowers;
        } catch (BouquetException e){
            e.printStackTrace();
        }
        ArrayList<flower.Sweets> sortedFlowers = new ArrayList<>();
        return sortedFlowers;
    }
}
