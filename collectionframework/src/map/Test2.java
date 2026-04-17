package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("map interface study here below ");

        Map<String, String> mp = new HashMap<>();
        mp.put("R", "Ram kumar");
        mp.put("S", "Sarita kumari");
        mp.put("A", "Akash kumar");
        mp.put("M", "Mohit kumar");
        mp.put("k", "Kapar");
        mp.put("Y", "Yadav");

        System.out.println(mp);

        System.out.println(mp.entrySet());

        Set<Map.Entry<String, String>> st = mp.entrySet();

        System.out.println(st);

        Iterator<Map.Entry<String, String>> it = st.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
