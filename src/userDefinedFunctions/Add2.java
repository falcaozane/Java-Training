package userDefinedFunctions;

public class Add2 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		System.out.println("A");
		System.out.println(sum2(num1,num2));
		
		int totalSum = sum2(num1,num2)+50;
		System.out.println("B");
		System.out.println(totalSum);

		
	}
	
	public static int sum2(int n1, int n2) { //void means nothing is returning when func is called
		int sum = n1+n2;
		//System.out.println("sum ="+sum);
		return sum;

		
	}

}
