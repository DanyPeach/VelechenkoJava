package Lab8A;

import by.Print;

public class Main {
    public static void main(String[] args){
        by.Print print = new Print();
        Words words = new Words();
        print.print("Если true значит слова являются анограммами!");
        print.print("Осина и Ансио: "+words.checkWords("ансио", "осина"));
    }
}
