package collectionCap;

import java.util.*;

public class CountFreq {
	
	public static Map<String,Integer> CountFreqElements(List<String> list){
		
		Map<String,Integer> freqMap = new HashMap<>();
		
		for(String ele:list) {
			if(freqMap.containsKey(ele)) {
				freqMap.put(ele, freqMap.get(ele)+1);
			}
			else {
				freqMap.put(ele,1);
			}
		}
		
		return freqMap;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr = Arrays.asList("apple","mango","banana","apple","mango","banana");
		
		Map<String, Integer> output = CountFreqElements(arr);
		
		System.out.println(output);

	}

}
