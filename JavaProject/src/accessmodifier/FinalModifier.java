package accessmodifier;

public class FinalModifier {
	public final int finalInt = 10;
	
	public final void  finalMethod() {
		System.out.println("This is a final Method");
	}
	
	public static void main(String[] args) {
		FinalModifier fm = new FinalModifier();
		System.out.println(fm.finalInt);
		fm.finalMethod();
	}
	
}
