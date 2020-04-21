package innerclass;

//Example of Nested non-static inner class
class Outer_Demo {
	   int num;
	   
	   // inner class
	   private class Inner_Demo {
	      public void print() {
	         System.out.println("This is a private inner class");
	      }
	   }
	   
	   class DefaultClass{
		      public void print() {
			         System.out.println("This is a default inner class");
			  }		   
	   }

	   public class PublicInnerClass{
		      public void print() {
			         System.out.println("This is a public inner class");
			  }		   
	   }
	   
	   protected class ProtectedInnerClass{
		      public void print() {
			         System.out.println("This is a protected inner class");
			  }		   
	   }
	   
	   // Accessing he inner class from the method within
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }
	}
	   
	public class SimpleDemo {

	   public static void main(String args[]) {
	      // Instantiating the outer class 
	      Outer_Demo outer = new Outer_Demo();
	      // Accessing the display_Inner() method.
	      outer.display_Inner();

	      Outer_Demo.ProtectedInnerClass pc = outer.new ProtectedInnerClass();
	      pc.print();
	      
	      Outer_Demo.DefaultClass dc = outer.new DefaultClass();
	      dc.print();
	   }
	}