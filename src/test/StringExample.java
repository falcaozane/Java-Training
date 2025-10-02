package test;

// Strings as Array
public class StringExample {

	public static void main(String[] args) {
		String str[]=new String[4];
		
		str[0]="B";
		str[1]="C";
		str[2]="M";
		str[3]="P";
		
		System.out.println("size of array: "+str.length);
		System.out.println("print value at index 3: "+str[3]);  
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		
		//for each loop
		
		System.out.println("For each loop:");
		
		for(String x: str) {
			System.out.println(x);
		}
		
		// Objects in  Java
		
		Object obj[] = {"Banglore",true,23, 44.56};
		
		for(Object element:obj) {
			System.out.println(element);
		}
	}
	
}


