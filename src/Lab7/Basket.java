package Lab7;

import java.util.Arrays;

public class Basket {

    public interface Mess {
        void message();
    }

    private Product[] products;

    public Basket() {

    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public void showBasket(){
        System.out.println("Ваша корзина: "  );
        for(Product i : products){
            System.out.println(i.getName() + " " +i.getPrice());
        }
    }

    public void showPrice(){
        System.out.println("Вы пошопились как крутышки на сумму: ");
        double sum = 0;
        for(Product i : products){
            sum+=i.getPrice();
        }
        System.out.println(sum);
    }



    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Так как корзина состоит из:" + Arrays.toString(products) +
                "и сумма привышает 100р, вы получаете скидку!";
    }

    public void getSales(){
        System.out.println("У вас теперь скидка!");
    }
}
