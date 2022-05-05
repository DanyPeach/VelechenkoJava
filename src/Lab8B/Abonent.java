package Lab8B;

import by.Print;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Abonent implements Methods{
    private String firstName;
    private String lastName;
    private int age;
    private int money;
    private long number;
    private int min;

    by.Print print = new Print();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int count = 0;

    public Abonent() {
    }

    public Abonent(String firstName, String lastName, int age, int money, long number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.money = money;
        this.number = number;
    }

    public void allMethods(){

    }

    @Override
    public void makeContract() {
        String yes = "да";
        String no = "нет";
        print.print("Вы хотите оформить договор? (да/нет): ");
        String answer = scanner.next();
        if(yes.equals(answer)){
            print.print("Договор успешно оформлен! ");
        }else{
            print.print("Вы отказались подписать договор! ");
        }

    }

    public static void openSch(Abonent abonent) {
        try{
        Print print1 = new Print();
        Scanner scanner1 = new Scanner(System.in);
        Random random1 = new Random();
        String yes = "да";
        String no = "нет";
        print1.print("Вы хотите открыть счет? (да/нет): ");
        String answer = scanner1.next();
        if(yes.equals(answer)){
            print1.print("Счет успешно открыт! Ваш номер телефона: ");
            long tels;
            tels = Math.abs(random1.nextInt()*random1.nextInt())%10000000 + 290000000;
            print1.print(tels);
            abonent.setNumber(tels);
            print1.print("Хотите сразу пополнить свой счет?(да/нет) ");
            String answer2 = scanner1.next();
            if(yes.equals(answer2)){
                abonent.putMoney();
            }
        }else{
            print1.print("Вы отказались подписать договор! ");
        }} catch (InputMismatchException e) {
            System.out.println("Вы ввели неправильный формат ответа!");
        }
    }

    @Override
    public void editAccaunt() {
        print.print("Добро пожаловать в панель редактирование профиля! \n1) Редактировать Имя \n2) Редактировать" +
                " Фамилию \n3) Редактировать Возраст");
        while(true){
        try {

        int a = scanner.nextInt();
        switch (a){
            case 1:{
                print.print("Введите новое имя: ");
                String newFirstName = scanner.next();
                setFirstName(newFirstName);
                break;
            }
            case 2:{
                print.print("Введите новую фамилию: ");
                String newLastName = scanner.next();
                setLastName(newLastName);
                break;
            }
            case 3:{
                print.print("Введите новый возраст: ");
                int newAge = scanner.nextInt();
                setAge(newAge);
                break;
            }
        }

        String yes = "да";
        String no = "нет";
        print.print("Выйти из редактора?");
        String answer3 = scanner.next();
        if(answer3.equals(yes)){
            break;
        }
            } catch (InputMismatchException e) {
                print.printError("Вы ввели неправильный формат ответа!");
                break;
            }
        }
    }

    @Override
    public void checkInfoPerson() {
        print.print("Информация о пользователе \n"+
                "Имя: " + getFirstName() +
                "\nФамилия: " + getLastName() +
                "\nВозраст: " + getAge() +
                "\nНомер Телефона: " + getNumber() +
                "\nБаланс: " + getMoney() +
                "\nОстаток травика: " +getMin());
    }

    @Override
    public void checkMoney() {
        print.print("Остаток на балансе: " + getMoney() + " р. " + getMin() + " мин.");
    }

    @Override
    public void changePlan() {
        print.print("Вы уверены, что хотите сменить свой тарфиный план?");
        String yes = "да";
        String no = "нет";
        String answer = scanner.next();
        int newMin = random.nextInt(400,800);
        if(answer.equals(yes)){
           print.print("Ваш тарифный план был успещно сменен на " + newMin + " минут!");
           setMin(newMin);
        }else{
            print.print("Отказ от смены плана");
        }
    }

    @Override
    public void paiments() {
        print.print("Вы успешно пополнили свой баланс " + count + " раз!");
    }


    @Override
    public void putMoney() {

        int acess = random.nextInt(100,999);
        print.print("Проверка на робота! Введите " + acess + ": ");
        int a = scanner.nextInt();
        if(a == acess){
            print.print("Введите сумму для пополнения счета: ");
            int payment = scanner.nextInt();
            setMoney(payment);
            count++;
        }else{
            print.print("Не удалось пополнить счет!");
        }
    }

    @Override
    public void closeSch() {

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
