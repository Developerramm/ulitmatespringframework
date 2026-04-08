package list;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        System.out.println("List interface method ");

        List<String> list = new ArrayList<String>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");

        System.out.println(list);

        for (String element : list) {
            System.out.print(element + " ");
            if (element == "CCC") {
                System.out.print("Ram kumar maniyari " + " ");
            }
        }
        System.out.println();

        System.out.println("---------------------------");

        System.out.println(list.get(4));

        // System.out.println(list.get(10));

        System.out.println(list.remove(2));

        System.out.println(list);

        list.add("Ram");
        list.add("Shyam");
        list.add("Mohan");
        list.add("Rohan");
        list.add("Sarita");

        System.out.println(list);

        System.out.println(list.indexOf("Shyam"));

        System.out.println(list.indexOf("Sarita"));

        System.out.println(list.indexOf("ZZZ"));

        list.add("AAA");

        list.add("Mohan");

        list.add("AAA");

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.lastIndexOf("AAA"));
    }

}
