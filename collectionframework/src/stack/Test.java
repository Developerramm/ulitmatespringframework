package stack;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        System.out.println(s);

        s.push("AAA");
        s.push("BBB");
        s.push("CCC");
        s.push("DDD");
        s.push("EEE");
        s.push("FFF");
        s.push("GGG");
        s.push("HHH");

        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.getFirst());

        System.out.println(s.getLast());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());



    }
}
