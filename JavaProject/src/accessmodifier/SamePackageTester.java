package accessmodifier;

public class SamePackageTester extends DefaultClass{
	public static void main(String[] args) {
		SamePackageTester s = new SamePackageTester();
		System.out.println(s.defaultInt);
		
		PublicClass pc = new PublicClass();
		System.out.println(pc.protectedInt);
		System.out.println(pc.defaultInt);
		System.out.println(pc.publicInt);
		
		pc.protectedMethod();
		pc.defaultMethod();
		pc.publicMethod();
		//Repeat it for all other variables and methods.
	}
}
