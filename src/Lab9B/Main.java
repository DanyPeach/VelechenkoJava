package Lab9B;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Жили у бабуси, два веселых Гуся! Один серый. А про второго все забыли.");
        System.out.println("Строка до обработки:");
        System.out.println(str);
        System.out.println();

        Method Obrabotca = new Method(str);
        Obrabotca.Processing();

    }
}