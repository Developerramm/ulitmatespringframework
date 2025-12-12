package OOPs;

class MyMath {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum is " + c);
    }

}

public class ArgPassDemo {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        m.add(10, 20);
    }

}
