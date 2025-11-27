import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Ram");
        arrayList.add("mohan");
        arrayList.add("sarita");
        arrayList.add("Guddu");
        arrayList.add("amint");
        arrayList.add("sabnam");

        System.out.println(arrayList);

        ListIterator<String> it = arrayList.listIterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        it.add("Priya");

        System.out.println(arrayList);

        if(it.equals("sarita")){
            it.set("Ram kumar singh");
        }

        System.out.println(it.equals("sarita"));

        System.out.println(arrayList);


    }

}
