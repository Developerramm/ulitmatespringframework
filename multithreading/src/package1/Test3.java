package package1;

class Demo implements Runnable{

    @Override
    public void run() {
       for(int i = 0; i<10; i++){
        System.out.println("Demo thread ");
       }
    }
    
}

public class Test3 {

    public static void main(String[] args) {
        
        // Thread t = new Thread();
        // System.out.println(t);

        // Thread t1 = new Thread("ramkumar");
        // System.out.println(t1);


        Demo d = new Demo();
        Thread t = new Thread(d,"Ram kumar");
        System.out.println(t);
        t.start();

        


        for(int i = 0; i<10; i++){
            System.out.println("Main thread");
        }
    }

}
