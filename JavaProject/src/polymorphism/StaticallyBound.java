package polymorphism;

class GrandFather{
	int i = 10;
	/*public GrandFather() {
		System.out.println("GrandFather's constructor");
		// TODO Auto-generated constructor stub
	}*/
	public GrandFather(String name) {
		
	}
	public void doSomething() {
		System.out.println("Inside grandfather");
	}
}

class Father extends GrandFather{
	int i = 20;
	public Father() {
		super("do something");
		System.out.println("Father's constructor");
		// TODO Auto-generated constructor stub
	}
	public void doSomething() {
		System.out.println("Inside Father");
	}
}

public class StaticallyBound extends Father{
	int i = 30;
	public StaticallyBound() {
		super();
		System.out.println("SB's constructor");
		// TODO Auto-generated constructor stub
	}
	//variables - statically bound
	//methods - dynamically bound
	public void doSomething() {
		super.doSomething();
		System.out.println("Inside SB");
	}
	
	public static void main(String[] args) {
		GrandFather sb = new StaticallyBound();
		System.out.println(sb.i);
		StaticallyBound sb1 = new StaticallyBound();
		System.out.println("sb1 "+sb1.i);
		sb.doSomething();
		print(sb);
		//print (new GrandFather(" "));

		StaticallyBound sb5 = new StaticallyBound();
		GrandFather g1 = sb5;
		StaticallyBound sb6 = (StaticallyBound)g1;
	}
	
	public static void print(GrandFather g) {
		System.out.println(g.i);
		g.doSomething();
		
		StaticallyBound sb2 = (StaticallyBound)g;
	}
}
