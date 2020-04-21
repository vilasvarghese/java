package ch4;

public class InstanceOf extends A{
	public static void main (String [] args) {    
		A myA = new InstanceOf();    
		m2(myA);  
	}  
	
	public static void m2(A a) {     
		if (a instanceof InstanceOf)      
			((InstanceOf)a).doBstuff();     // downcasting an A reference                              // to a B reference  
	}		  
	public static void doBstuff() {     
			System.out.println("'a' refers to a B"); 
	}
}
class A { } 