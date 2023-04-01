package com.psja.block;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ClassLevelBlock {

	public void check() {
		
		Predicate< Integer > oddPredicate = ( data )-> data%2 != 0;	
		
		Stream< Stream<Integer> > str = Stream.of( Stream.of( 1, 2 ),
													Stream.of( 3, 4 ),
													Stream.of( 5, 6 ),
													Stream.of( 7, 8 ) );
		
		Function< Integer, Integer > fun = new Function<Integer, Integer>() {
			public Integer apply( Integer data ) {
				return data;
			}
		};
		Consumer< Integer > cons = ( data )->{
			try {
				System.out.println( "Thread name: " + Thread.currentThread().getName() + " data: " + data );
				Thread.currentThread().sleep( 2000 );
			} catch( InterruptedException exp ) {
				System.out.println( exp.getMessage() );
			}
		};
		synchronized( ClassLevelBlock.class ) {
		
			str
			.flatMap( data-> data.map( fun::apply ) )
			.filter( oddPredicate )
			.forEach( cons::accept );
		}
	}
	
}
