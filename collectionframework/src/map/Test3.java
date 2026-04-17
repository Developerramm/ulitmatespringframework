package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("HashMap in map interface");

        HashMap<String, Integer> student = new HashMap<>();

        student.put("Ram kumar", 400);
        student.put("Rahul", 300);
        student.put("Modi", 5);
        student.put("Putin", 500);
        student.put("Sarita", 1000);
        student.put("Ram kumar", 2000);

        student.put(null, 50000);

        System.out.println(student);

        LinkedHashMap<String,Integer> lmp = new LinkedHashMap<>();

        lmp.put("Ram", 100);
        lmp.put("saria", 100);
        lmp.put("mohan", 100);
        lmp.put("Akash", 100);
        lmp.put("Deva", 100);
        lmp.put("Sam", 100);
        lmp.put("Babu rav", 100);

        System.out.println(lmp);


    }

}
