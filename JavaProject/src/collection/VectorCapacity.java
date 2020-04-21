package collection;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		for (int i = 0; i < 15; i++) {
			v.add(i);
		}
		System.out.println(v.capacity());

	}
}
