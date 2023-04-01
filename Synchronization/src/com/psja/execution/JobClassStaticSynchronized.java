package com.psja.execution;

import java.lang.FunctionalInterface;
import static java.lang.System.out;
import java.lang.InterruptedException;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Check{
	public void displayData( Integer value );
}

public class JobClassStaticSynchronized {

	public static synchronized void job() {
		
		String dis = " The count is : ";
		
		Check ch = new Check() {
			
			public void displayData( Integer value ) {
				out.println( dis + value + "Thread name: " + Thread.currentThread().getName() );
				try {
					Thread.currentThread().sleep( 2000 );
				} catch( InterruptedException exp ) {
					out.println( "The thread is interrupted" );
				}
			}
		};
		List< Integer > i = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9 );
		Function< Integer, Integer > fun = ( data )->{
			return data + 10;
		};
		
		
		i.stream()
			.map( num ->fun.apply( num ) )
			.collect( Collectors.toList() )
			.forEach( ch::displayData );
			
		
		
	}
	
}
