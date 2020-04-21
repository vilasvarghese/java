package java5;

import java.util.ArrayList;

public class GenericsImpl {

	public static void main(String[] args) {
		MathOperation<Integer> m = new MathOperation();
		m.square(28);
		
		MathOperation<Float> m1 = new MathOperation();
		m1.square(28f);
		
		Container<Integer> c = new Container<>();
		c.print(30);
		
		Container<String> ca = new Container();
		ca.print("hello");
		
		Container1<Integer> c1 = new Container1();
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(3);
		c1.print(aList);
		c1.printSquare(5);
	}
	
}

class Container<A>{
	private A value;
	public A getValue() {
		return value;
	}
	public void setValue(A value) {
		this.value = value;
	}
	public void print(A t1) {
		System.out.println(t1.toString());
	}
}

class Container1<T extends Number>{
	
	public void printSquare(T no){
		int i = (int)no;
		System.out.println(i * i);
	}
	
	public void print(ArrayList<? extends T> myList) {
		System.out.println(myList);
	}
}

class MathOperation<C extends Number>{
	public void square(C a) {
		//int b = (int)a;
		//return (int)b*b;
		System.out.println(a);
	}
}