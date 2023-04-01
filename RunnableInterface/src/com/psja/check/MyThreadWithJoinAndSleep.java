package com.psja.check;

public class MyThreadWithJoinAndSleep implements Runnable{

	@Override
	public void run() {
		for( Integer i = 0; i<10;i++ ) {
			System.out.println( "The child thread: "+Thread.currentThread().getName() );
			try {
				Thread.currentThread().sleep( 2000 );
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
