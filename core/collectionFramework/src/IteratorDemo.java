import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for (int i = 1; i <= 20; i++) {
            v.add(i * 10);
        }

        System.out.println(v);

        Iterator<Integer> it = v.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        Student s1 = new Student("Ram", 100);
        Student s2 = new Student("Mohan", 122);

        Vector<Student> student = new Vector<>();
        student.add(s1);
        student.add(s2);

        Iterator<Student> it1 = student.iterator();

        while (it1.hasNext()) {
            Student s = it1.next();
            System.out.println(s);
            it1.remove();
        }

        System.out.println("-------------------------");
        System.out.println(student);

        System.out.println(student.size());
    }

}
