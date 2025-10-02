package test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		
		System.out.println("Original string: "+str);
		
		String reversed = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed +=str.charAt(i);
		}
		
		System.out.println("Reversed string: "+reversed);
		
		
		if (reversed.equals(str)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
