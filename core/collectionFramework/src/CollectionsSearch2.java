import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearch2 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            l.add(i);
        }

        System.out.println(l);

        Collections.sort(l, new MyComparator5());

        System.out.println(l);

        System.out.println(Collections.binarySearch(l, 10, new MyComparator5()));

        System.out.println("ArrayList is reversed");
        Collections.reverse(l);

        System.out.println(l);

    }

}
