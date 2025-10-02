package userDefinedFunctions;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mumbai is world trade centre";
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.equalsIgnoreCase("Mumbai is world trade centre"));
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('t'));
		System.out.println(str.replace('a','u'));
		System.out.println(str.replace("Mumbai", "Bangalore"));
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,15));
		String[] split=str.split(" ");
		for(String x:split) {
			System.out.print(x+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------");
		String join=String.join(":",split);
		System.out.println(join);
		
		System.out.println("--------------------------------------");
		
		String str1 = "Hello";
		String str2 = "hello";
		
		System.out.println(str1.compareTo(str2)); // ( ASCII(h)-ASCII(H) == -32 )
		

	}

}
