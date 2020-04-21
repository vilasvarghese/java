package ch3;

public class OverloadingBtwBoxingAndWidening {

	public static void execute(Integer i) {
		System.out.println("Inside execute(Integer)");
	}
	
	public static void execute(long l) {
		System.out.println("Inside execute(long)");
	}
	
	public static void main(String[] args) {
		int i = 10;
		execute(i);
		/*
		 * There is no method execute(int). 
		 * JVM has two options here call execute(Integer) - this requires boxing
		 * or execute(long), this requires widening.
		 * 
		 * Since widening was a feature available before Java 5, the designers of Java decided to maintain
		 * backward compatibility. So, it will execute(long)
		 * 
		 * Output wil be "Inside execute(long)"
		 */
	}

}
