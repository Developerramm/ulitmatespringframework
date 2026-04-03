package filesystem;

import java.io.FileInputStream;

public class Test4 {

    public static void main(String[] args) throws Exception {
        System.out.println("Ram kumar spring boot developer");

        String fileName = args[0];

        FileInputStream fis = new FileInputStream(fileName);
        int size = fis.available();

        byte[] b = new byte[size];

        fis.read(b);

        String data = new String(b);

        System.out.println(data);

        fis.close();
    }

}
