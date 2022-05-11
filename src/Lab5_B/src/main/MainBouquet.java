package main;

import exception.BouquetException;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static serialize.serializeFlowers.deserialize;
import static serialize.serializeFlowers.serialize;

public class MainBouquet {
        public static void main(String[] args) throws BouquetException, IOException, NoSuchElementException {
            by.Print print = new by.Print();
            Scanner scanner = new Scanner(System.in);
            ArrayList<flower.Sweets> flowerInBouquet = new ArrayList<>();
            File file = new File("C:\\Users\\user\\Desktop\\4B\\src\\Lab5_B\\textfile\\var5.txt");
            Scanner scanFile = new Scanner(file);
            PrintWriter writer = null;
            try {
                if (!file.exists()) {
                    throw new IOException();
                }
                writer = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\4B\\src\\Lab5_B\\textfile\\output.txt")));
                flower.Sweets newFlower = new flower.Sweets();
                int k = 0;
                while (scanFile.hasNext()) {
                    scanFile.next();
                    k++;
                }
                if (k % 10 != 0) {
                    throw new NoSuchElementException();
                }
                scanFile = new Scanner(file);
                while (scanFile.hasNext()) {
                    String name = scanFile.next();
                    int price = scanFile.nextInt();
                    int lenght = scanFile.nextInt();
                    int day = scanFile.nextInt();
                    newFlower = new flower.Sweets(name, price, lenght, day);
                    flowerInBouquet.add(newFlower);
                    writer.println(newFlower);
                }


                int x = 0;
                while (x != 6) {
                    print.print("1. Для вывода списка всех конфет введите \"1\"");
                    print.print("2. Для подсчета стоимости подарка введите \"2\"");
                    print.print("3. Для вывода отсортированных по каллориям введите \"3\"");
                    print.print("4. Для вывода цветов с заданным числом сахара введите \"4\"");
                    print.print("5. Для сериализации конфет в файл нажмите \"5\"");
                    print.print("6. Для выхода нажмите \"6\"");
                    x = scanner.nextInt();

                    switch (x) {
                        case 1:
                            try {
                                if (flowerInBouquet.size() == 0) {
                                    throw new BouquetException("Конфет нет!");
                                }
                                print.print("Список конфет в подраке:");
                                for (flower.Sweets flower : flowerInBouquet) {
                                    print.print(flower.toString());
                                }
                                break;
                            } catch (BouquetException e) {
                                e.printStackTrace();
                            } finally {
                                break;
                            }
                        case 2:
                            try {
                                if (flowerInBouquet.size() == 0) {
                                    throw new BouquetException("Конфет нет!");
                                }
                                long sum = bouquet.Present.calculateCost(flowerInBouquet);
                                print.print("В подарке " + flowerInBouquet.size() + " конфет, его стоимость: руб." + sum);
                                break;
                            } catch (BouquetException e) {
                                e.printStackTrace();
                            } finally {
                                break;
                            }
                        case 3:
                            try {
                                if (flowerInBouquet.size() == 0) {
                                    throw new BouquetException("конфет нет!");
                                }
                                flowerInBouquet = bouquet.Present.sortByDay(flowerInBouquet);
                                print.print("Отсортированные по сахару конфеты:");
                                for (flower.Sweets flower : flowerInBouquet) {
                                    print.print(flower.toString());
                                }
                                break;
                            } catch (BouquetException e) {
                                e.printStackTrace();
                            } finally {
                                break;
                            }
                        case 4:
                            try {
                                if (flowerInBouquet.size() == 0) {
                                    throw new BouquetException("Конфет нет!");
                                }
                                print.print("Введите диапазон каллорий:\nОт: ");
                                int min = scanner.nextInt();
                                print.print("До: ");
                                int max = scanner.nextInt();
                                if (min < 0 || max < 0 || min > max) {
                                    throw new BouquetException("Некорректно введены пределы!");
                                }
                                ArrayList<flower.Sweets> searchLenght = bouquet.Present.searchLeangt(flowerInBouquet, min, max);
                                if (searchLenght.size() == 0) {
                                    throw new BouquetException("Цветы не найдены!");
                                }
                                print.print("Конфеты с количесвтом сахара в приделах  " + min + "–" + max + " г сахара");
                                for (flower.Sweets flower : searchLenght) {
                                    print.print(flower.toString());
                                }
                            } catch (BouquetException e) {
                                e.printStackTrace();
                            } catch (InputMismatchException e) {
                                print.printError("Некорректно введены пределы сахара! Введено не число!");
                                throw new BouquetException("Некорректно введены пределы длины! Введено не число!");
                            }
                            break;
                        case 5:
                            String path = "C:\\Users\\user\\Desktop\\4B\\src\\Lab5_B\\Flowers.ser";
                            serialize(flowerInBouquet, path);
                            deserialize(path);
                            break;
                        case 6:
                            print.print("Завершение программы!");
                            break;
                        default:
                            try {
                                if (x > 6 || x < 1)
                                    throw new BouquetException("Число введено неверно! Повторите попытку...");
                            } catch (BouquetException e) {
                                e.printStackTrace();
                            }
                            break;
                    }
                }
            }catch (IOException e){
                print.printError("Файл по указанному пути не найден");
                throw new FileNotFoundException("Файл не найден");
            } catch (InputMismatchException e){
                print.printError("Недопустимое значение поля!!!");
                throw new InputMismatchException("Недопустимое значение поля!!!");
            } catch (NoSuchElementException | ClassNotFoundException e){
                print.printError("Не хватает записей в файле!");
                throw new NoSuchElementException("Не хватает записей в файле!");
            }finally {
                scanFile.close();
                scanner.close();
                writer.close();
            }

        }
    }

