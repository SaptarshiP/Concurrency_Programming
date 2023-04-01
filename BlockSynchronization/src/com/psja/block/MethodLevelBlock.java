package com.psja.block;

import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

import java.lang.FunctionalInterface;
import java.lang.Thread;
import java.lang.InterruptedException;

@FunctionalInterface
interface Display<T>{
	public void check( T data )throws Exception;
}

public class MethodLevelBlock {

	public void check()throws Exception {
		
		System.out.println( "Above snchronized block " + Thread.currentThread().getName() );
		
		Stream< Stream <Integer> > str = Stream.of( Stream.of(1, 2),
													Stream.of(3, 4), 
													Stream.of(5, 6), 
													Stream.of(7, 8) ); 
		Predicate<Integer> predicateEven = new Predicate<Integer>(){
				@Override
				public boolean test( Integer data ) {
					return data%2 == 0;
				}
		};
		
		Display<Integer> displayInteger = ( dataInteger ) ->{
			System.out.println( Thread.currentThread().getName() + " data "+ dataInteger);
			try {
				Thread.currentThread().sleep( 2000 );
			} catch( InterruptedException exp ) {
				throw exp;
			}
		};
		
		synchronized( this ){
			List< Integer > evenInteger = str
											.flatMap( data->data.filter( predicateEven ) )
											.collect( Collectors.toList() );
			
			for ( Integer i: evenInteger )
				displayInteger.check( i );

		}
	}
	
}
