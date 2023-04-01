package com.psja;

import static java.lang.System.out;

import com.psja.execution.Factory;
import com.psja.execution.InvokerClass;

public class Synchronization {

	public static void main( String args[] ) {
		out.println( "In the synchronization java method" );
		
		Factory factory = new Factory();
		factory.factoryMethod( "MULTIPLE_METHOD" );
	}
	
}
