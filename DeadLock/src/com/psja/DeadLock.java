package com.psja;

import static java.lang.System.out;
import com.psja.check.Invoker;

public class DeadLock {

	public static void main( String args[] ) {
		out.println( "In the Deadlock" );
		
		Invoker invoker = new Invoker();
		invoker.invoke();
	}
	
}
