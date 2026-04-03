package filesystem;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {
        System.out.println("File writer ");

        FileWriter fw = new FileWriter("welcome.txt");

        String data = "SpringBoot Developer";

        char[] chars = data.toCharArray();

        fw.write(chars);

        System.out.println("File write successfully");

        fw.close();
    }

}
