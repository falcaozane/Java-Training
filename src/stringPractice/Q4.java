package stringPractice;

public class Q4 {
	
	public static int wordsEndingwith(String s, String a) {
		
		int count = 0;
		
		String[] words = s.split(" ");
		
		for(String word: words) {
			System.out.println(word);
			if(!word.isEmpty() && word.endsWith(a)) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(wordsEndingwith("The quick brown fox jumps", "s"));

	}

}
