package thread;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        System.out.println("Thread details is : " + this);
    }

    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(500);
            }
            System.out.println(getName() + " finished ");

        } catch (InterruptedException e) {
            System.out.println("child thread interrupted");
            e.printStackTrace();
        }
    }

}

public class UseMyThread {

    public static void main(String[] args) {

        MyThread m1 = new MyThread("child");
        m1.start();

        try {

            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
            System.out.println("main thread finished");

        } catch (Exception e) {
            System.out.println("main thread interrupted ");
            e.printStackTrace();
        }

    }

}
