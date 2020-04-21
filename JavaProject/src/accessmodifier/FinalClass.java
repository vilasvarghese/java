package accessmodifier;

public final class FinalClass {
	public int i = 10;
	int j = 20;
	protected int k = 30;
	private int l = 40;
	
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
		FinalClass p = new FinalClass();
		System.out.println(p.i);
		System.out.println(p.j);
		System.out.println(p.k);
		System.out.println(p.l);
		
		p.publicMethod();
		p.defaultMethod();
		p.protectedMethod();
		p.privateMethod();
	}

}
