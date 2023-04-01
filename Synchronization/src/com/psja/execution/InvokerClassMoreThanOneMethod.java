package com.psja.execution;

public class InvokerClassMoreThanOneMethod  implements InvokerInterface {

	@Override
	public void invoke() {
		
		JobClassMoreThanOneMethod jobClassMoreThanOneMethod1 = new JobClassMoreThanOneMethod();
		
		FirstThreadForMoreThanOneMethod firstThreadForMoreThanOneMethod = new FirstThreadForMoreThanOneMethod();
		firstThreadForMoreThanOneMethod.setJobClassForMoreThanOneThread( jobClassMoreThanOneMethod1 );
		
		Thread t1 = new Thread( firstThreadForMoreThanOneMethod );
		t1.start();
		t1.interrupt();
		
		JobClassMoreThanOneMethod jobClassMoreThanOneMethod2 = new JobClassMoreThanOneMethod();
		SecondThreadForMoreThanOneMethod secondThreadForMoreThanOneMethod = new SecondThreadForMoreThanOneMethod( jobClassMoreThanOneMethod2 );
		Thread t2 = new Thread( secondThreadForMoreThanOneMethod );
		t2.start();
		
	} 
	
}
