package Lab8C;
import by.Print;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class StudentEvening extends Student{

    private static List<String> arrOch = new ArrayList<>();
    private static List<String> arrZaoch = new ArrayList<>();

    public StudentEvening(String name, int age, int marks) {
        super(name, age, marks);
    }

    @Override
    public void entrence() {
        Random random = new Random();
        by.Print print = new Print();
        int res = random.nextInt(1,3);
        if(res == 1){
            print.print("Абитуриент " + name +" поступил на очку");
            arrOch.add(name);
        }else{
            print.print("Абитуриент " + name +" поступил на заочку");
            arrZaoch.add(name);
        }
    }



    public List<String> getArrOch() {
        return arrOch;
    }

    public void setArrOch(List<String> arrOch) {
        this.arrOch = arrOch;
    }

    public List<String> getArrZaoch() {
        return arrZaoch;
    }

    public void setArrZaoch(List<String> arrZaoch) {
        this.arrZaoch = arrZaoch;
    }

    public static void studentList(Student[] lol) {
        System.out.println("Список зачисленных студентов очников - " + arrOch +
                "\nСписок зачисленных студентов заочников - " + arrZaoch);
    }

}
