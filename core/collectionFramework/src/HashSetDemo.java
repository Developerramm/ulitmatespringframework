import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>();

        // System.out.println(hs.size());

        // HashSet<Integer> hs2 = new HashSet<>(10);
        // System.out.println(hs2.size());

        // HashSet<Integer> hs3 = new HashSet<>(5,0.6f);
        // System.out.println(hs3);

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs.isEmpty());
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        hs.add("A");
        hs.add("B");

        System.out.println(hs);
        System.out.println(hs.size());
    }

}
