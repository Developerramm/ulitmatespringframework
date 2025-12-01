import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();

        ht.put(new Temp2(12), "A");
        ht.put(new Temp2(13), "B");
        ht.put(new Temp2(14), "Z");
        ht.put(new Temp2(10), "X");
        ht.put(new Temp2(35), "C");

        System.out.println(ht);

        System.out.println(5 % 11);
    }

}
