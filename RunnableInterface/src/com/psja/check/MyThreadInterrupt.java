package com.psja.check;

import java.lang.Thread;
import java.lang.Runnable;
import static java.lang.System.out;

public class MyThreadInterrupt implements Runnable{

	private Thread mainThread;
	
	public MyThreadInterrupt( Thread mainThread ){
		this.mainThread = mainThread;
	}
	@Override
	public void run() {
		try {
			this.mainThread.join(8000);
			//this.mainThread.interrupt();
			for ( Integer i = 0; i<10; i++ ) {
				out.println( "The child thread after interrupting" );
				
			}
			
		} catch( Exception exp ) {
			for ( Integer i = 0; i<10; i++ )
				System.out.println( "The interrupted exception" );
		}
	}
		
}
