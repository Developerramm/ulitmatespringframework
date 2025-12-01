import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        SortedMap m = new TreeMap<>();

        m.put(1, "Ankit");
        m.put(0, "Ram");
        m.put(2, "Anshu");
        m.put(5, "Priya");
        m.put(3, "Mohit");

        System.out.println(m);

       Integer i = (Integer)m.firstKey();
       Integer i1 = (Integer)m.lastKey();

       System.out.println(i);
       System.out.println(i1);

       SortedMap m1 = m.headMap(3);
       System.out.println(m1);
    }

}
