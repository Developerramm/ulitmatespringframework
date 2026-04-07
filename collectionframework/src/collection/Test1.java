package collection;

import java.util.HashSet;

public class Test1 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Ram");
        hs.add("shyam");
        hs.add("Mohan");
        hs.add("Sohan");
        hs.add("Geeta");
        hs.add("Ram");

        System.out.println(hs);

        HashSet<String> hs1 = new HashSet<String>();

        hs1.addAll(hs);

        System.out.println(hs1);
    }

}
