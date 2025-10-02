package test;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Implicit type casting
		byte b=125;
		int i=b; //converting a variable from byte to integer
		System.out.println("converting the byte to integer "+i);
		
		float f=b;
		System.out.println("converting the byte to float "+f);
		
		//Explicit type casting
		//Option1
		int ii=65;
		byte bb=(byte) ii;
		char cc =(char)ii;
		
		System.out.println("byte bb: "+bb);
		System.out.println("char cc: "+cc);    
		
		// Ascii numbers: upper case: 65 to 96, lower case: 97 to 122
		
		//option2
		byte iii=65;
		byte bbb=iii;
		System.out.println("byte bbb: "+bbb);

		int iiii=130;
		byte bbbb=(byte)iiii;
		System.out.println("converting int to byte: "+bbbb); //-126 because limit of byte is 127
		
		System.out.println(2^5);
	}

}
