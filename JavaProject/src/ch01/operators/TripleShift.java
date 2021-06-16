package ch01.operators;

public class TripleShift {
	public static void main(String[] args) {
		int x = -1;
		System.out.println(Integer.toBinaryString(x));
		
		/*int i1 = 0b10000000000000000000000000000000;
		int i2 = 0b11111111111111111111111111111111;
		System.out.println("i1 "+i1);
		System.out.println("i2 "+i2);*/
		//Java represents -negative numbers as 2's complement.
		//i.e. complement each bit and add 1
		//so -1 is 32 1's 1111 1111 1111 1111 1111 1111 1111 1111
		byte b = (byte)x;
		bin(x);
		System.out.println(b);
		System.out.println(x);
		System.out.println(x >>> 1);
		System.out.println(x >>> 2);
		System.out.println(x >>> 3);
		System.out.println(x >>> 4);
		System.out.println(x >>> 25);
		System.out.println(x >>> 26);
		System.out.println(x >>> 27);
		System.out.println(x >>> 28);
		System.out.println(x >>> 29);
		System.out.println(x >>> 30);
		System.out.println(x >>> 31);
	}
	static void bin(int n) 
	{ 
	    /* step 1 */
	    if (n > 1) 
	        bin(n/2); 
	  
	    /* step 2 */
	    System.out.print(n % 2); 
	} 

}
