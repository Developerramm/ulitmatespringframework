package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<String,String>();

        mp.put("A1", "AAA");
        mp.put("B1", "BBB");
        mp.put("E1", "EEE");
        mp.put("D1", "DDD");
        mp.put("C1", "CCC");

        System.out.println(mp);

        System.out.println(mp.containsKey("B1"));
        System.out.println(mp.containsValue("DDD"));
        System.out.println(mp.containsValue("Ram kumar"));

        System.out.println(mp.keySet());

        Set<String> set = mp.keySet();

        System.out.println("-----------------------------");
        System.out.println(set);

        Collection<String> arr = mp.values();

        System.out.println(arr);
    }

}
