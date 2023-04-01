package com.psja.check;

import java.lang.Runnable;
import java.lang.Thread;
import static java.lang.System.out;

public class MyThreadWithYield implements Runnable{

	public void run() {
		//Thread.yield();
		for ( Integer i = 0; i<10; i++ ) {
			out.println( Thread.currentThread().getName() + ":"+ i );
		}
	}
	
}
