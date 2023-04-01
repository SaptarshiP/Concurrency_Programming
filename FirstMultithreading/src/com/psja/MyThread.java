package com.psja;

import java.util.function.Consumer;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		Consumer<Integer> checkFunctional = (t)->System.out.println("In child thread"+t);
		for ( Integer i=0; i<10; i++ ) {
			checkFunctional.accept( i );
		}
	}

}
