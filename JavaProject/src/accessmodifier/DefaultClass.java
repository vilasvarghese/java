package accessmodifier;

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
	}
	
	
}