package inner;

class A {
    int i = 10;

    void m1() {
        System.out.println("A.m1()");
    }

    class B {
        int j = 20;

        void m2() {
            System.out.println("A.B.m2()");
            System.out.println(i);
            m1();
        }
    }
}

public class Test {

    public static void main(String[] args) {
        System.out.println("ram kumar maniyari ");

        A a = new A();

        System.out.println(a.i);
        a.m1();

        // System.out.println(a.j);

        A.B ab = new A().new B();

        System.out.println(ab.j);
        ab.m2();

        // System.out.println(ab.i);

        A.B ab1 = a.new B();
        System.out.println(ab1.j);
        ab1.m2();
    }

}
