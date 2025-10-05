package collectionCap;

import java.util.*;

public class ReverseList {
	
	public static List<String> reverseList(List<String>list){
		List<String>newList = new ArrayList<>();
		
		int n = list.size()-1;
		
		for(int i=n;i>=0;i--) {
			newList.add(list.get(i));
		}
		
		return newList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = Arrays.asList("apple","mango","banana");
		
		System.out.println(reverseList(arr));
	}

}
