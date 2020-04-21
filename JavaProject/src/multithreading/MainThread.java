package multithreading;

public class MainThread {

	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new WorkerThread("Thread1", 1));
		Thread t2 = new Thread(new WorkerThread("Thread2", 2));
		//at this point there is only one thread - main thread
		t1.start();//during this also main thread can get executed
		//now you have 2 threads, main and t1. t1 is started by main
		t2.start();//during this t1 and main can get executed.
		//now you have 3 threads, main, t2 and t1. t2 is also started by main
		
		System.out.println("before join");
		t2.join();//when join is executed the thread which started t2 
		//(i.e main thread will wait till t2 terminates)
		System.out.println("after join");
	}
}
