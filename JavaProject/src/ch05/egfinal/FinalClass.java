package ch05.egfinal;

final class FinalEg {

	final int I = 0;

	public final void doSomething() {
		// I = 50;
		System.out.println("doSomething");
	}

}

public class FinalClass {// extends FinalEg not possible

	/*
	 * public final void doSomething() {
	 * 
	 * }
	 */

}
