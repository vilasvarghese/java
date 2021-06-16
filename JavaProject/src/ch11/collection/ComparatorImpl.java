package ch11.collection;

import java.util.*;

public class ComparatorImpl {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		//From jdk 1.7 we need not mention generics on right side.
		
		list.add(123);
		list.add(3841);
		list.add(349);
		list.add(23497);
		list.add(3532);
		list.add(238);
		//arrayList maintains the insertion order
		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
		
		//Reverse 
		Collections.reverse(list);
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println(" ");

		Collections.sort(list, new CompareImpl());
		for (int i : list) {
			System.out.println(i);
		}

		System.out.println(" ");
		//Custom sort - sort based on the value of last digit
		Collections.sort(list, (o1, o2)-> {
			return o1%10>o2%10?1:-1;
		});
		for (int i : list) {
			System.out.println(i);
		}
		
		
	}
}
