package com.psja.execution;

import java.lang.Runnable;
import java.util.function.BiFunction;

public class Thread1 implements Runnable{

	public Integer data = 0;
	@Override
	public void run() {
		
		BiFunction< Integer, Integer, Integer > biFunction = ( data1, data2 )-> {
													try {
														System.out.println( "WAITING........" );
														Thread.currentThread().sleep(2000);
													} catch( Exception exp ) {
														System.out.println( exp.getMessage() );
													}
													return data1 + data2;
											};
		synchronized( this ) {
			for ( Integer i = 0; i<10; i++ )
				data = biFunction.apply(data, i);
			this.notify();
		}
	}
	
}
