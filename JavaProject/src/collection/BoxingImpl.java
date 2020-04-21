package collection;

import java.util.ArrayList;

public class BoxingImpl {

	public static void main(String[] args) {
		
		int i =10;
		Integer integer = new Integer(i);//boxing or wrapping
		int x = integer.intValue();
		
		//From java 5 you can do the following
		Integer int1 = 15;//autoboxing.
		int y = int1;//unboxing.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		System.out.println(x);
		System.out.println(y);
		System.out.println(int1);
		
		for (int m : list) {//unboxing
			System.out.println(m);
		}
	}
}