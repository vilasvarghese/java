package multithreading;

public class WorkerThread implements Runnable{

	private static volatile int runOrder = 1;
	String threadName;
	int threadCount = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =0; i < 10; i++) {
			boolean printCompletionStatus = true;
			while(printCompletionStatus) {
				//System.out.println("runOrder "+runOrder +", threadCount "+threadCount);
				if (runOrder == this.threadCount) {
					System.out.println(threadName +", "+i);
					if (runOrder == 2) {
						runOrder = 1;
					}else {
						runOrder = 2;
					}
					printCompletionStatus = false;
				}
			}
		}
	}
	
	public WorkerThread(String name, int threadCount) {
		this.threadName = name;
		this.threadCount = threadCount;
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new WorkerThread("Thread1", 1));
		Thread t2 = new Thread(new WorkerThread("Thread2", 2));
		//at this point there is only one thread - main thread
		t1.start();//during this also main thread can get executed
		//now you have 2 threads, main and t1. t1 is started by main
		t2.start();//during this t1 and main can get executed.
		//now you have 3 threads, main, t2 and t1. t2 is also started by main
		
		System.out.println("before join");
		//t2.join();//when join is executed the thread which started t2 
		//(i.e main thread will wait till t2 terminates)
		System.out.println("after join");
	}

}
