import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();

        l.add("z");
        l.add("a");
        l.add("x");
        l.add("m");
        l.add("d");

        System.out.println(l);

        Collections.sort(l);

        System.out.println(Collections.binarySearch(l, "m"));
    }

}
