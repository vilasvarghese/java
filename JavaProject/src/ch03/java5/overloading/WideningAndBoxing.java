package ch03.java5.overloading;

public class WideningAndBoxing {

	static void go(Object o) {     
		Byte b2 = (Byte) o;       // ok - it's a Byte object    
		System.out.println(b2);   
	}

	public static void main(String [] args) {    
		byte b = 5;    go(b);       // can this byte turn into an Object ?  
		/*
		 * This compiles (!), and produces the output:
			5*/
		
		//go1(b);
	}
	
	static void go1(Long x) { 
		System.out.println("Long"); 
	}

	/* Why does the conversion from byte to Object work. But not from byte to Long?
	 * 
	 * Following are the steps java takes to convert from byte to Object.
	 * It first boxes byte to Byte and since Byte extends Object, it calls the method go passing byte.
	 * There is never an instance of Object created, the instance is always of type Byte which is passed around.
	 * 
	 * But for Long?
	 * java again converts byte to Byte. But Byte doesn't extend Long so it will not be able to call the method.
	 */
}