package instancecontext;

class A {

    A() {
        System.out.println("A.A()");
    }

    

}

class B extends A {

    B() {
        System.out.println("B.B()");
    }

}

class C extends B {

    C() {
        System.out.println("C.C()");
    }

}

public class Test {

    public static void main(String[] args) {
        System.out.println("Instace context in java");

        C c = new C();

        System.out.println(c.getClass().getName());
    }

}
