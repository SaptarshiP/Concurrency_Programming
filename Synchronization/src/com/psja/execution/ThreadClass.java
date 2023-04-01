package com.psja.execution;

import java.lang.Runnable;

public class ThreadClass implements Runnable{

	private JobClass jobClass;
	private String name;
	
	public void setValueForThreadClass( JobClass jobClass, String name ) {
		this.jobClass = jobClass;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		this.jobClass.wish( name );		
	}
}
