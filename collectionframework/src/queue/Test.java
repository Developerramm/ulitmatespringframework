package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        System.out.println("Ram kumar maniyari");

        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("AAA");
        queue.offer("GGG");
        queue.offer("CCC");
        queue.offer("EEE");
        queue.offer("BBB");
        queue.offer("DDD");
        queue.offer("FFF");

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.remove());


        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

        System.out.println(queue.element());

        System.out.println(queue);


    }

}
