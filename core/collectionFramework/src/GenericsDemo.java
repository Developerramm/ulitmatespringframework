import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Ram");
        l.add("Shyam");
        // l.add(88);
        l.add("Hemanta vishwasharma");
        l.add("Mana");

        System.out.println(l);
    }

}
