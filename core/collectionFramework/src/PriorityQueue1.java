import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        
        PriorityQueue<String> q = new PriorityQueue<>(15,new MYQueueComparator());

        q.offer("abc@gmail.com");
        q.offer("zxyc@gmail.com");
        q.offer("mnoc@gmail.com");
        q.offer("jklc@gmail.com");
        q.offer("gmailc@gmail.com");
        q.offer("bcd@gmail.com");

        // System.out.println(q);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

}
