package exceptionHandling;

public class Q4 {
	
	public static String parseAndMultiply(String input) {
		try {
			int value = Integer.parseInt(input);
			return String.valueOf(value*10);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return "Error: Invalid input";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(parseAndMultiply("5"));
		
		System.out.println(parseAndMultiply("abc"));

	}

}
