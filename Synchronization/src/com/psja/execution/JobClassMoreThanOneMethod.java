package com.psja.execution;

import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

import java.lang.Thread;
import java.lang.FunctionalInterface;
import java.lang.InterruptedException;

@FunctionalInterface
interface CheckInterface{
	public void check( String data );
}

public class JobClassMoreThanOneMethod {

	private String dis = "The output above ";
	
	public static synchronized void jobI() {
		
		Stream< Stream<Integer> > integerStream = Stream.of( Stream.of( 1, 2 ), 
																Stream.of( 3, 4 ), 
																Stream.of( 5, 6 ),
																Stream.of( 7, 8 ) );
		
		String dis = "The inside data";
		JobClassMoreThanOneMethod jb = new JobClassMoreThanOneMethod();
		Consumer< Integer > cons = ( data )->{
										System.out.println( jb.dis + data + " The thread name is: " + 
																Thread.currentThread().getName()  );
										try {
											Thread.currentThread().sleep(2000);
										}catch( InterruptedException exp ) {
											System.out.println( Thread.currentThread().getName() + " is interrupted" );
										}
									};
		
		integerStream
					.flatMap( ( data )-> data.map( (data2)-> data2 + 10 ) )
					.collect( Collectors.toList() )
					.forEach( cons );
		
	}
	
	public static synchronized void jobC() {
		
		List< String > chList = Arrays.asList( "a", "b", "c", "d", "e" );
		
		
		String dis = "The inside data ";
		CheckInterface ch = ( data )->{
								System.out.println( dis + data + " Thread data: " + Thread.currentThread().getName() );
								try {
									Thread.currentThread().sleep( 2000 );
								}catch( InterruptedException exp ) {
									System.out.println( Thread.currentThread().getName()+ " is interrupted" );
								}
								
							};
		
		chList
			.stream()
			.map( data-> data.toUpperCase() )
			.collect( Collectors.toList() )
			.forEach( ch::check );
	}
}
