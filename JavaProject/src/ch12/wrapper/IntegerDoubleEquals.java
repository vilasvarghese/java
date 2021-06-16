package ch12.wrapper;

public class IntegerDoubleEquals {
	
	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		Integer i3 = 10;
		Integer i4 = 10;
		if (i1 == i2) {System.out.println("i1 == i2");}
		if (i1 != i2) {System.out.println("i1 != i2");}
		if (i3 == i4) {System.out.println("i3 == i4");}
		if (i3 != i4) {System.out.println("i3 != i4");}
		
		//https://stackoverflow.com/questions/12871110/operator-differet-behaviour-on-wrapper-class-object
		/*
		 * public static Integer valueOf(int i) {
    	   		if(i >= -128 && i <= IntegerCache.high)
        			return IntegerCache.cache[i + 128];
    			else
        			return new Integer(i);
		   }
		 */
	}
}
