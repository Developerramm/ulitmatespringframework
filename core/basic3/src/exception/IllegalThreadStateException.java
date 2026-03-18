package exception;

class WelcomeThread extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Welcome thread " + i );
		}
		
	}
}

public class IllegalThreadStateException {
	
	public static void main(String[] args) {
		
		WelcomeThread welcomeThread = new WelcomeThread();
		welcomeThread.start();
//		WelcomeThread.setDaemon(true);
		
		for(int i = 0; i<10; i++) {
			System.out.println("main thread " + i + " ");
		}
	}

}
