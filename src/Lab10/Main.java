import Lab10.ReverseInt;
import by.Print;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        by.Print print = new Print();
        Scanner scanner = new Scanner(System.in);

        print.print("Введите число: ");
        int n = scanner.nextInt();

        print.print(ReverseInt.reverse(n));
    }
}