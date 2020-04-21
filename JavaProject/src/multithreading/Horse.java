package multithreading;

import java.util.concurrent.*;

class Horse implements Callable {

	CountDownLatch latch;
	int index = 0;

	public Horse(CountDownLatch latch, int counter) {
		this.latch = latch;
		this.index = counter;
	}

	@Override
	public Boolean call() throws Exception {
		try {
			System.out.print("In call");
			latch.countDown();
			latch.await();
			System.out.println("Race stated by thread:" + index);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static void main(String args[]) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int counter = 1; counter <= 5; counter++) {
			executorService.submit(new Horse(latch, counter));
		}
		System.out.println("Submitted all from main... ");
		// System.out.println("Lets add a thread.sleep to simulate the sitatuion ");
		// Thread.sleep(2000);
		/*
		 * System.out.println("Set countdown to zero"); ExecutorService executorService1
		 * = Executors.newFixedThreadPool(5); for(int counter = 1; counter <= 5;
		 * counter++){ executorService1.submit(new PriancaDoubtClarifier()); }
		 * executorService1.shutdown(); latch.countDown(); Thread.sleep(5000);
		 */
		latch.countDown();
		executorService.shutdown();
	}
}
