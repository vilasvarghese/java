package multithreading;

public class WhileTrue {

	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			System.out.println("This is infinite loop");
			if (true) {
				flag = false;
			}
		}
	}
}
