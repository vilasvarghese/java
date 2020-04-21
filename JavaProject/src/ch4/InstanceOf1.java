package ch4;

public class InstanceOf1 extends ClassA{
	public InstanceOf1(String s) {
		//System.out.println("Testing");
		//super();
	}

	public static void main(String[] args) {
		 ClassA a = new ClassA(); 
		 InstanceOf1 b = new InstanceOf1("");
		 System.out.println("With interface "+(a instanceof InterfaceA)); 
		 System.out.println("With Class "+(b instanceof ClassA)); 
		 System.out.println("Child with Interface "+(b instanceof InterfaceA));  // implemented indirectly		
		 ClassA c = null;
		 System.out.println("How about null?"+(null instanceof ClassA));
		 System.out.println("How about null ref?"+(c instanceof ClassA));
		 System.out.println("Normal ref?"+(a instanceof ClassA));
	}
}

interface InterfaceA { } 

class ClassA implements InterfaceA { } 

