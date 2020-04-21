package ch3;

import java.awt.Dimension;

public class Reference1Test {

	public static void main (String [] args) { 
		Dimension d = new Dimension(5,10); 
		Reference1Test rt = new Reference1Test(); 
		System.out.println("Before modify() d.height = "+ d.height); 
		rt.modify(d); 
		System.out.println("After modify() d.height = "+ d.height); 
		int t = 5;
		rt.modify(t);
		System.out.println("After modify() t = "+ t); 
	}

	void modify(Dimension dim) { 
		dim.height = dim.height + 1; 
		System.out.println("dim = " + dim.height); 
	}
	
	void modify(int x) {
		x++;
	}
}
