package basic;

public class Test2 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{1,3,5},{2,6,4},{0,3,5}};
        System.out.println(arr);
        System.out.println(arr.length);

        System.out.println(arr[0].length);

        System.out.println("print array");

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("printing array using for each loop");
        System.out.println("----------------------------------");

        
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

}
