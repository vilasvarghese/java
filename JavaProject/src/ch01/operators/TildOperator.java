package ch01.operators;

public class TildOperator {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		int b = ~a;
		System.out.println(Integer.toBinaryString(b));
	}
}
