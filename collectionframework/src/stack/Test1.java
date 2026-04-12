package stack;

import java.util.Stack;

public class Test1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<String>();

        s.push("Ram");
        s.push("Shyam");
        s.push("Mohan");
        s.push("Sohan");
        s.push("Sarita");
        s.push("Saloni");

        System.out.println(s.peek());

        System.out.println(s.search("Sarita"));
        
    }

}
