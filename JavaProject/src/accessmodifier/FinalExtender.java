package accessmodifier;

public class FinalExtender extends FinalModifier
{
	public final int finalInt = 50;
	
	/*Cannot override a final method.
	 * public void finalMethod() {
		System.out.println("This is an overridden final Method");
	}*/


	public static void main(String[] args) {
		FinalExtender fe = new FinalExtender();
		System.out.println(fe.finalInt);
		fe.finalMethod();
		
	}
}
