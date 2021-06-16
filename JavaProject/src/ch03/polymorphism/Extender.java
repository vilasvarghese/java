package ch03.polymorphism;

/*
 * This is overloading and not overriding because
 * the parameter type in get is different.
 * Even if Integer extends Object, java considers it as a different type.
 * 
 * 
 */
public class Extender extends OverridingWithInherittedParameter{
	
	public void get (Integer i) {
		super.get(i);
		System.out.println(i);
	}

	
	public static void main(String[] args) {
		Extender e = new Extender();
		e.get(new Integer (5));
		e.get("Test");
	}
}
