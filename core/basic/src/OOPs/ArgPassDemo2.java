package OOPs;

import java.util.ArrayList;

public class ArgPassDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        System.out.println("Before changing my list " + myList);

        change(myList);
        System.out.println("After change my list " + myList);

        
        
    }

    public static void change(ArrayList<Integer> mylist){
        mylist = new ArrayList<>();
        mylist.add(3);
        mylist.add(5);
    }

}
