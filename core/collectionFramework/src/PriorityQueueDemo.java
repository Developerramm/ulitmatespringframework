import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue<>();
        System.out.println(q.peek());

        for (int i = 0; i <= 10; i++) {
            q.offer(i); // a
        }

        System.out.println(q);

        q.offer(20);
        q.offer(15);
        q.offer(12);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.element());

        System.out.println("Printing PriorityQueue");
        for (Object obj : q) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
