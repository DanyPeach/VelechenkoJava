package Lab9C;

import by.Print;


import java.util.Scanner;

public class Matrix {
    private int n;
    private char[][] matrixLetters;

    public Matrix(int n) {
        this.n = n;
    }

    public void createMatrix(){
        Scanner scanner = new Scanner(System.in);
        by.Print print = new Print();

        print.print("Введите текст состоящий из " + n*n + " символов: ");
        String newText = scanner.next();
        print.print(newText);

        for(int i = 0; i< matrixLetters.length; i++){
            for(int j=0; j< matrixLetters.length;j++){
                matrixLetters[i][j] = newText.toCharArray()[n];
                System.out.println(matrixLetters);
            }
        }

    }
}
