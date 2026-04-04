package basic;

public class Test {

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 50 };
        System.out.println(a);

        double[] d = { 12.30, 34.43, 56.09 };
        System.out.println(d);

        float[] f = { 20.3f, 45.5f, 22.09f };
        System.out.println(f);

        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();

        // System.out.println(a[30]);

        System.out.println(a[a.length - 2]);
        // System.out.println(a[a.length]);
    }

}
