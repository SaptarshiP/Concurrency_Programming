package com.psja.execution;

import java.lang.Thread;

public class InvokerClassStaticSynchronized implements InvokerInterface {

	@Override
	public void invoke() {
		JobClassStaticSynchronized jobClassStaticSynchronized1 = new JobClassStaticSynchronized();
		JobClassStaticSynchronized jobClassStaticSynchronized2 = new JobClassStaticSynchronized();
		
		ThreadClassSynchronized threadClassSynchronized1 = new ThreadClassSynchronized( jobClassStaticSynchronized1 );
		ThreadClassSynchronized threadClassSynchronized2 = new ThreadClassSynchronized( jobClassStaticSynchronized2 );
		
		Thread t1 = new Thread( threadClassSynchronized1 );
		Thread t2 = new Thread( threadClassSynchronized2 );
		
		t1.start();
		t2.start();
	}
	
}
