package string;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        // String name = new String("Ram kumar");
        String name = "Ram kumar";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        System.out.println("You enter " + st);

        sc.close();

    }

}
