package com.psja.check;

import java.lang.Thread;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface CheckInterface{
	public void check();
}

public class MyThreadWithName implements Runnable {

	@Override
	public void run() {
		
		CheckInterface ch = new CheckInterface() {
			public void check() {
				System.out.println( "In the child method: "+Thread.currentThread().getName() );
			}
			
		};
		Integer t = 0;
		for (;t<10;) {
			ch.check();
			t++;
		}
	}
}
