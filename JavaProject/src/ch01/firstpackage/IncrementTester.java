package ch01.firstpackage;

public class IncrementTester {
	public static void main(String[] args) {
		int i = 10;
		int j = ++i + i++;
		System.out.println("j "+j);
		System.out.println("i "+i);

		j = 5;
		int k = j++ + (++j * ++j);
		System.out.println("k "+k);
		System.out.println("j "+j);
	}
}
