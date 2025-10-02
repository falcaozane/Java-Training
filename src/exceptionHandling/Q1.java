package exceptionHandling;

public class Q1 {
	
	public static String getStringLength(String s) {
		try {
			
			return String.valueOf(s.length());
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Error: Null value passed";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getStringLength("Zane"));
		
		System.out.println(getStringLength(null));

	}

}
