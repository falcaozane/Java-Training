package collectionCap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("C");
		ar.add("D");
		ar.add("E");
		ar.add("A");
		ar.add("B");
		
		for(String el:ar) {
			System.out.println(el);
		}
		
		
		
		Collections.sort(ar);
		
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(String el:ar) {
			System.out.println(el);
		}
		
		Iterator<String> it =  ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ar.remove(0);
		
		ar.set(0, "Z");
		
		//ar.clear();
		
		Object[] obj = ar.toArray();
		
		for(Object o: obj) {
			System.out.println(o);
		}
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0;i<=10;i++) {
			num.add((int)(Math.random()*100));
//			num.add(i);
		}
		
		System.out.println(num);
		num.sort((a,b)->a.compareTo(b)); // ascending order for desc (a,b)-> -a.compareTo(b)
		System.out.println(num);
		num.sort((a,b)->-a.compareTo(b));
		System.out.println(num);
	}

}
