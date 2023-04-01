package com.psja;

import static java.lang.System.out;

import com.psja.check.InvokerDaemon;

public class DaemonThread {

	public static void main( String args[] ) {
		out.println( "****DAEMON THREAD****" );
		
		InvokerDaemon.invoke();
	}
}
