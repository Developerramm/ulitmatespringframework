import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {
        TreeMap<String,String> m = new TreeMap<String,String>();

        m.put("a", "Ram");
        m.put("c", "amit");
        m.put("b", "raj");
        m.put("d", "ankit");

        System.out.println(m);
        System.out.println(m.ceilingKey("c"));
        System.out.println(m.higherKey("c"));

        System.out.println(m.higherEntry("a"));
    }

}
