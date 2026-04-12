package linkedlist;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {

    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();

        v.add("Ram");
        v.add("Shyam");
        v.add("Mohan");
        v.add("Sarita");
        v.add("Geeta");

        System.out.println(v);

        Enumeration<String> e = v.elements();

        while(e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");
        }

        System.out.println();


    }

}
