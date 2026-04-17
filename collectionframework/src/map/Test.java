package map;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        System.out.println("java map interface ");

        Map<String,String> mp = new  HashMap<>();

        mp.put("A", "AAA");
        mp.put("B", "BBB");
        mp.put("E", "EEE");
        mp.put("D", "DDD");
        mp.put("C", "CCC");
        mp.put("B", "Ram kumar");

        System.out.println(mp);

        System.out.println(mp.get("A"));

        System.out.println(mp.get("B"));

        System.out.println("-------------------------");

        System.out.println(mp.remove("B"));
        System.out.println(mp);

        System.out.println("Size of map is " + mp.size());

        System.out.println(mp.isEmpty());

        // mp.clear();
        // System.out.println(mp.isEmpty());

        System.out.println(mp);

    }

}
