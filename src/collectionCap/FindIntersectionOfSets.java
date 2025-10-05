package collectionCap;

import java.util.*;

public class FindIntersectionOfSets {
	
	public static Set<Integer> findIntersectionOfSets(Set<Integer>set1,Set<Integer>set2) {
		Set<Integer>intersection = new HashSet<>();
		
		for(Integer element:set1) {
			if(set2.contains(element)) {
				intersection.add(element);
			}
		}
		
		return intersection;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer>set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer>set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));
		
		System.out.println(findIntersectionOfSets(set1, set2));

	}

}
