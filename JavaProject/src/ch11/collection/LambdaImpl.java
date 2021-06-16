package ch11.collection;

import java.util.ArrayList;
import java.util.List;

interface I1{
	void myMethod(String s);
}

class B1 implements I1{
	public void myMethod(String s) {
		System.out.println("Inside B "+s);
	}
}

public class LambdaImpl {

	public static void main(String[] args) {
		I1 i = new B1();
		I1 i1 = new I1() {
			public void myMethod(String s) {
				System.out.println("In annonymous class "+s);
			}
		};
		
		I1 i2 = (s) -> System.out.println("In annonymous class "+s);
		
		LambdaImpl l = new LambdaImpl();
		
		l.cook(i);
		l.cook(new I1() {
			public void myMethod(String s) {
				System.out.println("from cook annoymous class");
			}
		});

		l.cook(s -> System.out.println("from cook annoymous class"));
	}
	
	public void cook(I1 i1) {
		i1.myMethod("From cook");
	}
}
