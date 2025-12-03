import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

    public static void main(String[] args) {
        String[] s = {"K","X","Z","A"};

        System.out.println(s);

        List l = Arrays.asList(s);
        System.out.println(l);
    }

}
