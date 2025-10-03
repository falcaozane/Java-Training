package stringPractice;

public class Q3 {
	
	public static boolean rotationChecker(String a, String b) {
		

//		for (int i = 0; i < a.length(); i++) {
//		      char ch = a.charAt(i);
//		       if (!b.contains(String.valueOf(ch))) {
//		          return false;
//		       }
//		}
//		return true;

		
		if(a.length()!=b.length()) {
			return false;
		}
		
		return (a+a).contains(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(rotationChecker("waterbottle", "erbottlewat"));

	}

}
