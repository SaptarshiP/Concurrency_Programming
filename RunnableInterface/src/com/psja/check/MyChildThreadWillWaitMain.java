package com.psja.check;

import java.lang.Runnable;

public class MyChildThreadWillWaitMain implements Runnable {

	private Thread mainThread;
	
	public MyChildThreadWillWaitMain( Thread mainThread ){
		this.mainThread = mainThread;
	}
	@Override
	public void run() {
		try {
			System.out.println( "name "+mainThread.getName() );
			mainThread.join(8000);
			for ( Integer i =0; i<10; i++ ) {
				System.out.println( "The child thread will execute" );
				
			}
		} catch(InterruptedException exp) {
			System.out.println( "In the interrupted exception" );
		}
	}
}
