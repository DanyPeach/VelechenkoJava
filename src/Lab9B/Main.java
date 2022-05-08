package Lab9B;

public class Main {
    public static void main(String[] args) {
        String text = new String("лол. кекич кекю. р");

        for(String i : text.split("")){
            System.out.print(i);
        }

    }
}

