package ch02.accessmodifier;

public class TransientClass {

	private static transient int transientVariable = 100;
	
	public strictfp double exampleOfStrictFP() {
		return 0.0f;
	}
	
	public static void main(String args[]) throws Exception{
		System.out.println(transientVariable);
		for (int i = 0; i < 100; i++) {
			transientVariable++;
			if (i == 10) {
				//Serialization
			}
			//Deserializing it here
			
		}
	}
}

//0/1

//Old computer 1 - 0.0000005
//New computer 2 - 0.00000000001234234009
//1 - 0.0000000
//2 - 0.00000000001234234009

//100000000000000000000000