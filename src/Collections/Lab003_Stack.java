package Collections;

import java.util.Stack;

public class Lab003_Stack {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.add("Sunil");
        stk.push("Bhati"); // We can add add as well as push also
        System.out.println(stk);
        System.out.println(stk.peek()); // It will displayed the latest content
       // System.out.println(stk.pop()); //It will remove the latest
        System.out.println(stk);
        System.out.println(stk.get(1));

    }
}
