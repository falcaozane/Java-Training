package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Opne DB");
		
		try {
			
			System.out.println(8/0);
			System.out.println("excute sql queries!");
			
		}catch(Throwable t) {
			System.out.println(4/0);
		}
		
		finally {
			// TODO: handle finally clause
			System.out.println("Close DB");
		}

	}

}
