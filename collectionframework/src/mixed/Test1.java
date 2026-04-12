package mixed;

import java.util.Comparator;
import java.util.TreeSet;

// class MyComparator implements Comparator<Student>{

//     @Override
//     public int compare(Student o1, Student o2) {
        
//         return o1.name.compareTo(o2.name);
//     }
    
// }

class Student {


    String id;
    String name;
    String address;


    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "] \n";
    }

}

public class Test1 {

    public static void main(String[] args) {

        Student s1 = new Student("222", "Ram", "Nodia");
        Student s2 = new Student("343", "Delhi", "Mohit");
        Student s3 = new Student("532", "Sarita", "Sitamarhi");
        Student s4 = new Student("1034", "Sudhir", "Pune");
        Student s5 = new Student("99", "Rohan", "Gualiar");

        // MyComparator mc = new MyComparator();

        // Comparator<Student> MyComp = new Comparator<Student>() {

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.name.compareTo(o2.name);
        //     }
            
        // };


        // TreeSet<Student> ts = new TreeSet<Student>(MyComp);
        
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
            
        });
        ts.add(s5);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);

        
    }

}
