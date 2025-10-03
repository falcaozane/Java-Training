package stringPractice;

public class Q2 {
	
	public static String capitalize(String s) {
		
		String[] words = s.split(" ");
		
		StringBuilder res = new StringBuilder();
		
		for(String word: words) {
			if(!word.isEmpty()) {
				res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}
		 
		
		return res.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitalize(" hello world "));
	}

}
