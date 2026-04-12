package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        System.out.println("Collection framework linkedlist ");

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Sajan");

        System.out.println(ll);

        ArrayList<String> arr = new ArrayList<>();

        arr.add("AAA");
        arr.add("BBB");
        arr.add("CCC");
        arr.add("DDD");

        LinkedList<String> ll1 = new LinkedList<>(arr);

        System.out.println(ll1);

        System.out.println(ll1.size());

        for (String item : ll1) {
            System.out.print(item + " ");
        }

        System.out.println();

        ll1.addFirst("Ram kumar");

        ll1.addLast("Sarita");

        System.out.println(ll1);

        System.out.println(ll1.getFirst());

        System.out.println(ll1.getLast());

        System.out.println(ll1.size());
        
        System.out.println("_______________________");
        
        System.out.println(ll1.removeFirst());
        System.out.println(ll1);
        System.out.println(ll1.removeLast());

        System.out.println(ll1);

    }

}
