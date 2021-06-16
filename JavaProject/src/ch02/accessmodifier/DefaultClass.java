package ch02.accessmodifier;

/*
 * Private: 
 ********** 	Accessible only within the class. 
 ********** 	Cannot be accessed from outside the class.
 ******************************************************
Default: 
********** 		Accessible from the same package. 
*********** 	Cannot be accessed from outside the package. 
*********** 	If you do not specify any access level, it will be the default.
******************************************************
Protected: 
********** 		Accessible within the package and outside the package through child class. 
*********** 	If you do not make the child class, it cannot be accessed from outside the package.
******************************************************
Public: 
********** 		Accessible everywhere. 
********** 		Can be accessed from within the class, outside the class, within the package and outside the package.
******************************************************
 */
class DefaultClass {
	public int publicInt = 10;
	protected int protectedInt = 20;
	int defaultInt = 30;
	private int privateInt = 40;
	
	public void publicMethod () {
		System.out.println("This is a public method");
	}
	
	void defaultMethod () {
		System.out.println("This is a default method");
	}
	
	protected void protectedMethod () {
		System.out.println("This is a protected method");
	}
	
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	
	public static void main(String[] args) {
		DefaultClass dc = new DefaultClass();
		dc.privateMethod();
		dc.publicMethod();
		dc.protectedMethod();
		dc.defaultMethod();
		
		System.out.println(dc.defaultInt);
		System.out.println(dc.publicInt);
		System.out.println(dc.privateInt);
		System.out.println(dc.protectedInt);
	}
}

class Abc{
	public void doSomething() {
		DefaultClass d = new DefaultClass();
		d.publicMethod();
		d.defaultMethod();
		//compile time error. Class is default
		//d.protectedInt();//Class is default
		//private not visible
	}
	
	
}