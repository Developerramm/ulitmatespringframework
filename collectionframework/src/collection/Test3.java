package collection;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        
        System.out.println("Collection framework");

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);
        arr1.add(70);

        System.out.println(arr1.retainAll(arr));

        Object[] elements = arr.toArray();

        System.out.println(elements);

        for(Object ele : elements){
            System.out.print(ele  + " ");
        }

        System.out.println();

        System.out.println(arr);

        System.out.println(arr.size());


    }

}
