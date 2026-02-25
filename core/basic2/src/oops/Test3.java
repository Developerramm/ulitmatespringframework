package oops;

final class Calculator {

    private final int count;

    public Calculator(int count) {
        this.count = count;
    }

    public Calculator increment() {
        Calculator cal = new Calculator(this.count + 1);
        return cal;
    }

    public Calculator decrement() {
        Calculator cal = new Calculator(this.count - 1);
        return cal;
    }

    public int getCount() {
        return count;
    }

}

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Ram kumar ");

        Calculator cal = new Calculator(10);
        System.out.println(cal.getCount());
        System.out.println(cal);

        Calculator calculator = cal.increment();
        System.out.println(calculator.getCount());
        System.out.println(calculator);

        Calculator calculator2 = cal.decrement();
        System.out.println(calculator2.getCount());
        System.out.println(calculator2);

    }

}
