package filesystem;

import java.io.FileReader;
import java.io.FileWriter;

public class Test6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ram kumar");

        FileReader fr = new FileReader("welcome.txt");

        String data = "";
        int val = fr.read();

        while(val != -1){
            data = data + (char) val;
            val = fr.read();
        }

        FileWriter fw = new FileWriter("xyz.txt");
        char[] ch = data.toCharArray();
        fw.write(ch);
        System.out.println("Data transfer ");

        fw.close();

        fr.close();
    }

}
