package Lab8C;

import by.Print;

import java.util.List;
import java.util.Random;

public abstract class Student implements Abiturient{

    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public abstract void entrence();


    public static void studentList() {
        System.out.println("Абитуриенты сдали цт и получили свои оценки!");
    }
}
