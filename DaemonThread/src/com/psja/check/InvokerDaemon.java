package com.psja.check;

import java.lang.Thread;

public class InvokerDaemon {

	public static void invoke() {
		
		MyThread myThread = new MyThread();
		Thread th1 = new Thread( myThread );
		th1.setDaemon( Boolean.TRUE );
	
		th1.start();
		System.out.println( "******END OF MAIN THREAD*******" );
	}
	
}
