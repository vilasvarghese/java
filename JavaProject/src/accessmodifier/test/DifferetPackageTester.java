package accessmodifier.test;

import accessmodifier.*;


public class DifferetPackageTester {
	public static void main(String[] args) {
		//PublicClass.main(null);
		PublicClass p = new PublicClass();
		System.out.println(p.publicInt);
		//System.out.println(p.de);//default instance variables are not visible outside the package
		//System.out.println(p.);//protected instance variables are visible only to the child or with in the same package
		//System.out.println(p.l);//private variables are visible only with in the same class
		
		p.publicMethod();
		//p.defaultMethod();//default methods are not visible outside the package
		//p.protectedMethod();//protected methods are visible only to the child or with in the same package
		//p.privateMethod();//private methods are visible only with in the same class
	}
	
	public void nonStaticMethod(PublicClass p1) {
		PublicClass p = new PublicClass();
		//System.out.println(p1.k);
		//System.out.println(p.k);
		
	}
}
