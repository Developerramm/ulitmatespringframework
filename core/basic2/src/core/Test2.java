package core;

class A {
    static {
        System.out.println("static block of class A");
    }

    static int i = m1();

    static int m1() {
        System.out.println("m1 method in class A");
        return 10;
    }
}

class B extends A {

    static int j = m2();

    static {
        System.out.println("static block of class B");
    }

    static int m2() {
        System.out.println("static method of class B");
        return 20;
    }
}

class C extends B {
    static int k = m3();

    static {
        System.out.println("static block of class C");
    }

    static int m3() {
        System.out.println("static method of class C");
        return 30;
    }
}

public class Test2 {

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.getClass());

    }

}
