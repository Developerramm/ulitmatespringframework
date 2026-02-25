package instancecontext;

class A1 {
    A1() {
        System.out.println("A1.A1()");
    }

    int i = m1();

    int m1() {
        System.out.println("A.m1()");
        return 10;
    }

}

class B1 extends A1 {

    {
        System.out.println("B1 enclosing_method()");
        System.out.println("Instace block in class B1");
    }

    int j = m2();

    int m2() {
        System.out.println("A1.m2()");
        return 20;
    }

}

class C1 extends B1 {

    int k = m3();

    int m3() {
        System.out.println("C1.m3()");
        return 30;
    }

    C1() {
        System.out.println("C1.C1()");
    }

    {
        System.out.println("Instace block in class C1");
    }

}

public class Test1 {

    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println(c.getClass().getName());
    }

}
