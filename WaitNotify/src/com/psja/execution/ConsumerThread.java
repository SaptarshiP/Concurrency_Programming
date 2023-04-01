package com.psja.execution;

import java.lang.Runnable;
import static java.lang.System.out;

import java.util.function.Consumer;

public class ConsumerThread<T> implements Runnable {

	private Job<T> job;
	ConsumerThread( Job<T> job ){
		this.job = job;
	}
	@Override
	public void run() {
		
		synchronized( this.job ) {
			if ( this.job.queue.isEmpty() ) {
				try {
					out.println( "WAITING......." );
					this.job.wait();
					out.println( "******NOTIFICATION CAME******" );
					retrieveData();
				} catch( Exception exp ) {
					System.out.println( exp.getMessage() );
				}
			} else {
				retrieveData();
			}
		}
	}
	
	private void retrieveData() {
		Consumer<T> cons = ( data )-> System.out.println( data );
		cons.accept( this.job.retrieve() );
	}
}
