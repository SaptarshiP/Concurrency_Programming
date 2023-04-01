package com.psja.execution;

import java.lang.Runnable;

public class SecondThreadForMoreThanOneMethod implements Runnable {

	private JobClassMoreThanOneMethod jobClassMoreThanOneMethod;
	
	SecondThreadForMoreThanOneMethod( JobClassMoreThanOneMethod jobClassMoreThanOneMethod ){
		this.jobClassMoreThanOneMethod = jobClassMoreThanOneMethod;
	}
	
	@Override
	public void run() {
		this.jobClassMoreThanOneMethod.jobC();
	}
}
