package operators;

public class ShiftOperator {

	static int i = 10;
	static int j = 20;
	
	public static void main(String[] args) {
		//System.out.println(i << 1);
		int k = i << 1;
		System.out.println("i = "+i +", In Binary = "+Integer.toBinaryString(i));
		System.out.println("i << 1 = "+k+", In Binary = "+Integer.toBinaryString(k));
		k = j >> 1;
		System.out.println("j  = "+j+", In Binary = "+Integer.toBinaryString(j));
		System.out.println("j >> 1 = "+k+", In Binary = "+Integer.toBinaryString(k));
		
		int m = Integer.MIN_VALUE;
		System.out.println("m "+m +", "+Integer.toBinaryString(m));
		System.out.println("i >> 1 "+ (m >> 1) + "In Binary "+Integer.toBinaryString(m>>1));
		System.out.println("i >>> 1 "+ (m >>> 1) + "In Binary "+Integer.toBinaryString(m>>>1));
		//input is 	   10000000000000000000000000000000
		//output of >> 11000000000000000000000000000000
		//output of >>>01000000000000000000000000000000
	}
}
