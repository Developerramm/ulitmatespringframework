package OOPs;

public class UseAddition {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum of 10 and 20 is " + obj.add(10, 20));
        System.out.println("Sum of 12.4 and 13.5 is " + obj.add(12.4, 13.5));
        System.out.println("Sum of ram and kumar is " + obj.add("Ram ", "kumar"));

        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40));
    }

}
