package oops;

public class Test1 {

    public static void main(String[] args) {
        String str1 = new String("Ram kumar maniari");
        String str2 = str1.concat(" Sitamarhi");
        String str3 = str2.concat(" riga road");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        StringBuffer sb1 = new StringBuffer("java developer");
        StringBuffer sb2 = sb1.append(" Spring core developer");
        StringBuffer sb3 = sb2.append(" spring boot developer");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }

}
