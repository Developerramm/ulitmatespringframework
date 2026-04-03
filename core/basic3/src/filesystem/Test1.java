package filesystem;

import java.io.FileInputStream;

public class Test1 {

    public static void main(String[] args) throws Exception {
        System.out.println("file input stream example ");

        FileInputStream fs = new FileInputStream("welcome.txt");

        int size = fs.available();
        System.out.println(size);

        byte[] bytes = new byte[size];

        fs.read(bytes);

        String data = new String(bytes);

        System.out.println(data);

        fs.close();
    }

}
