package java5;

import java.util.ArrayList;
import java.util.List;

public class GenericsImpl {

	public static void main(String[] args) {
		MathOperation m1 = new MathOperation();
		m1.square(29f);
		
		Container<Integer> c = new Container<>();
		c.print(30);
		
		Container<String> ca = new Container();
		ca.print("hello");
		
		Container1<Integer> c1 = new Container1();
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(3);
		c1.print(aList);
		c1.printSquare(5);
		
		WildCardUsage w = new WildCardUsage();
		List<Integer> intList = new ArrayList<Integer>();
		w.insertElements(intList, 2, 3);
		w.processElements(intList);
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
		
		System.out.println(no);
	}
	
	public void print(ArrayList<? extends T> myList) {
		System.out.println(myList);
	}
}

class MathOperation{
	public <C extends Number> void square(C a) {
		//int b = (int)a;
		//return (int)b*b;
		System.out.println(a);
	}
}

/*
Three ways to define a collection (variable) using generic wildcards.
These are:

	List<?>           listUknown = new ArrayList<A>();
	List<? extends A> listUknown = new ArrayList<A>();
	List<? super   A> listUknown = new ArrayList<A>();



Unknown Wildcard
	List<?> means a list typed to an unknown type.
		Rarely used and not very effective.

extends Wildcard 
	List<? extends A>
	
super Wildcard	
	List<? super A>

*/

class WildCardUsage{
	public void processElements(List<? extends Number> elements){
	   for(Number n : elements){
		  System.out.print(n + " " );
	   }
	   System.out.println();
	}
	
	public static void insertElements(List<? super Integer> list, Integer a, Integer b){
		list.add(a);
		list.add(b);
	}
}
