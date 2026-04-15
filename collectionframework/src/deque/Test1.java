package deque;

import java.util.ArrayDeque;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Array deque in collection framework ");

        ArrayDeque<String> adq = new ArrayDeque<String>();
        adq.add("AAA");
        adq.add("GGG");
        adq.add("EEE");
        adq.add("BBB");
        adq.add("EEE");
        adq.add("GGG");
        adq.add("FFF");
        adq.add("CCC");
        adq.add("DDD");

        System.out.println(adq);
    }

}
