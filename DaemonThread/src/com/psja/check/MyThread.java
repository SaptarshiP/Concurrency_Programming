package com.psja.check;

import java.lang.Runnable;
import java.lang.Thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for ( Integer i = 0; i<10; i++ ) {
			try {
				System.out.println( "****IN CHILD THREAD******" );
				Thread.currentThread().sleep(2000);
			} catch( InterruptedException exp ) {
				System.out.println( exp.getMessage() );
			}
		}
		
	}
}
