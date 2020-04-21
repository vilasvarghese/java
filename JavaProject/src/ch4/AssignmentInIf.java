package ch4;

public class AssignmentInIf {
	public static void main(String[] args) {
		boolean b = false;
		if (b = true) {//this will be always true. 
			//java will assign the value true to b and check
			System.out.println("This condition will be always true");
		}
		
		int x = 10;
		//if (x = 20) This will not compile as assignment with in an if
		//can happen only for a boolean value.
	}
}