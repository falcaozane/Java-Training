package stringPractice;

public class Q1 {
	
	public static String removeChar(String s, char a) {
		String str = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				continue;
			}
			str+=s.charAt(i);
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeChar("hello world", 'o'));

	}

}
