package collectionCap;

import java.util.*;

public class SecondLargestFinder {
	
	public static String findSecondLargest(List<Integer>list) {
		
		
		
		if(list==null || list.size()<2) {
			return "Error: List has fewer than two elements";
		}
		
		Integer largest = null;
		Integer secondLargest = null;
		
		for(Integer num: list) {
			if(largest==null || num>largest) {
				secondLargest = largest;
				largest = num;
			}else if(!num.equals(largest) && (secondLargest==null && num>secondLargest)) {
				secondLargest = num;
			}
		}
		
		if(secondLargest==null) {
			return "Error: List has fewer than two elements";
		}
		
		return String.valueOf(secondLargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> input1 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Output 1: " + findSecondLargest(input1));  // Output: 40

        // Sample Input 2
        List<Integer> input2 = Arrays.asList(5);
        System.out.println("Output 2: " + findSecondLargest(input2));  // Output: Error


	}

}
