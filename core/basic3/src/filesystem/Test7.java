package filesystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test7 {

    public static void main(String[] args) {
        System.out.println("Ram kumar maniyari");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            fis = new FileInputStream("abc.txt");

            int size = fis.available();
            byte[] b = new byte[size];

            fis.read(b);

            fos = new FileOutputStream("xyz.txt");
            fos.write(b);
            System.out.println("Data transfer");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
