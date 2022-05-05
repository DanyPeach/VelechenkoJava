package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        by.Print printer = new by.Print();

        Product product1 = new Product("Elfbar", 4.5, 31.2);
        Product product2 = new Product("HQD", 4.9, 35.0);
        Product product3 = new Product("File", 3.6, 25.0);
        Product[] oneUseSig = {product1, product2, product3};

        Product product4 = new Product("GEEKVAPE", 5.0, 129.5);
        Product product5 = new Product("Voopoo", 4.3, 89.4);
        Product product6 = new Product("Drag", 4.7, 100.0);
        Product[] vape = {product4, product5, product6};

        Product product7 = new Product("MORS", 4.9, 24.5);
        Product product8 = new Product("Glitch Souse", 4.8, 21.5);
        Product product9 = new Product("MORS VIP", 5.0, 29.0);
        Product[] juice = {product7, product8, product9};

        Product.Category categoryOneUse = new Product.Category("Одноразовые электронные сигареты", oneUseSig);
        Product.Category categoryVape = new Product.Category("Pod-системы", vape);
        Product.Category categoryJuice = new Product.Category("Жидкости для вейпа", juice);


        Product.Category[] categoryArr = {categoryOneUse, categoryVape, categoryJuice};

        printer.print("Сколько товаров вы планируете купить! Ваше решение нельзя поменять!");
        try {
            int n = scanner.nextInt();
            Product[] basketCat1 = new Product[n];

            int dulapip = 0;
            for (int k = 0; k < n; k++) {
                printer.print("Доступные каталоги: ");
                for (int i = 0, j = 1; i < categoryArr.length; i++, j++) {
                    printer.print(j + ") " + categoryArr[i].getName());
                }
                printer.print("\nВыберите Каталог, который хотите открыть: ");
                int chosenCatalog = scanner.nextInt();
                if(chosenCatalog> basketCat1.length){
                    throw new NullPointerException();
                }
                switch (chosenCatalog) {
                    case 1 -> {
                        categoryOneUse.categoryPrint();
                        printer.print("Выберете товар: ");
                        int a = scanner.nextInt();
                        if(a>oneUseSig.length){
                            throw new RuntimeException();
                        }
                        for (int j = 0; j < oneUseSig.length; j++) {
                            if (a == j + 1) {
                                basketCat1[dulapip] = oneUseSig[j];
                                dulapip++;
                            }
                        }
                    }
                    case 2 -> {
                        categoryVape.categoryPrint();
                        printer.print("Выберете товар: ");
                        int a = scanner.nextInt();
                        if(a>oneUseSig.length){
                            throw new RuntimeException();
                        }
                        for (int j = 0; j < oneUseSig.length; j++) {
                            if (a == j + 1) {
                                basketCat1[dulapip] = vape[j];
                                dulapip++;
                            }
                        }
                    }
                    case 3 -> {
                        categoryJuice.categoryPrint();
                        printer.print("Выберете товар: ");
                        int a = scanner.nextInt();
                        if(a>oneUseSig.length){
                            throw new RuntimeException();
                        }
                        for (int j = 0; j < oneUseSig.length; j++) {
                            if (a == j + 1) {
                                basketCat1[dulapip] = juice[j];
                                dulapip++;
                            }
                        }
                    }
                }
            }
            Basket basket = new Basket(basketCat1);
            basket.showBasket();
            basket.showPrice();

            Product productAnon = new Product() {
                @Override
                public void getSales(){
                    printer.print("у вас теперь скидка!");
                }
            };
            basket.getSales();

        } catch (NullPointerException ie) {
            printer.print(ie.getMessage());
            printer.print("Вы выбрали несущесвтующие каталоги");
        }catch (RuntimeException productNull){
            printer.print("Вы выбрали несущесвуюзий товар");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

