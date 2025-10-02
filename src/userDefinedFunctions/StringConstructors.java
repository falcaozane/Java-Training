package userDefinedFunctions;

public class StringConstructors {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String();
		String s2=s1.concat("vansh");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuffer sb= new StringBuffer("stringbuffervalue");
		String s3=new String(sb);
		System.out.println(s3);
		
		StringBuilder sbb=new StringBuilder("stringbuildervalue");
		String s4=new String(sbb);
		System.out.println(s4);
		
		char[] ch= {'j','a','v','a'};
		
		String chStr=new String(ch);
		System.out.println(chStr);
		
		byte[] b= {65,66,67,68};
		String byStr=new String(b);
		System.out.println(byStr);
	}

}
