import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Learning array list");

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);

        System.out.println(a);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("banana");

        System.out.println(fruits);

        System.out.println(fruits.get(1));
        System.out.println(fruits.get(0));

        fruits.remove("banana");
        System.out.println(fruits);

        fruits.add(0, "Grapes");

        System.out.println(fruits);

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

    }

}
