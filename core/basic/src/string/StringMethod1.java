package string;

public class StringMethod1 {
    public static void main(String[] args) {

        String str = "this is simple string here";

        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 12));

        System.out.println(str.subSequence(5, 20));

        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("e"));

        System.out.println(str.replace("s", "d"));
        System.out.println(str);
        System.out.println(str.replace("s", "r"));

        System.out.println(str.startsWith("this"));

        System.out.println(str.startsWith("rrr"));

        System.out.println(str.endsWith("here"));
        System.out.println(str.endsWith("re"));

        System.out.println(str.endsWith("e"));

        System.out.println(str.charAt(5));
        System.out.println(str.charAt(10));

        // System.out.println(str.split(" "));

    }

}
