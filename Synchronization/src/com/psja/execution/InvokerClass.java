package com.psja.execution;

import java.lang.Thread;

public class InvokerClass implements InvokerInterface {

	@Override
	public void invoke() {
		
		JobClass jobClass = new JobClass();
		ThreadClass thClass = new ThreadClass();
		thClass.setValueForThreadClass( jobClass, "Test1" );
		Thread th1 = new Thread( thClass );
		ThreadClass thClass2 = new ThreadClass();
		thClass2.setValueForThreadClass( jobClass, "Test2" );
		Thread th2 = new Thread( thClass2 );
		
		th1.start();
		th2.start();
	}
}
