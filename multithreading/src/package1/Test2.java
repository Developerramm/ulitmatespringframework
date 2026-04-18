package package1;

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("my thread is executed");
        }
    }

}

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Multithreading programming in java ");

        MyThread mt = new MyThread();

        Thread t = new Thread(mt);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is executed");
        }

    }

}
