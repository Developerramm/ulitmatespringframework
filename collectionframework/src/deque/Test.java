package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        System.out.println("deque in collection framework ");

        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("Ram");
        dq.addFirst("Sarita");
        dq.addFirst("Rohan");
        dq.addFirst("Akash");
        dq.addFirst("Anirudh");
        dq.addFirst("Asha");

        System.out.println(dq);
        System.out.println("---------------------------------");

        dq.offer("AAA");
        dq.offer("BBB");
        dq.offer("CCC");
        dq.offer("EEE");

        System.out.println(dq);

        dq.addLast("Silpa");
        dq.addLast("Ranjeet");

        System.out.println(dq);

        dq.offerLast("Pooja");
        dq.offerLast("Priti");

        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq);

        System.out.println("--------------------------------");

        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println("--------------------------------");

        System.out.println(dq.pollLast());
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.peekFirst());

        System.out.println(dq.getLast());
        System.out.println(dq.peekLast());

        System.out.println(dq);

        dq.add("AAA");
        dq.add("AAA");

        System.out.println(dq);

        System.out.println(dq.removeFirstOccurrence("AAA"));
        System.out.println(dq);

        System.out.println(dq.removeFirstOccurrence("AAA"));
        System.out.println(dq);

        System.out.println(dq.removeFirstOccurrence("AAA"));
        System.out.println(dq);
        System.out.println(dq.removeFirstOccurrence("AAA"));
        System.out.println(dq);

        System.out.println(dq.removeLastOccurrence("Ram"));

        System.out.println(dq);
        System.out.println(dq.removeLastOccurrence("Silpa"));
        System.out.println(dq);

        // Iterator<String> it = dq.iterator();

        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }
        // System.out.println();

        Iterator<String> it1 = dq.descendingIterator();

        while(it1.hasNext()){
            System.out.print(it1.next() + " ");
        }

        System.out.println();

    
    }

}
