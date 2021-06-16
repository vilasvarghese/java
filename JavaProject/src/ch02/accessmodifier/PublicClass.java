package ch02.accessmodifier;

public class PublicClass {
	public int publicInt = 10;
	int defaultInt = 20;
	protected int protectedInt = 30;
	private int privateInt = 40;
	
	public void publicMethod() {
		System.out.println("I am a public method");
	}
	protected void protectedMethod() {
		System.out.println("I am a protected method");
	}
	void defaultMethod() {
		System.out.println("I am a default method");
	}
	private void privateMethod() {
		System.out.println("I am a private method");
	}
	public static void main(String[] args) {
		PublicClass p = new PublicClass();
		System.out.println(p.privateInt);
		System.out.println(p.defaultInt);
		System.out.println(p.protectedInt);
		System.out.println(p.publicInt);
		
		p.publicMethod();
		p.defaultMethod();
		p.protectedMethod();
		p.privateMethod();
	}
}
