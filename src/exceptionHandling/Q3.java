package exceptionHandling;


class InvaildAgeException extends Exception{
	public InvaildAgeException(String message) {
		super(message);
	}
}

public class Q3 {
	
	public static String checkAge(int age) throws InvaildAgeException{
		if(age<18) {
			throw new InvaildAgeException("Age must be 18 or above");
		}
		
		return "Eligible for voting";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(checkAge(20));
			System.out.println(checkAge(15));
		} catch (InvaildAgeException e) {
			// TODO: handle exception
			System.out.println("InvailAgeException: "+e.getMessage());
		}
		

	}

}
