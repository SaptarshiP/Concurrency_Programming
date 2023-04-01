package com.psja.execution;

import java.lang.InterruptedException;

public class JobClass {

	public synchronized void wish( String name ) {
		
		try {
			for ( Integer i = 0; i<10; i++ ) {
				System.out.println( "Happy birthday Name:"+ name + " Thread name: "+ Thread.currentThread().getName() );
				Thread.currentThread().sleep( 2000 );
			}
		} catch( InterruptedException exp ) {
			System.out.println( "The exception is interrupted" );
		}
	}
		
}
