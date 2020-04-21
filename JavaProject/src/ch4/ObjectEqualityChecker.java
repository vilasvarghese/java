package ch4;

public class ObjectEqualityChecker {
	public static void main(String[] args) {
		String s1 = "Testing";
		String s2 = "Testing";
		String s3 = s1;
		
		if (s1 != s2) {
			System.out.println("They don't refer to same object even if value is same.");
		}else {
			System.out.println("s1 and s2 refer to the same object");
		}
			
		if (s1 == s2) {
			System.out.println("s1 and s3 refer to the same object");
		}
	}
}
