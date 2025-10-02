package userDefinedFunctions;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "He is a very very good boy, isn't he?";
		
		String[] words=s.split("\\W+");
		int wordCount = words.length;
		System.out.println(wordCount);
		for(String word:words) {
			System.out.println(word);
		}

	}

}
