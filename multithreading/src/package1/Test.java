package package1;

class WelcomeTread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("welcome thread ");
        }
    }

}

public class Test {

    public static void main(String[] args) {
        System.out.println("Multithreading coding in java ");

        WelcomeTread welcomeTread = new WelcomeTread();
        welcomeTread.start();

        for(int i = 0; i<10; i++){
            System.out.println(i + 1);
        }

    }

}
