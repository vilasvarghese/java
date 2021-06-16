package ch11.collection;

public class MyClass implements Vehicle {

	@Override
	public void move() {
		System.out.println("I am moving");
	}
}

interface Vehicle{
	public void move();
}