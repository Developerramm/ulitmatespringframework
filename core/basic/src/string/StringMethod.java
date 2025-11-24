package string;

public class StringMethod {
    public static void main(String[] args) {

        String a = "ram";
        String b = new String("ram");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.length());

        String c = a + " Kumar";
        System.out.println(c);

        // System.out.println(c[0]);

        System.out.println(c.charAt(0));

        for(int i = 0; i<c.length(); i++){
            System.out.print(c.charAt(i) + " ");
        }
        System.out.println();

        System.out.println(a.toCharArray());

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        String village = "       maniyari sitamarhi riga road     ";

        System.out.println(village);

        System.out.println(village.trim());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
