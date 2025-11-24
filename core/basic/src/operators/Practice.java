package operators;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalMarks = 0.0f;
        float s1,s2,s3,s4,s5;

        System.out.println("Enter subject1 obtained marks : ");
        s1 = sc.nextFloat();
        System.out.println("Enter subject2 obtained marks : ");
        s2 = sc.nextFloat();
        System.out.println("Enter subject3 obtained marks : ");
        s3 = sc.nextFloat();
        System.out.println("Enter subject4 obtained marks : ");
        s4 = sc.nextFloat();
        System.out.println("Enter subject5 obtained marks : ");
        s5 = sc.nextFloat();


        totalMarks = s1 + s2 + s3 + s4 + s5;

        float percentage = totalMarks / 5;

        System.out.println("Your obtained percentage is " + percentage);

        sc.close();

    }

}
