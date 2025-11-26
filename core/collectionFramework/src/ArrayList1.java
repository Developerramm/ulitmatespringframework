import java.util.ArrayList;
// import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        System.out.println("ArrayList tutorial here ");

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(30);
        list.add(10);

        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.contains(30));

        System.out.println(list.indexOf(50));

        list.set(3, 3000);
        System.out.println(list);

        for (Integer item : list) {
            System.out.print(item + " ");
        }

        System.out.println();

        if (list.isEmpty()) {
            System.out.println("List is empty ");
        } else {
            System.out.println("List is not empty ");
        }

        // list.add("Ram");

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());

        ArrayList<Integer> list3 = new ArrayList<>(20);
        System.out.println(list3.size());

        // List a = new ArrayList<>();
        // a.add("Ram");
        // a.add(30);
        // System.out.println(a);


    }
}
