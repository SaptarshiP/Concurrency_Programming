package com.psja.check;

import java.lang.Runnable;

public class Invoker implements Runnable {

	private Check a = new A();
	private Check b = new B(); 
	
	public void invoke() {
		
		
		Thread th = new Thread( new Invoker() );
		th.start();
		a.Test( b );
	}
	
	@Override
	public void run() {
		b.Test( a );
	}
}
