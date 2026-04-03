package filesystem;

import java.io.FileOutputStream;

public class Test {

    public static void main(String[] args) throws Exception {
        
        FileOutputStream fos = new FileOutputStream("welcome.txt",true);

        String data = "Ram kumar maniyari developer here";

        byte[] b = data.getBytes();

        fos.write(b);

        System.out.println("Data transfer to the file ");

        fos.close();
    }

}
