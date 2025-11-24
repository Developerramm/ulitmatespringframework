package operators;

public class Practice1 {

    public static void main(String[] args) {
        Float a = (float) (7 / 4.0f * 9 / 2.0f);
        System.out.println(a);

        char grade = 'B';
        grade = (char) (grade + 8);

        System.out.println("My grade is " + grade);

        // decrypting the grade
        System.out.println((char) (grade - 8));
    }

}
