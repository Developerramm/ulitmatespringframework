package filesystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ram kumar maniyari sitamarhi");

        FileInputStream fis = new FileInputStream("welcome.txt");

        int size = fis.available();

        byte[] b = new byte[size];

        fis.read(b);

        FileOutputStream fos = new FileOutputStream("abc.txt");

        fos.write(b);

        System.out.println("Data transfer ");


        fos.close();

        fis.close();
    }

}
