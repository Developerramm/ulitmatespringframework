package practice;

public class Test {

    public static void main(String[] args) {
        System.out.println("Ternary operator");

        int number1 = 10;
        int number2 = 20;

        System.out.println(number1 > number2);

        int min = number1 < number2 ? number1 : number2;

        System.out.println("Min value is " + min);

        int max = number1 < number2 ? number2 : number1;
        System.out.println("max value is " + max);
    }

}
