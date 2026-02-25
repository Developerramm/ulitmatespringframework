package oops;

class A{

    public String toString(){
        return "Ram kumar java tutorial";
    }

}

class Employee{
    String id = "E133";
    String name = "Ram kumar";
    String salary = "4342435";
    String address = "Noida";


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }
}
public class Test {

    public static void main(String[] args) {

        A a = new A();

        String ref = a.toString();
        System.out.println(ref);


        System.out.println(a.toString());

        System.out.println(a);


        Employee employee = new Employee();

        System.out.println(employee);


        String str = new String("Ram kumar maniayri");
        System.out.println(str);

        Integer integer = new Integer(24342);
        System.out.println(integer);
        

        Exception e = new Exception("My own Exception");
        System.out.println(e);

        Thread t = new Thread();
        System.out.println(t);
    }

}
