package basic;

public class Test1 {

    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 20;
        a[1] = 30;
        a[2] = 40;
        a[3] = 50;
        a[4] = 100;

        System.out.println(a);

        // negativeArraySizeException
        // int[] arr = new int[-50];
        // System.out.println(arr);

        int[] arr = {20,30,40,50,60};

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int i = 0;

        while(i<arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        System.out.println("____________________________");

        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
