package Lab8C;

public class Main {
    public static void main(String[] args) {
        Student student1 = new StudentEvening("Daniil", 18, 293);
        Student student2 = new StudentEvening("Nastya", 18, 369);
        Student student3 = new StudentEvening("Vlad", 18, 330);
        Student student4 = new StudentEvening("Liza", 18, 300);

        Student[] students = {student1, student2, student3, student4};

        for(var i : students){
            i.entrence();
        }

        StudentEvening.studentList(students);

    }
}
