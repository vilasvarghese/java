package ch3;

public class StringAssignmentTest {

	public static void main(String [] args) {    
		String x = "Java";  // Assign a value to x    
		String y = x;       // Now y and x refer to the same                         
		System.out.println("y string = " + y);    
		x = x + " Bean";    // Now modify the object using                         // the x reference
		System.out.println("y string = " + y);
		x = x.toUpperCase();
		System.out.println("y string = " + y);
	}
	    //The output of this is Java thrice. 
		//That is because when we modify the value of x, it creates a different object
		//It may or may not create a new object though, because String objects come from a String pool.
		//Even when you do toUpperCase, it creates a new object and return. So the value of y remains the same.
}
