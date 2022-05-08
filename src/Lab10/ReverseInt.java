package Lab10;

import java.util.Stack;

public class ReverseInt {
    public static int reverse(int a){
        Stack<Integer> stack = new Stack<>();
        int newInt = 0;
        int tenth = 1;

        while(a>0){
            stack.push(a%10);
            a/=10;
        }

        while(!stack.empty()){
            int lastInt = stack.pop();
            newInt += lastInt*tenth;
            tenth*=10;
        }
        return newInt;
    }
}
