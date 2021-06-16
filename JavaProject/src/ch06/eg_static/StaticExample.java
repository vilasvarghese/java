package ch06.eg_static;

public class StaticExample {
	static int i = 10;
	
	public static void main(String[] args) {
		//System.out.println(++StaticExample.i);
		
		StaticExample se = new StaticExample();
		System.out.println(++se.i);
		StaticExample se1 = new StaticExample();
		System.out.println(++se1.i);
		//System.out.println(StaticExample.i);
			
	}
}
