package instancecontext;

class A2 {

    A2() {
        System.out.println("A2.A2()");
    }

    int m1() {
        System.out.println("A2.m1()");
        return 10;
    }

    {
        System.out.println("A2.enclosing_method()");
    }

    int i = m1();

}

class B2 extends A2 {

    B2() {
        System.out.println("B2.B2()");
    }

    {
        System.out.println("B2.enclosing_method()");
    }

    int m2() {
        System.out.println("B2.m2()");
        return 20;
    }

    int j = m2();

}

class C2 extends B2 {

    C2() {
        System.out.println("C2.C2()");
    }

    int m3() {
        System.out.println("C2.m3()");
        return 30;
    }

    int k = m3();

    {
        System.out.println("C2.enclosing_method()");
    }

}

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Instance context ");

        // C c = new C();
        // C c1 = new C();

        // System.out.println(c.getClass().getName());
        // System.out.println(c1.getClass().getName());

        C2 c = new C2();
        System.out.println(c.getClass().getName());

        C2 c1 = new C2();
        System.out.println(c1.getClass().getName());
    }

}
