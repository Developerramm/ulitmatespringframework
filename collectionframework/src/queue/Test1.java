package queue;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("AAA");
        pq.add("EEE");
        pq.add("CCC");
        pq.add("GGG");
        pq.add("BBB");
        pq.add("DDD");
        pq.add("FFF");
        pq.add("BBB");
        pq.add("BBB");

        System.out.println(pq);

        System.out.println("____________________________");
        PriorityQueue<String> pq1 = new PriorityQueue<>(pq);
        // System.out.println(pq1.size());

        System.out.println(pq1);

        pq1.add("Ram");
        pq1.add("mohan");

        System.out.println(pq1);

        SortedSet<String> ss = new TreeSet<>();
        ss.add("Ram");
        ss.add("Sarita");
        ss.add("Manu");
        ss.add("Soni");

        System.out.println("---------------------------------");

        PriorityQueue<String> p = new PriorityQueue<>(ss);

        System.out.println(p);

    }

}
