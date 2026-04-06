package basic;

public class AllTest {

    public static void main(String[] args) {
        Course c1 = new Course("11", "java", 1000);
        Course c2 = new Course("12", "Spring boot", 5000);
        Course c3 = new Course("13", "Microservices", 2000);
        Course c4 = new Course("14", "Angular", 2000);
        Course c5 = new Course("15", "DevOps", 1000);

        Course[] courses = {c1,c2,c3,c4,c5};

        Student student = new Student("1", "Ram kumar", "Delhi", courses);

        System.out.println(student);
    }

}
