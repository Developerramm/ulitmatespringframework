package operators;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if(number > 8){
            System.out.println("number is greater than 8");
        }else{
            System.out.println("number is less than 8 ");
        }

        sc.close();
    }

}
