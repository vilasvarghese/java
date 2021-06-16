package ch03.java5.overloading;

import java.awt.Dimension;

class ReferenceTest {
	public static void main(String[] args) {
		Dimension a = new Dimension(5, 10);
		System.out.println("a.height = " + a.height);
		Dimension b = a;
		b.height = 30;//a.height also got modified when b.height was modified.
		System.out.println("a.height = " + a.height + " after change to b");
	}
}