package practice;



class A {
    static {
        System.out.println("static block of A");
    }
}

class B extends A {
    static {
        System.out.println("static block of B");
    }
}

class C extends B {
    static {
        System.out.println("static block of C");
    }
}

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Ram kumar maniyari");

        C c = new C();

        System.out.println(c.getClass());
    }

}
