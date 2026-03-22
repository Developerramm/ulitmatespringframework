package nestedtrycatch;

public class Demo2 {

    public static void main(String[] args) {
        System.out.println("Try catch finally demo ");

        try {
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally blick");

            try {
                System.out.println("inside try try ");
            } catch (Exception e) {
                System.out.println("inside try catch block");
            } finally {
                System.out.println("inside try finally");
            }
        }

        System.out.println("bahar ");
    }

}
