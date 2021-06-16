package ch01.operators;

public class BitwiseOperator {

	public static void main(String args[]) {
		int i = 10;
		int j = 12;
		System.out.println("i = "+Integer.toBinaryString(i)); 
		System.out.println("j = "+Integer.toBinaryString(j));
		System.out.println("& = "+Integer.toBinaryString(i&j));
		System.out.println("| = "+Integer.toBinaryString(i|j));
		System.out.println("^ = "+Integer.toBinaryString(i^j));
	}
}
