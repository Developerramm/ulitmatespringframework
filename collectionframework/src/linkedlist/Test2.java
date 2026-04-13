package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        int sum = 0;

        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
            sum = sum + it.next();
        }

        System.out.println();

        System.out.println("The sum is " + sum);
    }

}
