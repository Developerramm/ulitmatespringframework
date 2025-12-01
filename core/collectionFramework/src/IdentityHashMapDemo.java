
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        IdentityHashMap h = new IdentityHashMap<>();
        // IdentityHashMap h = new HashMap<>();

        h.put(i1, "Ram");
        h.put(i2, "Mohan");

        System.out.println(h);
    }

}
