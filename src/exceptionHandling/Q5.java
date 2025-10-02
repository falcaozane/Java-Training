package exceptionHandling;

public class Q5 {
	
	public static String nestedExceptionHandling(String a, String b, int[] arr, int index) {
		try {
			
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			
			try {
				
				int result = num1/num2;
				
				try {
					
					int element = arr[index];
					
					return result + " and element: "+element;
					
				} catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					return "Error: Index out of bounds";
				}
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				return "Error: Division by zero";
			}
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return "Error: Invalid input format";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4};
		
		int[] arr2 = {1,2,3};
		
		System.out.println(nestedExceptionHandling("20", "5", arr1, 1));
		System.out.println(nestedExceptionHandling("10", "0", arr2, 5));

	}

}
