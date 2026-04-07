package collection;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        System.out.println("collection framework");

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Ram");
        arr.add("Shyam");
        arr.add("Mohan");
        arr.add("Sohan");
        arr.add("Sarita");

        System.out.println(arr);

        arr.remove("Ram");
        System.out.println(arr);

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("AAA");
        arr1.add("BBB");
        arr1.add("CCC");
        arr1.add("DDD");
        arr1.add("EEE");

        arr1.addAll(arr);
        System.out.println(arr1);

        arr1.removeAll(arr);

        System.out.println(arr1);

        System.out.println(arr1);

        System.out.println(arr1.contains("AAA"));

        arr.addAll(arr1);
        System.out.println(arr);

        System.out.println(arr.containsAll(arr1));

        System.out.println(arr1.containsAll(arr1));

    }

}
