package thread;

class MyThread3 implements Runnable {

    private Thread th;

    public MyThread3(String name) {
        th = new Thread(this, name);
        th.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(th.getName() + ":" + i);
                Thread.sleep(1000);
            }
            System.out.println(th.getName() + " finished");
        } catch (Exception e) {
            System.out.println(th.getName() + " interrupted");
            e.printStackTrace();
        }
    }

}

public class UseMyThread3 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        MyThread3 m1 = new MyThread3("child1");
        @SuppressWarnings("unused")
        MyThread3 m2 = new MyThread3("child2");
        @SuppressWarnings("unused")
        MyThread3 m3 = new MyThread3("child3");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is finished");
    }

}
