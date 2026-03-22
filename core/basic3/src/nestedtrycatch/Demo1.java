package nestedtrycatch;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("ram kumar");
        System.out.println("Before outer try");

        try {
            System.out.println("inside outer try");
        } catch (Exception e) {

            System.out.println("Inside outer catch block");

            try {
                System.out.println("Inside inner try");
            } catch (Exception e1) {
                System.out.println("Inside inner catch block");
            } finally {
                System.out.println("Inside inner finally");
            }
        } finally {
            System.out.println("Inside outer finally block");
        }

        System.out.println("sab kuchh se bahar ");
    }

}
