package oops;

class A{

    public String toString(){
        return "Ram kumar java tutorial";
    }

}
public class Test {

    public static void main(String[] args) {

        A a = new A();

        String ref = a.toString();
        System.out.println(ref);


        System.out.println(a.toString());

        System.out.println(a);
        
    }

}
