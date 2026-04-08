package list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        
        System.out.println("List interface ");

        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("EEE");
        list.add("FFF");
        list.add("DDD");

        System.out.println(list);

        list.add(3, "Ram kumar");

        System.out.println(list);

        System.out.println(list.size());

        // list.add(8, "Mohit");

        System.out.println(list);

        List<String> arr = new ArrayList<String>();

        arr.add("10");
        arr.add("230");
        arr.add("30");
        arr.add("40");
        arr.add("50");

        System.out.println(arr);

        list.addAll(3, arr);

        System.out.println(list);

        System.out.println(arr);

        arr.set(3, "1-000");
        System.out.println(arr);


        
    }

}
