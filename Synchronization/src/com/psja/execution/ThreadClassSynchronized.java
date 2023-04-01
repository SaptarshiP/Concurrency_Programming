package com.psja.execution;

import java.lang.Runnable;

public class ThreadClassSynchronized implements Runnable{

	private JobClassStaticSynchronized jobClassStaticSynchronized;
	
	ThreadClassSynchronized( JobClassStaticSynchronized jobClassStaticSynchronized ){
		this.jobClassStaticSynchronized = jobClassStaticSynchronized;
	}
	
	@Override
	public void run() {
		this.jobClassStaticSynchronized.job();
	}
	
	
}
