import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        System.out.println("This is vector demo class");

        Vector<String> v = new Vector<>();

        v.add("Ram");
        v.add("Mohan");
        v.add("Sohan");
        v.add("Rohan");

        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.isEmpty());

        System.out.println(v);

        for (String name : v) {
            System.out.print(name + " ");
        }

        System.out.println();

        // System.out.println(v.get(4));

        Vector<String> v1 = new Vector<>(v);

        v1.add("Apple");
        v1.add("Orange");
        v1.add("Cherry");
        System.out.println(v1);


    }

}
