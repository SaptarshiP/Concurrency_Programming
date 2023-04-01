package com.psja.execution;

import java.lang.Runnable;
import java.util.function.Consumer;

public class ProducerThread<T> implements Runnable  {

	private Job<T> job;
	private T data;
	public void setJobThread( Job<T> job ) {
		this.job = job;
	}
	public void setData( T data ) {
		this.data = data;
	}
	
	@Override
	public void run() {
		
		synchronized( job ) {
			
			Consumer< T > cons = ( data )->{
											job.add(data);
											try {
												Thread.currentThread().sleep(2000);
											} catch( Exception exp ) {
												System.out.println( exp.getMessage() );
											}
			};

			cons.accept( this.data );
			System.out.println( "****PRODUCER THREAD DONE IT'S WORK*****" );
			job.notify();
		}
	}
	
}
