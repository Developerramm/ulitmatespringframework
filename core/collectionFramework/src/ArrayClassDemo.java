import java.util.Arrays;

public class ArrayClassDemo {

    public static void main(String[] args) {
        int a[] = { 12, 34, 56, 89, 0, 1 };

        System.out.println("Before sorting array ");
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
        // sorting the primitive arrya

        System.out.println("Array after sorting");
        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

        String[] s = { "Ankit", "Priya", "Roshni", "Ram", "Arjeet", "Abhishek" };

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

        System.out.println();

        Arrays.sort(s);

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

        System.out.println();


        // customized sorting of object array

        String[] str = {"z","a","x","p","m","o"};

        for (String s2 : str) {
            System.out.print(s2 + " ");
        }

        System.out.println();

        Arrays.sort(str,new MyComparator6());

        for (String s2 : str) {
            System.out.print(s2 + " ");
        }

        System.out.println();

    }

}
