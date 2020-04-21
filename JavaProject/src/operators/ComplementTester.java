package operators;

public class ComplementTester {

	public static void main(String[] args) {
		//! - Logical not operator
		//! stands for not operator or negation.
		//This can be applied to boolean variables only
		//converts true to false and false to true
		boolean b = true;
		System.out.println(!b);
		
		//~ - Bitwise complement operator
		//Returns the 1's complement
		//Convert all bitwise 1's to 0 and 0's to 1
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		int aComplement = ~a;
		System.out.println(Integer.toBinaryString(aComplement));
	}
}
