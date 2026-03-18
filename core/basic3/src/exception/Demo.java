package exception;

class Employee{
	
	static {
		System.out.println("Employee class is loading.....");
	}
	
	private Employee() {
		
		System.out.println("Employee object is creating...");
	}
}

public class Demo {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Exception handling in java");
		
		Class c = Class.forName("exception.Employee");
		
		Object obj = c.newInstance();
		
		System.out.println(obj.getClass().getName());
		
		System.out.println(c.getClass().getName());
	}

}
