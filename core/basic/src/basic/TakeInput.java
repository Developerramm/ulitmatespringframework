package basic;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user : ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("the sum of these number is : " + sum);


        sc.close();
    }

}
