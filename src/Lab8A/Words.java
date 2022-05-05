package Lab8A;

public class Words implements Anagramm{

    public Words(){

    }
    @Override
    public String sortByLatters(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    @Override
    public boolean checkWords(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        return sortByLatters(a).equals(sortByLatters(b));
    }

}
