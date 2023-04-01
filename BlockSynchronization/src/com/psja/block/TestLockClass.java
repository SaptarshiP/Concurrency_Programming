package com.psja.block;

import static java.lang.System.out;

public class TestLockClass {

	public void test() {
		out.println( "The test of class level block: "+Thread.currentThread().getName() );
		try {
			Thread.currentThread().sleep( 2000 );
		} catch( Exception exp ) {
			out.println( exp.getMessage() );
		}
	}
	
}
