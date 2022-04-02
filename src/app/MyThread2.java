package app;

public class MyThread2 implements Runnable {
	
	/**
	 * runs the thread using Runnable interface
	 */
	public void run() {
		//runs each thread and its iteration. Sleeps for 0.5 seconds
		for (int i = 0; i < 100; ++i) {
			System.out.println("MyThread2 is running iteration " + i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
