package exception;

public class FileNotFound {
	
	public static void main(String[] args) {
		System.out.println("This is exception class ");
		
		System.out.println("Before after try");
		
		try {
			System.out.println("Inside outer try");
			
			try {
				System.out.println("Inside nested try");
			} catch (Exception e) {
				System.out.println("Inside nested catch");
			}
			finally {
				System.out.println("Inside nested finally");
			}
			System.out.println("nested try ke baad outer try ke ander");
		} catch (Exception e) {
			System.out.println("outer catch me");
		}finally {
			System.out.println("outer finally me ");
		}
		
		System.out.println("outer try ke baad ");
	}

}
