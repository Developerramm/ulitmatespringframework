import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        System.out.println("Linked list in java collection framework ");

        LinkedList<String> fruits = new LinkedList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grapes");

        System.out.println(fruits);

        System.out.println(fruits.size());

        // System.out.println(fruits[0]);

        for(int i = 0; i<fruits.size(); i++){
            System.out.print(fruits.get(i) + " ");
        }

        System.out.println("using forEach loop in linked list");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println();
        fruits.set(3, "Ram");
        System.out.println(fruits);

        fruits.addFirst("Ram");
        System.out.println(fruits);

        fruits.addLast("Moni");
        System.out.println(fruits);

        fruits.removeFirst();
        System.out.println(fruits);

        fruits.removeLast();
        System.out.println(fruits);

        // System.out.println(fruits.toArray().toString());
    }
}
