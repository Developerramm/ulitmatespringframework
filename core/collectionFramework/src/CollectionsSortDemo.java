import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("z");
        a.add("k");
        a.add("t");
        a.add("e");
        a.add("x");

        System.out.println(a);

        Collections.sort(a, new MyComparator4());

        System.out.println(a);
    }

}
