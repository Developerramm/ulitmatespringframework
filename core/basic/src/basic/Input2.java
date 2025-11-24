package basic;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();


        System.out.println("your name is " + name.toLowerCase());
        System.out.println("Youar name is " + name.toUpperCase());

        sc.close();
        
    }

}
