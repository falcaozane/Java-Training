package exceptionHandling;


public class UncaughtException {
 
	public static void main(String[] args) {
		System.out.println("A");
		
		try {
			System.out.println(8/0);   //exception
			System.out.println("try...block");
		}
		
		catch(Throwable t){
			System.out.println("block...block");
			System.out.println(t.getMessage());
		}
		
		System.out.println("B");
	}
}
 
