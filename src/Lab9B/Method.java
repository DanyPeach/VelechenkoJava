package Lab9B;

import by.Print;

import java.util.Arrays;

public class Method {
    private StringBuilder verib;
    private StringBuilder out = new StringBuilder(110);
    by.Print print = new Print();

    public Method(StringBuilder str) {
        this.verib = str;
    }

    public void Processing() {
        if(this.verib.length()<1) {
            print.printError("Пустое предложение!");
        }
        else {
            String[] sentance = this.verib.toString().split("[.!?]");
            int in[][] = new int[sentance.length][2];
            int i = 0;
            Arrays.sort(sentance);
            for(String strin : sentance)
            {
                String[] words = strin.split("[ ,:;]");
                if(words[0].isEmpty())
                    in[i][0]= words.length-1;
                else
                    in[i][0]= words.length;
                    in[i][1]= i;
                    i++;
            }
            int[] amountOfWords;
            for(int z=in.length-1;z>0;z--){
                for(i=0;i<z;i++){
                    if(in[i][0]<in[i+1][0]){
                        amountOfWords=in[i];
                        in[i]=in[i+1];
                        in[i+1]=amountOfWords;
                    }
                }
            }


            for(int z=in.length-1;z>-1;z--) {
                this.out.append(sentance[in[z][1]]+".");
            }
            System.out.println(this.out.toString());
        }

    }

    public StringBuilder getWorktype() {
        return this.out;
    }

    public void setWorktype(StringBuilder str) {
        this.verib = str;
    }
}
