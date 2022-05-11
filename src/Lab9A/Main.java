package Lab9A;

public class Main {
    public static void main(String[] args) {
        String testString = "Всем Привет".toLowerCase();
        String codeString = "";
        String formattedString = "";
        for(char ch : testString.toCharArray()) {
            codeString += Character.isAlphabetic(ch) ? String.format("%-3s",ch - 'а' + 1) : ch;
            formattedString += Character.isAlphabetic(ch) ? String.format("%-3s",ch) : ch;
        }
        System.out.println(formattedString);
        System.out.println(codeString);
    }
}
