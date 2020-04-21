package accessmodifier.test;

import accessmodifier.PublicClass;

public class DifferentPackageExtender extends PublicClass{

	public static void main(String[] args) {
		PublicClass.main(null);
		PublicClass p = new PublicClass();
		DifferentPackageExtender d = new DifferentPackageExtender();
		System.out.println(p.publicInt);
		//System.out.println(d.defaultInt);//default instance variables are not visible outside
		
		//System.out.println(p.protectedInt);//protected instance variables are visible only to the child or with in the same package
		//But since the above access is through an instance of Public class from a different package, java doesn't know about it.
		
		System.out.println(d.protectedInt);//this works because the jvm can understand that d extends PublicClass
		//System.out.println(p.privateInt);//private variables are visible only with in the same class
		
		p.publicMethod();
		//p.defaultMethod();//default methods are not visible outside the package
		//p.protectedMethod();//protected methods are visible only to the child or with in the same package
		//p.privateMethod();//private methods are visible only with in the same class
		
	}

}
