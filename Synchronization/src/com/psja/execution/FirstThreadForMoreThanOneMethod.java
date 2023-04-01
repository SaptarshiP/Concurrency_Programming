package com.psja.execution;

import java.lang.Runnable;

public class FirstThreadForMoreThanOneMethod implements Runnable {

	private JobClassMoreThanOneMethod jobClassMoreThanOneMethod;
	
	public void setJobClassForMoreThanOneThread( JobClassMoreThanOneMethod jobClassMoreThanOneMethod ) {
		this.jobClassMoreThanOneMethod = jobClassMoreThanOneMethod;
	}
	
	@Override
	public void run() {
		this.jobClassMoreThanOneMethod.jobI();
	}
}
