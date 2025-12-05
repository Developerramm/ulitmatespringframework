package string;

public class Practice1 {

    public static void main(String[] args) {
        
        String str = "Ram kumar maniyari sitamarhi";

    //    str = str.toLowerCase();

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        str = "    ram     kumar maniyari   ";
        str = str.replace(" ", "-");
        System.out.println(str);

        str = "Dear <|name|> , Thanks a lot";

        str = str.replace("<|name|>", "Ram kuamr");
        System.out.println(str);

        str = "  ram kumar maniyari  ";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }

}
