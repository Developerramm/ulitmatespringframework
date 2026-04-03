package filesystem;

import java.io.FileReader;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) throws IOException {
        System.out.println("File Reader");

        FileReader fr = new FileReader("welcome.txt");

        String data = "";

        int val = fr.read();

        while(val != -1){
            data = data + (char)val;
            val = fr.read();
        }

        System.out.println(data);

        fr.close();
    }

}
