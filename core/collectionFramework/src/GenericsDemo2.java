import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsDemo2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        Collection<String> l1 = new ArrayList<>();

        System.out.println(l);
        System.out.println(l1);

        List<Object> l3 = new ArrayList<Object>();
        l3.add("RAm");
        l3.add(43);

        System.out.println(l3);
    }

}
