package ch3;

public class OverloadingBtwWideningAndVarArgs {

	public static void execute(int i1, int i2) {
		System.out.println("Inside execute(int, int)");
	}
	
	public static void execute(byte... b) {
		System.out.println("Inside execute(byte...)");
	}
	
	public static void main(String[] args) {
		byte b = 5;
		execute(b, b);
		/*
		 * There is no method execute(byte, byte). 
		 * JVM has two options here call execute(int, int) - this widening
		 * or execute(byte...), this requires Var Args.
		 * 
		 * Since widening was a feature available before Java 5, the designers of Java decided to maintain
		 * backward compatibility. So, it will execute(int,int)
		 * 
		 * Output wil be "Inside execute(int, int)"
		 */
	}
}
