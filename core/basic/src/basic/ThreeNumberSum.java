package basic;

import java.util.Scanner;

public class ThreeNumberSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");

        int number1 = sc.nextInt();
        System.out.println("Enter number2 : ");
        
        int number2 = sc.nextInt();
        System.out.println("Enter number3 : ");
        int number3 = sc.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("the sum is " + sum);

        sc.close();

    }

}
