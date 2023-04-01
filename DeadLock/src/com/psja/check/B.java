package com.psja.check;

import java.lang.Thread;
import static java.lang.System.out;

public class B implements Check {

	@Override
	public synchronized void Test( Check chkA ) {
		System.out.println( "*****IN THE TEST B CLASS*****: "+Thread.currentThread().getName() );
		
		try {
			Thread.currentThread().sleep( 20000 );
		} catch( InterruptedException exp ) {
			out.println( exp.getMessage() );
		}
		
		chkA.display();
	}
	
	@Override
	public synchronized void display() {
		
		out.println( "***IN DISPLAY METHOD OF B***" );
	}
}
