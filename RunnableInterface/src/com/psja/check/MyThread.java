package com.psja.check;

import java.lang.Thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for ( Integer i = 0; i<10; i++ ) {
			System.out.println( "In child thread name: "+ Thread.currentThread().getName() );
		}
	}
}
