import java.util.Arrays;

public class ArraysSearchDemo {
    public static void main(String[] args) {
        int[] i = { 1, 4, 7, 9, 6, 7 };

        Arrays.sort(i); // default natural sorting order
        System.out.println(Arrays.binarySearch(i, 4));
        System.out.println(Arrays.binarySearch(i, 10));

        String[] s = { "X", "Z", "M", "P", "L" };

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

        System.out.println();

        Arrays.sort(s, new MyComparator6());

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }

        System.out.println();

        System.out.println(Arrays.binarySearch(s, "P", new MyComparator6()));


        
    }

}
