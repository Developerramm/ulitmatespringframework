package exception;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.out.println("Ram kumar maniyari");
		
		Thread t = new Thread();
		System.out.println(t.getPriority());
		
		t.setPriority(7);
		System.out.println(t.getPriority());
		
		t.setPriority(11);
		System.out.println(t.getPriority());
	}

}
