import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<Integer>();

        for(int i = 1; i<= 12; i++){
            v1.add(i);
        }

        System.out.println(v1);

        System.out.println(v1.size());
        System.out.println(v1.capacity());


        Vector<Integer> v2 = new Vector<Integer>(5, 6);
        System.out.println(v2.capacity());


        for(int i = 1; i<= 7; i++){
            v2.add(i);
        }

        System.out.println(v2);
        System.out.println(v2.capacity());

        for(int i = 1; i<= 7; i++){
            v2.add(i);
        }

        System.out.println(v2);

        for (Integer item  : v2) {
            System.out.print(item + " ");
        }

        System.out.println();

    }

}
