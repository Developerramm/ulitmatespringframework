
import java.util.Enumeration;
import java.util.Vector;

public class Demo {

    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();
        v.addElement("Ram kumar");
        v.addElement("priya");
        v.addElement("sumit");
        v.addElement("sajan");

        v.add("oragne");
        v.addElement("Banana");
        v.addElement("Guava");
        v.addElement("mango");
        v.addElement("Cherry");

        System.out.println(v);

        System.out.println(v.get(2).charAt(4));

        // Enumeration it = v.iterator();

        // retrieve data from vector using cursor

        Enumeration<String> e = v.elements();

        System.out.println(e.hasMoreElements());
        System.out.println(e.nextElement());

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();


        Vector<Integer> v1 = new Vector<>();

        for(int i = 1; i<=20; i++){
            v1.addElement(i);
        }

        System.out.println(v1);

        Enumeration<Integer> it = v1.elements();

        while(it.hasMoreElements()){
            Integer data = it.nextElement();
            if(data %2 != 0){
                System.out.print(data + " ");
            }
        }

        System.out.println();
    }

}
