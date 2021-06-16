package ch03.java5.overloading;

public class OverloadingBtwBoxingAndVarArgs {

	public static void execute(Byte b1, Byte b2) {
		System.out.println("Inside execute(Byte, Byte)");
	}
	
	public static void execute(byte... b) {
		System.out.println("Inside execute(byte...)");
	}
	
	public static void main(String[] args) {
		byte b = 5;
		execute(b, b);
		/*
		 * There is no method execute(byte, byte). 
		 * JVM has two options here call execute(Byte, Byte) - this requires boxing
		 * or execute(byte...), this requires Var Args.
		 * 
		 * Designers of java decided that var args is more like a method which should get executed if
		 * all other option fails. Hence it will execute(Byte, Byte)
		 * 
		 * Output wil be "Inside execute(Byte, Byte)"
		 */
	}
}