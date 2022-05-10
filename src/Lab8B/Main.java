package Lab8B;

import by.Print;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        by.Print print = new Print();
        Scanner scanner = new Scanner(System.in);
        Abonent abonent1 = new Abonent("Daniil", "Dudak", 19, 0, 0);
        try {
            while (true) {
                print.print("Список доступных функций!" +
                        "\n1) Открыть счет" +
                        "\n2) Заключить контракт" +
                        "\n3) Редактировать профиль" +
                        "\n4) Посмотреть профиль" +
                        "\n5) Проверить баланс" +
                        "\n6) Сменить тарифный план" +
                        "\n7) Платежи абонента" +
                        "\n8) Выход из приложения"+
                        "\n9) Удалить счет");
                System.out.print("Выберите пункт: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        Abonent.openSch(abonent1);
                        break;
                    }
                    case 2: {
                        abonent1.makeContract();
                        break;
                    }
                    case 3: {
                        abonent1.editAccaunt();
                        break;
                    }
                    case 4: {
                        abonent1.checkInfoPerson();
                        break;

                    }
                    case 5: {
                        abonent1.checkMoney();
                        break;
                    }

                    case 6: {
                        abonent1.changePlan();
                        break;
                    }

                    case 7: {
                        abonent1.paiments();
                        break;
                    }

                    case 8: {
                        break;
                    }

                    case 9 : {
                        Abonent.closeSch(abonent1);
                    }

                }
                String yes = "да";
                String no = "нет";
                print.print("Выйти из приложения?");
                String answer = scanner.next();
                if (answer.equals(yes)) {
                    break;
                }
            }
        }catch (InputMismatchException e) {
            print.printError("Вы ввели неправильный формат ответа!");
        }

    }
}
