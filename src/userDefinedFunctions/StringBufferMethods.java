package userDefinedFunctions;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer("Mumbai is world trade centre");
		
		
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf("m"));
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,15));
		str.append(" and also beautiful place");
		str.setCharAt(3, 'A');
//		String[] split=str.split(" ");
//		for(String x:split) {
//			System.out.print(x+"\t");
//		}
		System.out.println();
		System.out.println("--------------------------------------");
//		String join=String.join(":",split);
//		System.out.println(join);
		
		System.out.println("--------------------------------------");
		
		String str1 = "Hello";
		String str2 = "hello";
		
		System.out.println(str1.compareTo(str2)); // ( ASCII(h)-ASCII(H) == -32 )
		
		System.out.println("--------------------------------------");
		
		StringBuffer sb34 = new StringBuffer("abcdef"); // default capacity 16
		
		System.out.println(sb34.capacity());
		
		System.out.println(sb34.insert(3, "xyz"));
		
		
		System.out.println(sb34.reverse());
		
		System.out.println(sb34.delete(1, 4));
		
		System.out.println(sb34.deleteCharAt(2));
		
		System.out.println("--------------------------------------");
		
		StringBuffer sb12=new StringBuffer(1000);
		System.out.println("Initial capacity");
		System.out.println(sb12.capacity());
		sb12.append("abc");
		sb12.trimToSize();
		System.out.println("Current capacity");
		System.out.println(sb12.capacity());
		
	}

}
