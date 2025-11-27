import java.util.Enumeration;
import java.util.Vector;

public class Vectordemo1 {

    public static void main(String[] args) {
        
        Vector<Student> v = new Vector<Student>();
        Student s1 = new Student("Ram kumar", 1001);
        Student s2 = new Student("Mahi", 333);

        v.add(s1);
        v.add(s2);

        System.out.println(v);

        for (Student student : v) {
            System.out.println(student);
        }

        System.out.println("_______________________");

        Enumeration<Student> it = v.elements();

        while (it.hasMoreElements()) {
            System.out.println(it.nextElement());
        }
    }

}
