package Lab7;

import by.Print;

public class Product {
    private String name;
    private double rating;
    private double price;

    by.Print print = new Print();

    public Product(){

    }

    public Product(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //вложенный
    public static class Category{
        private String name;
        private Product[] productsArr;

        public Category(String name, Product[] productsArr) {
            this.name = name;
            this.productsArr = productsArr;
        }

        public Category() {
        }

        public void categoryPrint(){
            System.out.println(name + "\n");
            for(Product i : productsArr){
                System.out.println("Название: " + i.getName() + "\n" +
                        "Цена: " + i.getPrice() + "\n" +
                        "Рейтинг товара: " + i.getRating() + "\n");
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Product[] getProductsArr() {
            return productsArr;
        }

        public void setProductsArr(Product[] productsArr) {
            this.productsArr = productsArr;
        }
    }
    //внутренний
    public class Basket{
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


    }
    public void getSales(){

    }
}
