package app;

import java.lang.Thread;

public class MyThread1 extends Thread {
	
	/**
	 * runs the thread using Thread class
	 */
	public void run() {
		//runs each thread and its iteration. Sleeps for 1 second
		for (int i = 0; i < 100; ++i) {
			System.out.println("MyThread1 is running iteration " + i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
