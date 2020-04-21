package ch3;

public class Prob3ShadowingVariables {

	static int anInt = 10;
	
	public static void updateInt(int anInt) {
		System.out.println("input "+anInt);
		anInt = anInt + 100;
		System.out.println("updated as "+anInt);
	}
	
	public static void main(String[] args) {
		updateInt(anInt +10);
		System.out.println("my int remains as "+ anInt);
	}
	
	//block variable shadows the instance variable. 
	//Many times this can cause confusion and you would end up debugging 
	//Same can happen with references and it would be very difficult to figure out.
}
