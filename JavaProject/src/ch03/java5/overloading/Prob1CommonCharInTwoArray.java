package ch03.java5.overloading;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Prob1CommonCharInTwoArray {
	
	
	char[] chrArray1 = {'a', 'b', 'c','x'};
	char[] chrArray2 = {'x','y','z'};
	
	public static void main(String[] args) {
		Prob1CommonCharInTwoArray p = new Prob1CommonCharInTwoArray();
		System.out.println("Found common char " +p.simpleMethod());
		System.out.println("Found common char " +p.improvedMethod());

	}
	
	public boolean simpleMethod() {
		//O(n^2)
		for (char c1 : chrArray1) {
			for (char c2 : chrArray2) {
				if (c1 == c2) {
					
					return true;
					//return would return and you don't need to have a break
				}
			}
		}
		return false;

	}
	
	public boolean improvedMethod() {
		//Create an array of alphabets and mark those present as true and others false
		int chr1Length = chrArray1.length;
		Map<Character, Boolean> map = new HashMap<Character, Boolean>(chr1Length);
		int i = 0;
		for (; i < chr1Length; i++) {
			map.put(new Character(chrArray1[i]), new Boolean(true));
		}
		int chr2Length = chrArray2.length;
		
		for (i = 0; i < chr2Length; i++) {
			if (map.containsKey(new Character(chrArray2[i]))) {
				System.out.println("Found the Character");
				return true;
			}
		}
		return false;
		//The time complexity of this is better because it is O(a + b) => O(n) complex.
		//However you may to explain why this is better to the interview because not all interviewers would understand it upfront.
		
		
	}
	
	//Further improve the code with corener case checks, renaming variables with right names.
	//
	public boolean stdFunctions() {
		//int chr1Length = chrArray1.length;
		//O(n log n) complex
		Arrays.sort(chrArray2);
		for (char c : chrArray1) {
			if(Arrays.binarySearch(chrArray2, c) > -1) {
				return true;
			}
		}
		return false;
	}
}