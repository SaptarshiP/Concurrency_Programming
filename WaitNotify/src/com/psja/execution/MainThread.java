package com.psja.execution;

import java.lang.Thread;

public class MainThread {

	public void ch() {
		
		Thread1 th1 = new Thread1();
		Thread thread = new Thread( th1 );
		thread.start();
		
		synchronized( thread ) {
			try {
				thread.wait();
				System.out.println( "The notification came" );
				System.out.println( th1.data );
			}catch( Exception exp ) {
				System.out.println( exp.getMessage() );
			}
		}
	}
	
}
