package exceptionHandling;

public class Q2 {
	
	public static String calculateAverage(int[] arr) {
		try {
			
			int sum = 0;
			for(int num :arr) {
				sum+=num;
			}
			
			return String.valueOf(sum / arr.length);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			return "Error: Division by zero";
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return "Error: Array index out of bounds";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30};
		
		int[] arr2 = {};
		
		System.out.println(calculateAverage(arr1));
		
		System.out.println(calculateAverage(arr2));

	}

}
