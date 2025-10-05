package stringPractice;

public class Q5 {
	
	public static String replaceString(String s, String match, String rep) {

		//return s.replace(match, rep);
		
		String newStr = "";
		
		int i=0;
		
		while(i<=s.length()-match.length()) {
			String sub = s.substring(i,i+match.length());
			if(sub.equals(match)) {
				newStr+=rep;
				i+=match.length();
			}else {
				newStr +=s.charAt(i);
				i++;
			}
		}
				
		
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replaceString("banana", "na", "xy"));

	}

}
