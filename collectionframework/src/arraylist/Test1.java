package arraylist;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();

        System.out.println(al);
        System.out.println(al.size());

        al.add("AAA");
        al.add("BBB");
        al.add("CCC");
        al.add("DDD");
        al.add("EEE");
        al.add("FFF");
        al.add("GGG");
        al.add("HHH");
        System.out.println(al);

        System.out.println(al.get(2));

        al.add("BBB");
        al.add("CCC");

        System.out.println(al);

        

        
    }

}
