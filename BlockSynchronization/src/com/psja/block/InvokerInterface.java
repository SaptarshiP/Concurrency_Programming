package com.psja.block;

public interface InvokerInterface {

	public default void invoke() {
		System.out.println( "In the invoker interface" );
	}
	
}
