package multithreading;

import java.util.concurrent.Callable;

public class PriancaDoubtClarifier implements Callable{

	@Override
	public Object call() throws Exception {
		System.out.println("I should study better");
		return null;
	}
	
}
